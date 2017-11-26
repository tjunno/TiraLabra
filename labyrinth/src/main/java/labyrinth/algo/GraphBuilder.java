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

    
    /**
     * THE GraphBuilder
     * @param x
     * @param y
     * @return 
     */
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
    /**
     * Very classy way to add weights
     * @param node
     * @param x
     * @param y 
     */
    public void addWeights(Node node, int x, int y){
        if (node.getX()==1 && node.getY()==1){
            node.setWeight(new Weight(2, 1));
            node.setWeight(new Weight(4, 1));
            node.setWeight(new Weight(5, 1.4));               
        }
        if (node.getX()==x && node.getY()==y){
            node.setWeight(new Weight(6, 1));
            node.setWeight(new Weight(8, 1));
            node.setWeight(new Weight(5, 1.4));
        }
        if (node.getX()==x && node.getY()==0){
            node.setWeight(new Weight(2, 1));
            node.setWeight(new Weight(6, 1));
            node.setWeight(new Weight(5, 1.4));
        }
        if (node.getX()==0 && node.getY()==y){
            node.setWeight(new Weight(4, 1));
            node.setWeight(new Weight(8, 1));
            node.setWeight(new Weight(5, 1.4));
        }
           
        if (node.getX()!=1 && node.getY()==1){
            node.setWeight(new Weight(1, 1));
            node.setWeight(new Weight(2, 1.4));
            node.setWeight(new Weight(5, 1));
            node.setWeight(new Weight(7, 1));
            node.setWeight(new Weight(8, 1.4));
        }
        if (node.getX()==0 && node.getY()!=1){
            node.setWeight(new Weight(1, 1));
            node.setWeight(new Weight(4, 1.4));
            node.setWeight(new Weight(3, 1));
            node.setWeight(new Weight(5, 1));
            node.setWeight(new Weight(6, 1.4));
        }
        if (node.getX()!=x && node.getY()==y){
            node.setWeight(new Weight(3, 1));
            node.setWeight(new Weight(2, 1.4));
            node.setWeight(new Weight(5, 1));
            node.setWeight(new Weight(8, 1));
            node.setWeight(new Weight(9, 1.4));
        }
        if (node.getX()==x && node.getY()!=y){
            node.setWeight(new Weight(7, 1));
            node.setWeight(new Weight(4, 1.4));
            node.setWeight(new Weight(5, 1));
            node.setWeight(new Weight(6, 1));
            node.setWeight(new Weight(9, 1.4));
        }
        else{
            node.setWeight(new Weight(1, 1.4));
            node.setWeight(new Weight(2, 1));
            node.setWeight(new Weight(3, 1.4));
            node.setWeight(new Weight(4, 1));
            node.setWeight(new Weight(5, 1.4));
            node.setWeight(new Weight(6, 1));
            node.setWeight(new Weight(7, 1.4));
            node.setWeight(new Weight(8, 1));
            node.setWeight(new Weight(9, 1.4));
        }/*
            else{
             for (int i=1; i<9; i++){
                 if (i!=index){
                 if ((i % index) == 0){
                     node.setWeight(new Weight(i, 1));
                 }
                 else{
                     node.setWeight(new Weight(i, 1.4));                
                 }
                 }
             }
             
            }*/
        }
   
}
