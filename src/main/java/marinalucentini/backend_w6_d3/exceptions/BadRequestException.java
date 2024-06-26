package marinalucentini.backend_w6_d3.exceptions;

public class BadRequestException extends RuntimeException{
    public  BadRequestException(String message){
        super(message);
    }
}
