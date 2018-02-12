/**
 * @author Dwight
 */
public class Boom {
    private int hoogte;
    private static int MAX = 550;
    private static int MIN = 25;    
    private static int STEP = 25;    
    
    public Boom() {
        this.hoogte = 300;
    }

    public Boom(int hoogte) {
        this.hoogte = hoogte;
    }
    
    public boolean groei(){
        if(this.hoogte >= MAX) return false;
        hoogte += STEP;
        return true;
    }
    
    public boolean snoei(){
        if(this.hoogte <= MIN) return false;
        hoogte -= STEP;
        return true;
    }
    
    @Override
    public String toString(){
        return "De boom is " + hoogte + "cm hoog.";
    }
}
