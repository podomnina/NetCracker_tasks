package first.command;

import first.command.RoverCommand;

public class LoggingCommand implements RoverCommand {
    private RoverCommand roverCommand;
    public LoggingCommand(RoverCommand roverCommand){
        this.roverCommand=roverCommand;
    }

    @Override
    public void execute(){
        roverCommand.execute();
        System.out.println("Command " + roverCommand.toString() + " is executing!");
    }

}
