/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_jamilvilleda_katherinefiallos;

import java.io.Serializable;
/**
 *
 * @author Jamil
 */
public class Index implements Serializable{
    
   private int Id;
   private int rp;
   
   public Index(int Id, int rp){
       
       this.Id = Id;
       this.rp = rp;
   }
   
   public Index(){
   
   }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getRp() {
        return rp;
    }

    public void setRp(int rp) {
        this.rp = rp;
    }

    @Override
    public String toString() {
        return "Index{" + "Id=" + Id + ", rp=" + rp + '}';
    }
   
   
   
}
