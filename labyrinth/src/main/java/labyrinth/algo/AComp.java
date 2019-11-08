package labyrinth.algo;

import java.util.Comparator;

/**.
 *
 * Compare for Astar
 *
 * @author Tuomas Junno
 */
public class AComp implements Comparator<Anode> {

    /**.
     * x
     */
    private final int x;

    /**.
     * y
     */
    private final int y;

    /**.
     * Acomp
     * @param x2 x
     * @param y2 y
     */

    public AComp(final int x2, final int y2) {
        this.x = x2;
        this.y = y2;
    }

    /**.
     * Compares two nodes and calculates difference
     *
     * @param o1 First Astar node
     * @param o2 Second Astar node
     * @return -1, 0 or 1
     */
    @Override
    public int compare(final Anode o1, final Anode o2) {
        if (o1.getEnd() == -1) {
            o1.setEnd(Math.abs((o1.getX() - x) + (o1.getY() - y)));
        }
        if (o2.getEnd() == -1) {
            o2.setEnd(Math.abs((o2.getX() - x) + (o2.getY() - y)));
        }
        double comp =
        ((o1.getStart() + o1.getEnd())) - (o2.getStart() + o2.getEnd());
        if (comp < -1) {
            return -1;
        }
        if (comp > 1) {
            return 1;
        }
        return 0;
    }
}
