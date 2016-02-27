package first;

/**
 * Created by PolinaDomnina on 27.02.2016.
 */
public class Rover implements Turnable, Moveable{
    private Direction direction;
    private int x;
    private int y;
    public void move(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void turnTo(Direction direction){
        this.direction=direction;
    }
}
