/**
 * @author DVDV
 */
public class Tijdschrift extends Uitgave {
    private int maand;
    private int jaar;

    public Tijdschrift(int maand, int jaar, String titel, double prijs) {
        super(titel, prijs);
        this.maand = maand;
        this.jaar = jaar;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + jaar + " - " + maand + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Tijdschrift other = (Tijdschrift) obj;
        return super.equals(obj) && jaar == other.jaar && maand == other.maand; 
    }
}
