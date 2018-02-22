/**
 * @author Dwight
 */
public class Console {
    public void testTijd(){
        Tijd t1 = new Tijd(00, 23);
        Tijd t2 = new Tijd(02, 55);
        
        System.out.println("T1 is nu " + t1.getUren() + "h" + t1.getMinuten() + "m");
        t1.telTijdBij(t2);
        System.out.println("T1 is nu " + t1.getUren() + "h" + t1.getMinuten() + "m");
    }
}
