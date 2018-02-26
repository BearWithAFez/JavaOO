/**
 * @author Dwight VdV
 */
public class Console {
    public static void main(String[] args) {
        // Test 1
        System.out.println("TESTING 10 NOV 1996");
        Datum d1 = new Datum(10, 11, 1996);        
        System.out.println("Is het een schrikkeljaar? " + d1.isSchrikkeljaar());
        System.out.println("Week van jaar? " + d1.geefWeekVanJaar());
        System.out.println("Dag van week? " + d1.geefDagVanWeek());
        System.out.println("Dag van jaar? " + d1.geefDagVanJaar());
        System.out.println("Aantal dagen in jaar? " + d1.geefAantalDagenInJaar());
        
        
        // Test 2
        System.out.println("TESTING 16 FEB 2018");
        Datum d2 = new Datum(26, 2, 2018);        
        System.out.println("Is het een schrikkeljaar? " + d2.isSchrikkeljaar());
        System.out.println("Week van jaar? " + d2.geefWeekVanJaar());
        System.out.println("Dag van week? " + d2.geefDagVanWeek());
        System.out.println("Dag van jaar? " + d2.geefDagVanJaar());
        System.out.println("Aantal dagen in jaar?"  + d2.geefAantalDagenInJaar());
    }
}
