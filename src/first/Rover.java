package first;

import first.*;
import first.Logging.LoggingCommand;
import first.Logging.MoveLoggingCommand;
import first.Logging.TurnLoggingCommand;
import first.command.MoveCommand;
import first.command.RoverCommandParser;
import first.command.TurnCommand;


import java.io.*;

public class Rover implements Turnable, Moveable, ProgramFileAware{
    private Direction direction;
    private GroundVisor groundVisor;
    private int x;
    private int y;
    private RoverCommandParser programParser;
    @Override
    public void move(int x, int y){
        try {
            if (!groundVisor.hasObstacles(x, y)) ;
            {
                this.x = x;
                this.y = y;
                System.out.println("Moved to x=" + x + "  y=" + y + "!!!");
            }
        }
        catch (GroundVisorException e){
            System.out.println("Out of bounds exception!");
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

        programParser = new RoverCommandParser(this);
        programParser.setFile(file);
        programParser.Read();
        LoggingCommand log;
        while (programParser.checkEndOfList()) {
            log = new TurnLoggingCommand(new MoveLoggingCommand(programParser.readNextCommand()));
            log.execute();
            log.printCommand();
            //programParser.readNextCommand().execute();
        }
    }

}