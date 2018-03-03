/**
 * @author DVDV
 */
public class Boek extends Tijdschrift{
    private String auteur;
    private int bladzijden;

    public Boek(String auteur, int bladzijden, int maand, int jaar, String titel, double prijs) {
        super(maand, jaar, titel, prijs);
        this.auteur = auteur;
        this.bladzijden = bladzijden;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + auteur + "(" + bladzijden +"p)";
    }

    @Override
    public boolean equals(Object obj) {
        Boek other = (Boek) obj;
        return super.equals(obj) && other.auteur.equals(auteur) && other.bladzijden == bladzijden;
    }
}
