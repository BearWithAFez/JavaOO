package vierkantsvergelijking;

/**
 * @author Dwight Van der Velpen
 */
public class VierkantsVergelijking {
    private double a;
    private double b;
    private double c;

    public VierkantsVergelijking(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double zoekDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    public double[] losOp() {
        double[] res = null;
        double d = zoekDiscriminant();
        
        if (d > 0) {
            res = new double[2];
            res[0] = (-b - Math.sqrt(d)) / (2 * a);
            res[1] = (-b + Math.sqrt(d)) / (2 * a);
        }
        else if (d == 0) {
            res = new double[1];            
            res[0] = -b / (2 * a);
        }
        
        return res;
    }
}
