package first;

public class GroundCell {
    private CellState state;
    private int x;
    private int y;

    public GroundCell(){
        state=CellState.FREE;
    }
    public CellState getState(){return this.state;}
    public void setState(CellState state){this.state=state;}
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
