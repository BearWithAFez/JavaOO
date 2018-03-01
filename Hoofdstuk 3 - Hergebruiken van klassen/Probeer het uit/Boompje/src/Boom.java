/**
 * @author Dwight VdV
 */
public class Boom {
    public static final int DEFAULT_HOOGTE = 250;
    public static final int MAX_HOOGTE = 500;
    public static final int GROEI_STAP = 25;
    
    private int hoogte;
    
    public Boom(){
        this.hoogte = DEFAULT_HOOGTE;
    }
    
    public Boom(int hoogte){
        if (hoogte > 0 && hoogte <= MAX_HOOGTE) {
            this.hoogte = hoogte;
        }
        else {
            this.hoogte = DEFAULT_HOOGTE;
        }
    }
    
    public boolean groei(){
        if (hoogte + GROEI_STAP <= MAX_HOOGTE) {
            this.hoogte += GROEI_STAP;
            return true;
        }
        return false;
    }
    
    public boolean snoei(){
        if (hoogte - GROEI_STAP > 0) {
            this.hoogte -= GROEI_STAP;
            return true;
        }
        return false;
    }
    
    public int getHoogte(){
        return this.hoogte;
    }
    
    @Override
    public String toString(){
        return "De boom is " + this.hoogte + "cm hoog!";
    }
}
