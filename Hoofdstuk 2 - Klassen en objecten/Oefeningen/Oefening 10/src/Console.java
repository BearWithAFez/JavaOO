/**
 * @author Dwight Van der Velpen
 */
public class Console {
    public void test() {
        Breuk b1 = new Breuk(3,10);
        Breuk b2 = new Breuk(2,4);
        
        Breuk b3 = new Breuk(2,1);
        Breuk bsom12 = b1.plus(b2);
        Breuk bmin32 = b3.min(b2);
        Breuk bmaal23 = b2.maal(b3);
        Breuk bdeel32 = b3.deel(b2);        
    }
}
