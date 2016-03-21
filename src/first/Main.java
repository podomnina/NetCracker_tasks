package first;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rover r = new Rover();
        r.getVisor().setGround(new Ground(10, 10));
        r.executeProgramFile("1.txt");

    }
}
