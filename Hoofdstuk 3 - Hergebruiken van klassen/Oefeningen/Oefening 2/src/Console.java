/**
 * @author Dwight Van der Velpen
 */
public class Console {
    public static void main(String[] args) {
        Cirkel c = new Cirkel(new Punt(1,2),2.0);
        System.out.println("Omtrek: " + c.berekenOmtrek());
        System.out.println("Opp: " + c.berekenOppervlakte());
        System.out.println("Afstand: " + c.berekenAfstand(new Punt()));
    }
}
