package labyrinth.algo;

/**
 * .
 *
 * Astar node
 *
 * @author Tuomas Junno
 */
public class Anode {

    /**
     * . id
     */
    private final int id;
    /**
     * . x
     */
    private final int x;
    /**
     * . y
     */
    private final int y;
    /**
     * . start
     */
    private final double start;
    /**
     * . end
     */
    private double end;

    /**
     * . Anode
     *
     * @param id2    i
     * @param start2 i
     * @param x2     i
     * @param y2     i
     */
    public Anode(final int id2, final double start2,
    final int x2, final int y2) {
        this.id = id2;
        this.start = start2;
        this.x = x2;
        this.y = y2;
        this.end = -1;
    }

    /**
     * . getid
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * . getx
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * . gety
     *
     * @return y
     */
    public final int getY() {
        return y;
    }

    /**
     * . getstart
     *
     * @return start
     */
    public double getStart() {
        return start;
    }

    /**
     * . getend
     *
     * @return end
     */
    public double getEnd() {
        return end;
    }

    /**
     * . setend
     * @param toend toend
     */
    public void setEnd(final double toend) {
        this.end = toend;
    }
}
