package first.command;

import first.Rover;

import java.util.LinkedList;

public class ImportCommand implements RoverCommand {
    private LinkedList<RoverCommand> list;
    public ImportCommand (LinkedList<RoverCommand> list){
        this.list=list;
    }
    @Override
    public void execute() {
        for (RoverCommand com:list)
            com.execute();
    }
    public void add (RoverCommand newCommand){
        list.add(newCommand);
    }
    public void addCollection (LinkedList<RoverCommand> newList){
        for (RoverCommand newCommand: newList)
            list.add(newCommand);
    }
}
