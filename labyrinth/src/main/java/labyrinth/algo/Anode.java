
package labyrinth.algo;

/**
 *
 * @author Tuomas Junno
 */
public class Anode {
    private int id, x, y, start, end;
    
    public Anode(int id, int start, int x, int y){
        this.id = id;
        this.start = start;
        this.x = x;
        this.y = y;
        this.end = -1;
    }
    
    public int getId(){
        return id;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
    public void setEnd(int toend){
        this.end = toend;
    }
}
