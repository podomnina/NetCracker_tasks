package first.command;

import first.Rover;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class RoverCommandParser {
    private LinkedList<RoverCommand> comList;
    private Iterator<RoverCommand> iterator;



    public RoverCommand readNextCommand(){
        return iterator.next();

    }
    public boolean checkEndOfList(){
        return (iterator.hasNext()) ? true : false;
    }
    public RoverCommandParser(Rover rover, String file) throws IOException, ClassNotFoundException{
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
        comList=(LinkedList<RoverCommand>)stream.readObject();
        iterator=comList.iterator();
        stream.close();
    }
}
