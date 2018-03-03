/**
 * @author DVDV
 */
public class Uitgave {
    private String titel;
    private double prijs;

    public Uitgave(String titel, double prijs) {
        this.titel = titel;
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return titel + " : " + prijs + "€";
    }

    @Override
    public boolean equals(Object obj) {
        Uitgave other = (Uitgave) obj;
        return titel.equals(other.titel) && prijs == other.prijs;
    }    
}
