package labyrinth.algo;
import java.util.Comparator;
/**
 * Compares for Astar
 * @author Tuomas Junno
 */
public class AComp implements Comparator<Anode> {
    int x,y;
    
    public AComp(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compare(Anode o1, Anode o2) {
        if(o1.getEnd() == -1){
            o1.setEnd(Math.abs((o1.getX()-x)+(o1.getY()-y)));
        }
        if(o1.getEnd() == -1){
            o1.setEnd(Math.abs((o2.getX()-x)+(o2.getY()-y)));
        }
        double comp = ((o1.getStart() + o1.getEnd())) - (o2.getStart() + o2.getEnd());
        if (comp < -1) return -1;
        if (comp == 0) return 0;
        return 0;
    }
}
