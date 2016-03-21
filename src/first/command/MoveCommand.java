package first.command;

import first.Moveable;

public class MoveCommand implements RoverCommand {
    private Moveable move;
    private int x;
    private int y;
    @Override
    public void execute() {
        move.move(x, y);
    }
    public MoveCommand (Moveable moveable, int x, int y){
        this.move=moveable;
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "move";
    }
}
