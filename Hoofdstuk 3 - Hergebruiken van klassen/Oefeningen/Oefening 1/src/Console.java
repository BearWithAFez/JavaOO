/**
 * @author Dwight Van der Velpen
 */
public class Console {
    public static void main(String[] args) {
        Punt p1 = new Punt();
        System.out.println(p1.toString());
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1.toString());
        System.out.println(p1.getX() + " - " + p1.getY());
        p1.verschuifX(5);
        p1.verschuifY(-5);
        System.out.println(p1.getX() + " - " + p1.getY());
        Punt p2 = new Punt(100,-100);
        System.out.println(p2.toString());
        System.out.println("Afstand: " + p1.berekenAfstand(p2));
        p1.telBij(p2);
        System.out.println(p1.toString());
        Punt p3 = p1.berekenSom(p2);
        System.out.println(p3.toString());
        System.out.println(p3.equals(p2));
        System.out.println(p3.equals(p1.berekenSom(p2)));
    }
}
