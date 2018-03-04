import java.io.*;
import java.util.*;

/**
 * @author DVDV
 */
public class Quotations {
    private List<Quote> quotes;
    private int currentQuote;
    public Quotations(String path) {
        String line = null;
        currentQuote = 0;
        quotes = new ArrayList<Quote>();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");
                Quote q = new Quote(parts[0], parts[1]);
                quotes.add(q);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + path + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + path + "'");
        }
    }
    
    public Quote getNextQuote(){
        currentQuote++;
        if(currentQuote == quotes.size()){
            currentQuote = 0;
        }
        return quotes.get(currentQuote);
    }
}
