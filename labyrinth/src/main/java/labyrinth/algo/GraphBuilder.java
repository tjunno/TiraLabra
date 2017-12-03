/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth.algo;

/**
 *
 * @author Tuomas Junno
 */
public class GraphBuilder {

    
    /**
     * THE GraphBuilder
     * @param x
     * @param y
     * @return 
     */
    public static Node[] GraphBuilder(int x, int y){

        Node[] g = new Node[x*y];
        for (int i = 0; i<x; i++){          
            for (int j = 0; j<y; j++){
                Node node = new Node(j,i);
                addWeights(node, x, y);
                g[i*x+j] = node;
            }
            
        }
        return g;      
    }
    /**
     * Very classy way to add weights
     * 1   2  3  4  5
     * 6   7  8  9 10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     * @param node
     * @param x
     * @param y 
     */
    public static void addWeights(Node node, int x, int y){
        int p = node.getX()+(node.getY()*x);
        if (node.getX()==0 && node.getY()==0){
            node.setWeight(new Weight(2, 1));
            node.setWeight(new Weight(x, 1));
            node.setWeight(new Weight(x+1, 1.4));               
        }else if(node.getY()==0 && node.getX()==x-1){
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p+x, 1));
            node.setWeight(new Weight(p+x-1, 1.4));
        }else if(node.getY()==0){
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p+x, 1));
            node.setWeight(new Weight(p+x+1, 1.4));
            node.setWeight(new Weight(p+x-1, 1.4));
        }else if(node.getX()==0 && node.getY()==y-1){
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p-x+1, 1.4));
        }else if(node.getX()==x-1 && node.getY()==y-1){
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p-x-1, 1.4));
        }else if(node.getX()==0){
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p+x, 1));
            node.setWeight(new Weight(p-x+1, 1.4));
            node.setWeight(new Weight(p+x+1, 1.4));
        }else if(node.getX()==x-1) {
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p-x-1, 1.4));
            node.setWeight(new Weight(p+x-1, 1.4));
            
        }else if(node.getY()==y-1) {
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p-x-1, 1.4));
            node.setWeight(new Weight(p-x+1, 1.4));
        }else{
            node.setWeight(new Weight(p-x, 1));
            node.setWeight(new Weight(p-1, 1));
            node.setWeight(new Weight(p+1, 1));
            node.setWeight(new Weight(p+x, 1));
            node.setWeight(new Weight(p-x-1, 1.4));
            node.setWeight(new Weight(p-x+1, 1.4));
            node.setWeight(new Weight(p+x-1, 1.4));
            node.setWeight(new Weight(p+x+1, 1.4));
        }
    }
   
}
