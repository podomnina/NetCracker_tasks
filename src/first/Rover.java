package first;

import first.command.RoverCommand;
import first.command.RoverCommandParser;

import java.io.*;

public class Rover implements Turnable, Moveable, ProgramFileAware, Serializable{
    private static final long serialVersionUID = 8487956070498203558L;
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
            System.out.println("Moved to x="+x+"  y="+y+"!!!");
        }
    }
    public Rover(){
        groundVisor=new GroundVisor();
    }
    @Override
    public void turnTo(Direction direction){
        this.direction=direction;
        System.out.println("Direction is "+direction+"!");
    }
    public GroundVisor getVisor(){
        return this.groundVisor;
    }

    @Override
    public void executeProgramFile(String file) throws IOException, ClassNotFoundException {
        programParser = new RoverCommandParser(this,file);
        while (programParser.checkEndOfList())
            programParser.readNextCommand().execute();

    }

}
