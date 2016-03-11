package first;

public class Ground {
    private GroundCell [][] landscape;
    private int length;
    private int width;

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public Ground (int length,int width){
        this.length=length;
        this.width=width;
        landscape = new GroundCell[this.length][this.width];
        for (int i=0;i<length;i++)
            for (int j=0;j<width;j++) {
                landscape[i][j] = new GroundCell();
                landscape[i][j].setX(i);
                landscape[i][j].setY(j);
            }
    }
    public GroundCell[][] getLandscape(){
        return this.landscape;
    }

}
