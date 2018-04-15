/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import frame_clases.NewJFrame;
import frame_clases.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author casa
 */
public class hilosProgresivo extends Thread {
    private JFrame ta;
    private JTextField o;
    public hilosProgresivo(JTextField text,JFrame t) {
        ta=t;
        o=text;
   
    }
   
    
    public void run()
    {
        for(int x=0;x<=100;x+=10){
            try {
                NewJFrame.jProgressBar1.setValue(x);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilosProgresivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            NewJFrame.jProgressBar1.setValue(x);
        }
        Principal n=new Principal();
        Principal.jMenu3.setText(o.getText());
        n.setVisible(true);
        ta.setVisible(false);
        JOptionPane.showMessageDialog(null, "Bienvenido Cliente","Login confirmado",JOptionPane.INFORMATION_MESSAGE);
    }
}
