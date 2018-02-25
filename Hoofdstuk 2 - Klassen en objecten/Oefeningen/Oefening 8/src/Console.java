import algemeen.Helper;

/**
 * @author Dwight VdV
 */
public class Console {
    public static void main(String[] args) {
        int a = 3456;
        System.out.println("a: "+a+" : " + Helper.Encrypt(a) + " : " + Helper.Decrypt(Helper.Encrypt(a)));
    }
}
