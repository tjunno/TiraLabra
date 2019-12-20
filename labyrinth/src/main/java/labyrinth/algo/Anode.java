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
     * . Anode for Astar
     *
     * @param id2    id
     * @param start2 start
     * @param x2     x
     * @param y2     y
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
     * . Gets id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * . Gets x
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * . Get y
     *
     * @return y
     */
    public final int getY() {
        return y;
    }

    /**
     * . Gets start
     *
     * @return start
     */
    public double getStart() {
        return start;
    }

    /**
     * . Gets end
     *
     * @return end
     */
    public double getEnd() {
        return end;
    }

    /**
     * . Sets end
     * @param toend toend
     */
    public void setEnd(final double toend) {
        this.end = toend;
    }
}
