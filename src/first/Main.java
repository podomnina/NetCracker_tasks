package first;

import first.Rover;

public class Main {

    public static void main(String[] args) {
        Rover r = new Rover();
        r.getVisor().setGround(new Ground(10, 10));
        r.move(9, 9);
        r.move(19,9);
    }
}
