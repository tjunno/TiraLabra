package labyrinth.algo;
import java.util.Comparator;
/**
 * 
 * Compare for Astar
 * @author Tuomas Junno
 */
public class AComp implements Comparator<Anode> {
    private final int x,y;
    
    public AComp(int x,int y){
        this.x = x;
        this.y = y;
    }
    /**
     * Compares two nodes and calculates difference
     * 
     * @param o1 First Astar node
     * @param o2 Second Astar node
     * @return -1, 0 or 1
     */
    @Override
    public int compare(Anode o1, Anode o2) {
        if(o1.getEnd() == -1){
            o1.setEnd(Math.abs((o1.getX()-x)+(o1.getY()-y)));
        }
        if(o2.getEnd() == -1){
            o2.setEnd(Math.abs((o2.getX()-x)+(o2.getY()-y)));
        }
        double comp = ((o1.getStart() + o1.getEnd())) - (o2.getStart() + o2.getEnd());
        if (comp < -1) return -1;
        if (comp > 1) return 1;
        return 0;
    }
}
