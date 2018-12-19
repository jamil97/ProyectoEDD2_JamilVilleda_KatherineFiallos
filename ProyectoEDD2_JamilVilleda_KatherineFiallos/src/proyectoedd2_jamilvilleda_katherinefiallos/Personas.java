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
    private float salary;
    private char borrado;
    private int referencia;

    public Personas(int id, String name, String birthdate, float salary) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
        this.borrado = '-';
        this.referencia = 0;
    }

    Personas() {
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        for (int i = name.length(); i < 40; i++) {
            name += " ";
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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
        return "Personas{" + "id=" + id + ", name=" + name + ", birthday =" + birthdate + '}';
    }
    

    
    
    
    
    
       
    
}
