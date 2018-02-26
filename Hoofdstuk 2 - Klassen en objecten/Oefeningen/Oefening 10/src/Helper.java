/**
 * @author Dwight Van der Velpen
 */
public class Helper {
    public static int ggd(int a, int b){
        int ggd = 1;
        int max = (a>b) ? b : a;
        for(int i= 1 ;i<=max;i++){
            if((a%i == 0) &&(b%i == 0)){
                ggd = i;
            }
        }
        return ggd;
    }
    
    public static int kgv(int a, int b){
        int kgva = a;
        for (int i = 1; i <= b; i++) {
            if(((a*i) % b) == 0){
                kgva = a*i;
                break;
            }
        }
        
        int kgvb = b;
        for (int i = 1; i <= a; i++) {
            if(((b*i) % a) == 0){
                kgvb = b*i;
            }
        }
        
        return ((kgva < kgvb) ? kgva : kgvb);
    }
}
