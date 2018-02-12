/**
 * @author Dwight
 */
public class Bankrekening {
    private String rekeningNummer;
    private double saldo;
    private String naam;

    public Bankrekening(String rekeningNummer, String naam) {
        if(rekeningNummer.length() != 14) throw new IllegalArgumentException("Rekening nummer verkeerde lengte");
        if(rekeningNummer.charAt(3) != '-' || rekeningNummer.charAt(11) != '-') throw new IllegalArgumentException("Rekening nummer verkeerd formaat");

        this.rekeningNummer = rekeningNummer;
        this.saldo = 0;
        this.naam = naam;
    }
    
    public void stort(double bedrag){
        this.saldo += bedrag;
    }
    
    public boolean haalAf(double bedrag){
        if (this.saldo < bedrag) return false;
        saldo -= bedrag;
        return true;
    }
    
    public String getNaam(){
        return this.naam;
    }
    
    public String getRekeningNummer(){
        return this.rekeningNummer;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    @Override
    public String toString(){
        return "Bankrekening " + this.rekeningNummer + " van " + this.naam + ": " + this.saldo + "€";
    }
}
