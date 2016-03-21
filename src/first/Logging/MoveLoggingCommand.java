package first.Logging;

import first.command.RoverCommand;

public class MoveLoggingCommand extends LoggingCommand{
    public MoveLoggingCommand(RoverCommand roverCommand) {
        super(roverCommand);
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void printCommand() {
        System.out.println("Move command is executing!");
    }

}
