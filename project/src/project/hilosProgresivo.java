/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import frame_clases.NewJFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author casa
 */
public class hilosProgresivo extends Thread {
   
    public void run()
    {
        for(int x=0;x<=100;x+=10){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilosProgresivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            NewJFrame.jProgressBar1.setValue(x);
        }
        JOptionPane.showMessageDialog(null, "Bienvenido Cliente","Login confirmado",JOptionPane.INFORMATION_MESSAGE);
    }
}
