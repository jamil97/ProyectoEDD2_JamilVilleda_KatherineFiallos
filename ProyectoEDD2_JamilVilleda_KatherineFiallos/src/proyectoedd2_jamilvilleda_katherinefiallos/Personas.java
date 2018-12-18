/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

/**
 *
 * @author KATHERINE
 */
public class Personas {
    private int id;
    private String name;
    private String birthdate;
    private String place;
    private String name_father;
    private String name_mother;
    
    private char borrado;
    private int referencia;

    public Personas(int id, String name, String birthdate, String place, String name_father, String name_mother) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.place = place;
        this.name_father = name_father;
        this.name_mother = name_mother;
        this.borrado = '-';
        this.referencia = 0;
    }

    public Personas() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        for (int i =name.length(); i < 40; i++) {
            name+=" ";
            
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName_father() {
        return name_father;
    }

    public void setName_father(String name_father) {
        this.name_father = name_father;
    }

    public String getName_mother() {
        return name_mother;
    }

    public void setName_mother(String name_mother) {
        this.name_mother = name_mother;
    }

    public char getBorrado() {
        return borrado;
    }

    public void setBorrado(char borrado) {
        this.borrado = borrado;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    public int sizeOf(){
        int size=68;
        return size;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", place=" + place + ", name_father=" + name_father + ", name_mother=" + name_mother + '}';
    }

    
    
    
    
       
    
}
