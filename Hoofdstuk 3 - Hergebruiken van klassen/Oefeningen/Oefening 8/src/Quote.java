/**
 * @author DVDV
 */
public class Quote {
    private String quote;
    private String auteur;

    public Quote(String quote, String auteur) {
        this.quote = quote;
        this.auteur = auteur;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuteur() {
        return auteur;
    }
}
