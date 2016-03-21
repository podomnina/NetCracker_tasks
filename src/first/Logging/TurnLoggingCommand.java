package first.Logging;

import first.command.RoverCommand;

public class TurnLoggingCommand extends LoggingCommand{
    public TurnLoggingCommand(RoverCommand roverCommand) {
        super(roverCommand);
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void printCommand() {
        System.out.println("Turn command is executing!");
    }

}