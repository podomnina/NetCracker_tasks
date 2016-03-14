package first.command;

import first.Moveable;

import java.io.Serializable;

public class MoveCommand implements RoverCommand, Serializable {
    private Moveable move;
    private int x;
    private int y;
    @Override
    public void execute() {
        move.move(x,y);
    }
    public MoveCommand (Moveable moveable, int x, int y){
        this.move=moveable;
        this.x=x;
        this.y=y;
    }
    public MoveCommand(){

    }
}
