package exceptions;

public class car {

    musicSystem ms;

    public void setSystem(musicSystem ms) {
        this.ms = ms;
    }
    
    public void playMusic() throws musicSystemNotFound {
        
        if (ms == null) {
            throw new musicSystemNotFound();
        }
        ms.play();
    }
    
}
