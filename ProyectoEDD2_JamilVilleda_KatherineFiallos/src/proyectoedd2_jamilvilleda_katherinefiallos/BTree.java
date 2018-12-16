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
public class BTree implements Serializable {

    private Node root;

    public BTree() {

        root = new Node();
        root.isLeaf = true;
        root.cantNodos = 0;
        root.key[0] = new Index(-1, 0);

    }

    public void insert(Index k) {

        Node r = root;
        
        if (r.cantNodos==3) {
            Node s = new Node();
            root = s;
            s.cantNodos = 0;
            s.isLeaf = false;
            s.child[0] = r;
            split(s,1,r);
            insert(s,k);
            
        } else {
            insert(r,k);
        }   
    }
    
    private void insert(Node node, Index value){
       
        
    }

}
