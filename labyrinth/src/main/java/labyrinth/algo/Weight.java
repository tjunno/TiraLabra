package labyrinth.algo;

/**
 * . Weight
 *
 * @author Tuomas Junno
 */
public class Weight {
    /**
     * . i
     */
    private final int i;
    /**
     * . w
     */
    private final double w;

    /**
     * . Weight
     *
     * @param i2 i
     * @param w2 w
     */
    public Weight(final int i2, final double w2) {
        this.i = i2;
        this.w = w2;
    }

    /**
     * . getI
     *
     * @return i
     */

    public final int getI() {
        return i;
    }

    /**
     * . getW
     *
     * @return w
     */
    public final double getW() {
        return w;
    }

}
