/**
 * @author Dwight VdV
 */
import javax.swing.*;
import java.awt.*;
public class TekenPanel extends JPanel {
    private Boom boom;
    private int stamDikte;
    private int kruinDiameter;
    
    public TekenPanel() {
        initComponents();
        
        this.boom = new Boom();
    }
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
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        stamDikte = (int)(0.1 * this.getWidth());
        kruinDiameter = (int)(0.3 * this.getWidth());
        
        tekenBoom(g);
    }
    
    private void tekenBoom(Graphics g){
        double pixPerCm = ((this.getHeight() - kruinDiameter) / (double) boom.MAX_HOOGTE);
        int stamHoogte = (int)(pixPerCm * boom.getHoogte());
        int xLinksBoven = (this.getWidth() - stamDikte) / 2;
        int yLinksBoven = this.getHeight() - stamHoogte;
        
        // Stam
        g.setColor(new Color(145, 89, 11));
        g.fillRect(xLinksBoven, yLinksBoven, stamDikte, stamHoogte);
        
        // Kruin
        g.setColor(new Color(117, 188, 84));
        g.fillOval((int)((this.getWidth() - kruinDiameter) / 2), yLinksBoven - kruinDiameter, kruinDiameter, kruinDiameter);
    }
    
    public boolean groeiBoom(){
        boolean res = boom.groei();
        repaint();
        return res;
    }
    
    public boolean snoeiBoom(){
        boolean res = boom.snoei();
        repaint();
        return res;
    }
    
    public String getBoomText(){
        return boom.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
