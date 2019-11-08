package labyrinth.algo;
import java.util.Comparator;
/**.
 * Compares weights
 * @author Tuomas Junno
 */
public class DComp implements Comparator<Weight> {

    @Override
    public final int compare(final Weight o1, final Weight o2) {
        if (o1.getW() > o2.getW()) {
            return 1;
        }
        if (o1.getW() < o2.getW()) {
            return -1;
        }
        return 0;
    }
}
