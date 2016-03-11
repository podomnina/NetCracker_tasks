package first;

public class GroundVisor {
    private Ground ground;

    public void setGround(Ground ground){
        this.ground=ground;
    }

    public boolean hasObstacles(int x,int y) throws GroundVisorException {
        if ((x>ground.getLength())||(y>ground.getWidth()))
            throw new GroundVisorException();
        return (ground.getLandscape()[x][y].getState().equals(CellState.OCCUPIED))? true : false;
    }
}
