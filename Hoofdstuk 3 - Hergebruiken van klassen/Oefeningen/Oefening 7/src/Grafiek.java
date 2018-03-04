/**
 * @author DVDV
 */
public class Grafiek {
    public double[] data;

    public Grafiek() {
        data = new double[]{0.0 , 1.0};
    }    

    public Grafiek(String input) {
        editData(input);
    }
    
    public void editData(String input){
        String[] splitted = input.split(",");
        data = new double[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            data[i] = Math.abs(Double.parseDouble(splitted[i]));
        }
    }
    
    public double getMinimum(){
        double min = data[0];
        for (int i = 1; i < data.length; i++) {
            if(min > data[i]) min = data[i];
        }
        return min;
    }
    
    public double getMaximum(){
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if(max < data[i]) max = data[i];
        }
        return max;
    }
}
