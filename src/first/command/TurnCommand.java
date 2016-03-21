package first.command;

import first.Direction;
import first.Turnable;


public class TurnCommand implements RoverCommand{
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
    public TurnCommand(Turnable turnable, String direction){
        this.direction = Direction.valueOf(direction);
        this.turn = turnable;

    }
    @Override
    public String toString(){
        return "turn";
    }
}
