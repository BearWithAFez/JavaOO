/**
 * @author Dwight
 */
public class Bankrekening {
    private String rekeningNummer;
    private double saldo;
    private String naam;

    public Bankrekening(String rekeningNummer, String naam) {
        if (!IsGeldigRekNr(rekeningNummer)) throw new IllegalArgumentException("Foutief formaat rekening nummer!!");
        this.rekeningNummer = rekeningNummer;
        this.saldo = 0;
        this.naam = naam;
    }
    
    public static boolean IsGeldigRekNr(String rekNr){
        if(rekNr.length() != 14) return false;
        if(rekNr.charAt(3) != '-' || rekNr.charAt(11) != '-') return false;
        return true;
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
