package first;

/**
 * Created by PolinaDomnina on 07.03.2016.
 */
public class GroundVisorException extends RuntimeException{
    private String message;
    public GroundVisorException(String message){
        super(message);
        this.message = message;
    }
    public GroundVisorException(){
        super("Out of bounds exception");
    }

    @Override
    public String getMessage() {
        return message;
    }

}
