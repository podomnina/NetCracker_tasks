package first;

import first.command.RoverCommandParser;

public class Rover implements Turnable, Moveable, ProgramFileAware{
    private Direction direction;
    private GroundVisor groundVisor;
    private int x;
    private int y;
    private RoverCommandParser programParser;
    @Override
    public void move(int x, int y){
        if(!groundVisor.hasObstacles(x,y));
        {
            this.x = x;
            this.y = y;
        }
    }
    public Rover(){
        groundVisor=new GroundVisor();
        programParser=new RoverCommandParser();
    }
    @Override
    public void turnTo(Direction direction){
        this.direction=direction;
    }
    public GroundVisor getVisor(){
        return this.groundVisor;
    }

    @Override
    public void executeProgramFile(String file) {

    }
}
