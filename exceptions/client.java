package exceptions;

class client {
    
    public static void main(String[] args) {
        try{

            car c = new car();
            c.playMusic();
        }
        catch(musicSystemNotFound ms){
            System.out.println(ms);
        }

    }
}