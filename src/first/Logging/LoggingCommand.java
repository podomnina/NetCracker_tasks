package first.Logging;

import first.command.RoverCommand;

abstract public class LoggingCommand implements RoverCommand {
    protected RoverCommand roverCommand;
    public LoggingCommand(RoverCommand roverCommand){
        this.roverCommand=roverCommand;
    }

    protected LoggingCommand() {
    }

    @Override
    public void execute(){
        roverCommand.execute();
    }
    public void printCommand(){
    }
}
