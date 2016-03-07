package first;

/**
 * Created by PolinaDomnina on 07.03.2016.
 */
public class GroundVisor {
    private Ground ground;

    public void setGround(Ground ground){
        this.ground=ground;
    }

    public boolean hasObstacles(int x,int y) throws GroundVisorException {
        if ((x>ground.getLength())||(y>ground.getWidth()))
            throw new GroundVisorException();
        return false;
    }
}
