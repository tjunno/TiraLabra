/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth.algo;
import java.util.*;
/**
 * Compares weights
 * @author Tuomas Junno
 */
public class Comp implements Comparator<Weight> {

    @Override
    public int compare(Weight o1, Weight o2) {
        if(o1.getW() > o2.getW()) return 1;
        if(o1.getW() < o2.getW()) return -1;
        return 0;
    }
}
