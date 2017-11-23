/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth.algo;

/**
 *
 * @author tjunno
 */
public class GraphBuilder {

    
    
    public Node[] GraphBuilder(int x, int y){

        Node[] g = new Node[x*y];
        for (int i = 0; i<x; i++){          
            for (int j = 0; j<y; j++){
                Node node = new Node(i,j);
                addWeights(node, x, y);
                g[i*x+y] = node;
            }
            
        }
        return g;      
    }
        public void addWeights(Node node, int x, int y){
                

            
        }
        
    
    
}
