package labyrinth.algo;
import java.util.Comparator;
/**
 * Compares for Astar
 * @author Tuomas Junno
 */
public class AComp implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        double comp = ((o1.getStart() + o1.getEnd())) - (o2.getStart() + o2.getEnd());
        if (comp < -1) return -1;
        if (comp == 0) return 0;
        return 0;
    }
}
