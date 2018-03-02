/**
 * @author Dwight Van der Velpen
 */
public class HighscoreItem {
    private String naam;
    private double score;

    public HighscoreItem() {
        naam = "Unknown";
        score = 0;
    }

    public HighscoreItem(String naam, double score) {
        this.naam = naam;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return naam + " - " + score;
    }    
}
