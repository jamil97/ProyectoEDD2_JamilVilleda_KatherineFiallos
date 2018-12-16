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
public class Node implements Serializable {

    public int cantNodos;

    public Index key[];

    public boolean isLeaf;
    
    public Node child[];

    Node() {

        key = new Index[3];
        
        child = new Node[4];
        
        isLeaf = true;
            
    }

}
