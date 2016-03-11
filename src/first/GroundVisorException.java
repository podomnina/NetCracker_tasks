package first;

public class GroundVisorException extends RuntimeException{
    public GroundVisorException(String message){
        super(message);
    }
    public GroundVisorException(){
        super("Out of bounds exception");
    }

}
