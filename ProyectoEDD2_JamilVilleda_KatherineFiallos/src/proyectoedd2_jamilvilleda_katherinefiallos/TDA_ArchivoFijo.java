/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

import com.sun.java.util.jar.pack.ConstantPool.Index;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
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
    
    public TDA_ArchivoFijo(File File)throws IOException{
        file=File;
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() +"No es un archivo");
        }
        flujo=new RandomAccessFile(file, "rw");
        list=new LinkedList();
        arbol=new Btree();
        flujo.seek(0);
        try {
            if(file.length()>0){
                header=flujo.readInt();
                if(header != -1){
                    list.add(header);
                    Personas personas=new Personas();
                    flujo.seek(0+headerSize);
                    while(true){
                        flujo.seek((header-10)*personas.sizeOf()+headerSize);
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
        indice posicion=new indice());
    }
    
    
            
    
    
    
    
}
