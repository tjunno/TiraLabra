package labyrinth.algo;
import java.util.Comparator;
/**
 * Compares weights
 * @author Tuomas Junno
 */
public class DComp implements Comparator<Weight> {

    @Override
    public int compare(Weight o1, Weight o2) {
        if(o1.getW() > o2.getW()) return 1;
        if(o1.getW() < o2.getW()) return -1;
        return 0;
    }
}
