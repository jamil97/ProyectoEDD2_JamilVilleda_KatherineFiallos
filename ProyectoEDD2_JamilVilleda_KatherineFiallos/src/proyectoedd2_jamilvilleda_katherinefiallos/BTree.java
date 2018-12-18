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
        //Empezamos el arbol desde cero con solo la raiz de nodo.
    }

    public void insert(Index k) {
        Node r = root;
        if (r.cantNodos == 3) { //Si se llena empieza la jerarquia
            Node s = new Node();//creamos una nueva raiz.
            root = s;
            s.cantNodos = 0;
            s.isLeaf = false;
            s.child[0] = r; //Lo que tenia la raiz anterior va a ser hija de la nueva raiz. 
            split(s, 1, r); //Aqui lo que hace es el hijo predecesor y sucesor
            insert(s, k);
        } else {
            insert(r, k);
        }
    }

    private void insert(Node node, Index value) {

        int i = node.cantNodos; //3

        // int i = node.cantNodos;
        if (node.isLeaf) {
            while (i >= 1 && value.getId() < node.key[i - 1].getId()) {
                node.key[i] = node.key[i - 1];
                i--;

            }
            //Hacemos una verificacion de que es menor
            //Si el valor es 1 que en el arreglo seria 0, y el id de lo que estamos insertando
            //es menor que lo que ya estaba antes de predeterminado ya, entonces empezamos a ordenar
            //las llaves.

            node.key[i] = value;
              node.cantNodos++;

        } else {
            while (i >= i && value.getId() < node.key[i - 1].getId()) {
            i--;
        }

        i++;
        if (node.child[i - 1].cantNodos == 3) {
            split(node, i, node.child[i - 1]);
            if (value.getId() > node.key[i - 1].getId()) {
                i++;
            }
        }

        insert(node.child[i - 1], value);

    }
}

private void split(Node parent, int childIndex, Node newChild) {

        Node node = new Node();
        node.isLeaf = newChild.isLeaf;
        node.cantNodos = 1;
        node.key[0] = newChild.key[2];
        if (!newChild.isLeaf) {
            node.child[1] = newChild.child[3];
            node.child[0] = newChild.child[2];
        }
        newChild.cantNodos = 1;
        for (int i = parent.cantNodos + 1; i >= childIndex + 1; i--) {
            parent.child[i] = parent.child[i - 1];
            parent.key[i - 1] = parent.key[i - 2];
        }
        parent.child[childIndex] = node;
        parent.key[childIndex - 1] = newChild.key[1];
        parent.cantNodos++;
    }

    public Index search(int k) {
        Node x = root;
        return search(x, k);
    }

    private Index search(Node node, int value) {
        int i = 1;
        while (i <= node.cantNodos && value > node.key[i - 1].getId()) {
            i++;
        }
        if (i <= node.cantNodos && value == node.key[i-1].getId()) {
            return node.key[i-1];
        }
        if (!node.isLeaf) {
            return search(node.child[i-1], value);
        }
        return null;
    }
    
    public boolean delete(int k){
        Node x = root;
        return delete(x,k);
    }
    
    public boolean delete(Node node, int value){
        int i =1;
        while(i <= node.cantNodos && value > node.key[i-1].getId()){
            i++;
        }
        if (node.isLeaf) {
            if (i<= node.cantNodos && value == node.key[i-1].getId()) {
                node.key[i-1].setId(0);
                node.key[i-1].setRp(0);
                for (int j = i-1; j < node.cantNodos-1; j++) {
                    node.key[j] = node.key[j+1];
                    if (j+1 == node.cantNodos-1) {
                        node.cantNodos--;
                    }
                }
                return true;
            }
        } else {
            return delete(node.child[i-1], value);     
        }
        return false;
    }

}
