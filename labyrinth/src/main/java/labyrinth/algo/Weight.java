/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labyrinth.algo;

/**
 * Weight
 * @author Tuomas Junno
 */
public class Weight {
    private final int i;
    private final double w;
    
    /**
     * Weight
     * @param i
     * @param w 
     */
    public Weight(int i, double w){
        this.i = i;
        this.w = w;
    }    
    public int getI(){
        return i;
    }
    public double getW(){
        return w;
    }

}
