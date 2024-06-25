package exceptions;

public class musicSystemNotFound extends Exception {
    
    public musicSystemNotFound() {
        super("You've not plugged in an appropriate music system. You can't use this functionality without that");
    }

} 