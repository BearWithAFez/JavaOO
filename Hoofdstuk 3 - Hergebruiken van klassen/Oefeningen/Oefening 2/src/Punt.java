/**
 * @author Dwight Van der Velpen
 */
public class Punt {
    private int x;
    private int y;
    
    public Punt(){
        x = 0;
        y = 0;
    }
    
    public Punt(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int newX){
        x = newX;
    }
    
    public void setY(int newY){
        y = newY;
    }
    
    public void verschuifX(int deltaX){
        x += deltaX;
    }
    
    public void verschuifY(int deltaY){
        y += deltaY;
    }
    
    public double berekenAfstand(Punt anderPunt){
        return Math.sqrt(Math.pow(anderPunt.x - x, 2) + Math.pow(anderPunt.y - y, 2));
    }
    
    public void telBij(Punt anderPunt){
        x += anderPunt.x;
        y += anderPunt.y;
    }
    
    public Punt berekenSom(Punt anderPunt){
        return new Punt(x + anderPunt.x, y + anderPunt.y);
    }
    
    @Override
    public String toString(){
        return "Punt (" + x + " ; " + y +" )";
    }
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Punt)) return false;
        Punt arg = (Punt) obj;
        return arg.x == x && arg.y == y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.x;
        hash = 89 * hash + this.y;
        return hash;
    }
}
