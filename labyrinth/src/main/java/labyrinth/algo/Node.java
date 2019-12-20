package labyrinth.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**.
 * Class representing a node that has X- and Y-coordinate and list of weights
 *
 * @author Tuomas Junno
 */
public class Node {
    /**.
     * Integer variable x
     */
    private final int x;
    /**.
     * Integer variable y
     */
    private final int y;
    // private Weight[] weights;
    /**.
     * Weights
     */
    private final List<Weight> weights;

    /** .
     *
     * @param x2 x-coordinate
     * @param y2 y-coordinate
     */
    public Node(final int x2, final int y2) {
        this.x = x2;
        this.y = y2;
        this.weights = new ArrayList<>();
    }

    /**.
     * @return weights weights
     */
    public final List<Weight> getWeights() {
        return weights;
    }
    /**.
     *  setWeight
     * @param w weight
     */
    public final void setWeight(final Weight w) {
        weights.add(w);
    }

    /**.
     * getX
     * @return x
     */
    public final int getX() {
        return this.x;
    }

    /**.
     * getY
     * @return y
     */

    public final int getY() {
        return this.y;
    }

    @Override
    public final String toString() {
        int[] array = new int[weights.size()];
        for (int i = 0; i < weights.size(); i++) {
            array[i] = weights.get(i).getI();
        }
        return "x: " + this.x + ", y: " + this.y + " weights:"
        + Arrays.toString(array);
    }
}
