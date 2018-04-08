/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import frame_clases.NewJFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author casa
 */
public class hilosProgresivo extends Thread {
   
    public void run()
    {
        for(int x=0;x<100;x+=10){
            NewJFrame.jProgressBar1.setValue(x);
        }
    }
}
