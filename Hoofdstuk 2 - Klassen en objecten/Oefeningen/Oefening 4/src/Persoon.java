/**
 *
 * @author dwight
 */
public class Persoon {
    private String naam;
    private String voornaam;
    private int leeftijd;
    private boolean geslacht;
    
    public boolean isVolwassen(){
        return leeftijd >= 18;
    }
    
    public String GetNaam(){
        return naam;
    }
    
    public void SetNaam(String n){
        naam = n;
    }
    
    public String GetVoornaam(){
        return voornaam;
    }
    
    public void SetVoornaam(String v){
        voornaam = v;
    }
    
    public int GetLeeftijd(){
        return leeftijd;
    }
    
    public void SetLeeftijd(int l){
        if (l < 150 && l > -1){
            leeftijd = l;
        }
    }
    
    public void SetGeslacht(boolean g){
        geslacht = g;
    }
    
    public boolean GetGeslacht(){
        return geslacht;
    }
    
    public boolean HeeftZelfdeNaamAls(Persoon p){
        return naam.equals(p.naam);
    }
    
    public Persoon(String n, String v){
        naam = n;
        voornaam = v;
        
        // Defaults
        leeftijd = 18;
        geslacht = true;
    }
    
    public Persoon(String n, String v, int l, boolean  g){
        if (l < 0){
            throw new IllegalArgumentException("Leeftijd kan niet negatief zijn!");
        }
        naam = n;
        voornaam = v;
        leeftijd = l;
        geslacht = g;
    }
}
