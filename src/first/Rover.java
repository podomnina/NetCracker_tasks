package first;

/**
 * Created by PolinaDomnina on 27.02.2016.
 */
public class Rover implements Turnable, Moveable{
    private Direction direction;
    private GroundVisor groundVisor;
    private int x;
    private int y;
    @Override
    public void move(int x, int y){
        this.x=x;
        this.y=y;
        if (!groundVisor.hasObstacles(x,y))
            System.out.println("Success!");
    }
    public Rover(){
        groundVisor=new GroundVisor();
    }
    @Override
    public void turnTo(Direction direction){
        this.direction=direction;
    }
    public GroundVisor getVisor(){
        return this.groundVisor;
    }
}
