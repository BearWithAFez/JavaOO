/**
 * @author Dwight Van der Velpen
 */
public class Console {
    public static void main(String[] args) {
        char[] rij1 = {'H','a','l','l','o',' '};
        char[] rij2 = {'w','e','r','e','l','d','!'};
        
        char[] concatted = Helper.concat(rij1, rij2);
        
        for (char c : concatted) {
            System.out.print(c);
        }
        
        System.out.println();
    }
}
