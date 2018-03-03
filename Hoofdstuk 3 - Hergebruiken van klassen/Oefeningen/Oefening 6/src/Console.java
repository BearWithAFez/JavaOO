/**
 * @author DVDV
 */
public class Console {
    public static void main(String[] args) {
        Boek b1 = new Boek("Dwight", 1000, 11, 1996, "De geboorte van mezelf.", 1);
        Boek b2 = new Boek("Dwight Van der Velpen", 100, 3, 2, "Java voor dummie", 50);
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b1.equals(b2));
    }
}
