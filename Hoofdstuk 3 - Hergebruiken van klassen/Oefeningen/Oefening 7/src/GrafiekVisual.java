/**
 * @author DVDV
 */
import javax.swing.*;
import java.awt.*;
public class GrafiekVisual extends javax.swing.JPanel {
    private Grafiek grafiek;

    /**
     * Creates new form GrafiekVisual
     */
    public GrafiekVisual() {
        initComponents();
        
        this.grafiek = new Grafiek();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
                      
        tekenGrafiek(g,convertGrafiekData());
    }
    
    private void tekenGrafiek(Graphics g, Point[] data){        
        // Grafiek
        g.setColor(new Color(117, 188, 84)); // groen
        
        if(data.length < 2){
            g.drawLine(0, this.getHeight(), this.getWidth(), this.getHeight());
        }        
        else{
            for (int i = 0; i < data.length-1; i++) {
                g.drawLine(data[i].x,data[i].y,data[i+1].x,data[i+1].y);
            }
        }
    }

    private Point[] convertGrafiekData() {
        double[] rawData = grafiek.data;
        Point[] returnData = new Point[rawData.length];
        
        double min = grafiek.getMinimum();
        double yFactor = this.getHeight() / (grafiek.getMaximum() - min);
        double xFactor = this.getWidth() / (rawData.length-1) ;
        
        // Relative data
        for (int i = 0; i < returnData.length; i++) {
            returnData[i] = new Point((int) Math.round(i * xFactor), (int) Math.round((rawData[i] - min) * yFactor));
        }
        
        // Reverse Y
        for (int i = 0; i < returnData.length; i++) {
            returnData[i].y = this.getHeight() - returnData[i].y;
        }
        
        return returnData;
    }
    
    public void alterData(String data){
        grafiek.editData(data);
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}