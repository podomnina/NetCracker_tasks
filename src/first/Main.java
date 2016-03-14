package first;

import first.Dist.ArrayVectorImpl;
import first.Dist.EmployeeImpl;
import first.Rover;
import first.command.MoveCommand;
import first.command.RoverCommand;
import first.command.TurnCommand;

import java.awt.*;
import java.io.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rover r = new Rover();
        r.getVisor().setGround(new Ground(10, 10));

       /* LinkedList<RoverCommand> comList=new LinkedList<>();

        RoverCommand value=new TurnCommand(r,Direction.WEST);
        comList.add(value);
        value=new MoveCommand(r,7,7);
       comList.add(value);
        value=new TurnCommand(r,Direction.NORTH);
        comList.add(value);
       // value=new MoveCommand(r,3,7);
       // comList.add(value);


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.bin"));
        out.writeObject(comList);
        out.close();*/
        r.executeProgramFile("out.bin");

    }
}
