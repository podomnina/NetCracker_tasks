package first.command;

import first.Direction;
import first.Rover;
import first.Turnable;

import java.io.Serializable;

public class TurnCommand implements RoverCommand,Serializable{
    private Turnable turn;
    private Direction direction;
    @Override
    public void execute() {
        turn.turnTo(direction);
    }
    public TurnCommand(Turnable turnable, Direction direction){
        this.turn = turnable;
        this.direction=direction;
    }
    public TurnCommand(){}
}
