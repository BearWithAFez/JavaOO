/**
 * @author Dwight Van der Velpen
 */
public class Helper {
    public static char[] concat(char[] rij1, char[] rij2){
        // Null checks
        if(rij1 == null && rij2 == null) return null;
        if(rij1 == null) return rij2;
        if(rij2 == null) return rij1;
        
        // Concat
        char[] con = new char[rij2.length + rij1.length];
        for (int i = 0; i < rij1.length; i++) {
            con[i]= rij1[i];
        }
        for (int i = rij1.length; i < con.length; i++) {
            con[i]= rij2[i-rij1.length];
        }
        
        // Return
        return con;
    }
}
