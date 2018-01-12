package labyrinth.algo;

/**
 * Astar node
 * @author Tuomas Junno
 */
public class Anode {
    private int id, x, y;
    private double start, end;
    
    public Anode(int id, double start, int x, int y){
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
    public double getStart(){
        return start;
    }
    public double getEnd(){
        return end;
    }
    public void setEnd(double toend){
        this.end = toend;
    }
}
