/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author KATHERINE
 */
public class TDA_ArchivoFijo {
    private final File file;
    private static RandomAccessFile flujo;
    private static LinkedList list;
    private static int header;
    private static final int headerSize=Integer.BYTES;
    private static BTree arbol;
    private ArrayList<Integer>AvailList = new ArrayList();
    
    public TDA_ArchivoFijo(File file)throws IOException{
        this.file=file;
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() +"No es un archivo");
        }
        flujo=new RandomAccessFile(file, "rw");
        list=new LinkedList();
        arbol=new BTree();
        flujo.seek(0);
        try {
            if(file.length()>0){
                header=flujo.readInt();
                if(header != -1){
                    list.add(header);
                    Personas personas=new Personas();
                    flujo.seek(0+headerSize);
                    while(true){
                        flujo.seek((header-1)*personas.sizeOf()+headerSize);
                        flujo.readChar();
                        header=flujo.readInt();
                        if(header!=-1){
                            list.add(0,header);
                        }
                    }
                }   
            } else{
                flujo.writeInt(-1);
            }
        } catch (Exception e) {
        }
    }
    public boolean insert(Personas personas){
        boolean created=false;
        Index posicion=new Index();
        posicion=arbol.search(personas.getId());
        if(posicion!=null){
            return false;
        }else{
            try {
                flujo.seek(0+headerSize);
                while(true){
                    if(list.isEmpty()){
                        created=true;
                        flujo.seek(file.length());
                        flujo.writeChar(personas.getBorrado());
                        flujo.writeInt(0);
                        flujo.writeInt(personas.getId());
                        flujo.writeUTF(personas.getName());
                        flujo.writeUTF(personas.getBirthdate());
                        flujo.writeUTF(personas.getPlace());
                        flujo.writeUTF(personas.getName_father());
                        flujo.writeUTF(personas.getName_mother());
                        arbol.insert(new Index(personas.getId(),(int)file.length()/personas.sizeOf()));
                        break;
                    }else{
                        flujo.seek(0);
                        created=true;
                        int pos=(int)list.remove(0);
                        int ref=0;
                        flujo.seek(personas.sizeOf()*(pos-1)+headerSize);
                        flujo.readChar();
                        ref=flujo.readInt();
                        flujo.seek(0);
                        flujo.writeInt(ref);
                        flujo.seek(personas.sizeOf()*(pos-1)+headerSize);
                        flujo.writeChar(personas.getBorrado());
                        flujo.writeInt(0);
                        flujo.writeInt(personas.getId());
                        flujo.writeUTF(personas.getName());
                        flujo.writeUTF(personas.getBirthdate());
                        flujo.writeUTF(personas.getPlace());
                        flujo.writeUTF(personas.getName_father());
                        flujo.writeUTF(personas.getName_mother());
                        arbol.insert(new Index(personas.getId(),pos));
                        break;
                    }
                }
                
            } catch (Exception e) {
            }
        }
        return created;  
    }
    
    public boolean delete(int id) throws IOException{
        Personas personas=new Personas();
        boolean found=false;
        Index rp=new Index();
        rp =arbol.search(id);
        try {
            if(rp==null){
                return found;
            }else{
                flujo.seek((rp.getRp()-1)*personas.sizeOf()+headerSize);
                personas.setBorrado(flujo.readChar());
                if(personas.getBorrado()!='*'){
                    found=true;
                    personas.setBorrado('*');
                    flujo.seek(0);
                    header=flujo.readInt();
                    if(header==-1){
                        flujo.seek(0);
                        flujo.writeInt(rp.getRp());
                        flujo.seek((rp.getRp()-1)* personas.sizeOf()+headerSize);
                        flujo.writeChar(personas.getBorrado());
                        flujo.writeInt(header);
                        list.add(0,rp.getRp());
                        arbol.delete(rp.getId());
                    }else{
                        flujo.seek(0);
                        flujo.writeInt(rp.getRp());
                        flujo.seek((rp.getRp()-1)* personas.sizeOf()+headerSize);
                        flujo.writeChar(personas.getBorrado());
                        flujo.writeInt(header);
                        list.add(0,rp.getRp());
                        arbol.delete(rp.getId());
                    }
                    return found;
                }
            }
        } catch (Exception e) {
        }
        return found;
    }
    
    public Personas search(int id)throws IOException{
        Index pos=new Index();
        pos=arbol.search(id);
        Personas buscando=new Personas();
        if(pos==null){
            return null;
        }else{
            flujo.seek((pos.getRp()-1)*buscando.sizeOf()+headerSize);
            buscando.setBorrado(flujo.readChar());
            buscando.setReferencia(flujo.readInt());
            buscando.setId(flujo.readInt());
            buscando.setName(flujo.readUTF());
            buscando.setBirthdate(flujo.readUTF());
            buscando.setPlace(flujo.readUTF());
            buscando.setName_father(flujo.readUTF());
            buscando.setName_mother(flujo.readUTF());
            return buscando;
        }
    }
    public boolean modify(Personas newPersonas,int id)throws IOException{
        Index pos=new Index();
        pos=arbol.search(id);
        System.out.println(pos.getId());
        if(pos==null){
            return false;
        }else if(pos.getId() !=newPersonas.getId()){
            flujo.seek((pos.getRp()-1)*newPersonas.sizeOf()+headerSize);
            flujo.writeChar(newPersonas.getBorrado());
            flujo.writeInt(newPersonas.getReferencia());
            flujo.writeInt(newPersonas.getId());
            flujo.writeUTF(newPersonas.getBirthdate());
            flujo.writeUTF(newPersonas.getName());
            flujo.writeUTF(newPersonas.getPlace());
            flujo.writeUTF(newPersonas.getName_father());
            flujo.writeUTF(newPersonas.getName_mother());
            arbol.delete(id);
            arbol.insert(pos);
            return true;
        }else{
            flujo.seek((pos.getRp()-1)*newPersonas.sizeOf()+headerSize);
            flujo.writeChar(newPersonas.getBorrado());
            flujo.writeInt(newPersonas.getReferencia());
            flujo.writeInt(newPersonas.getId());
            flujo.writeUTF(newPersonas.getBirthdate());
            flujo.writeUTF(newPersonas.getName());
            flujo.writeUTF(newPersonas.getPlace());
            flujo.writeUTF(newPersonas.getName_father());
            flujo.writeUTF(newPersonas.getName_mother());
            return true;
        }
    }
    public DefaultTableModel listar(DefaultTableModel model){
        try {
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            Personas personas=new Personas();
            flujo.seek(0+headerSize);
            while(true){
                personas.setBorrado(flujo.readChar());
                personas.setReferencia(flujo.readInt());
                personas.setId(flujo.readInt());
                personas.setName(flujo.readUTF());
                personas.setPlace(flujo.readUTF());
                personas.setBirthdate(flujo.readUTF());
                personas.setName_father(flujo.readUTF());
                personas.setName_mother(flujo.readUTF());
                if(personas.getBorrado()!='*'){
                    model.addRow(new Object[]{
                        personas.getId(),personas.getName(),personas.getBirthdate(),personas.getPlace(),personas.getName_father(),personas.getName_mother()});
                }
            }
            
        } catch (Exception e) {
        }
        return model;
    }
    public void escribir(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try {
            fw=new FileOutputStream("Arbol.b");
            bw=new ObjectOutputStream(fw);
            bw.writeObject(arbol);
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    public boolean cargarArbol(){
        FileInputStream inFile;
        try {
            inFile=new FileInputStream("Arbol.b");
            ObjectInputStream inputObject=new ObjectInputStream(inFile);
            Object objeto=inputObject.readObject();
            if(objeto instanceof BTree){
                arbol=(BTree)objeto;
                return true;
            }
        } catch (FileNotFoundException ex) {
        }catch(IOException| ClassNotFoundException ex){
            
        }
        return false;
        
    }
    
    
            
    
    
    
    
}
