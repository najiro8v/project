/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame_clases;
import project.AL_mascota;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author casa
 */
public class Principal extends javax.swing.JFrame {
   
    DefaultTableModel modelo2=new DefaultTableModel();
    DefaultTableModel modelo=new DefaultTableModel();
    File archivo;
    ObjectInputStream oop;
    ObjectOutputStream oos; 
    private Vector linaje =new Vector();
    /**
     * Creates new form Principal
     */
    public Principal() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Peso");
        modelo.addColumn("Altura");
        modelo.addColumn("Especie");
        /*************************/
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Edad");
        modelo2.addColumn("Sexo");
        modelo2.addColumn("Peso");
        modelo2.addColumn("Altura");
        modelo2.addColumn("Especie");
        this.setVisible(true);
        initComponents();
        setSize(708, 508);
        jCheckBoxMenuItem1.setSelected(false);
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tEst21 = new project.AL_mascota();
        jPanel1 = new javax.swing.JPanel();
        jOutlookBar1 = new com.l2fprod.common.swing.JOutlookBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jOutlookBar1.setToolTipText("");
        jOutlookBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOutlookBar1MouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(jList1);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jOutlookBar1.addTab("Mascotas registradas", jPanel3);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jOutlookBar1.addTab("Mascotas Enfermas", jPanel4);

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane7.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jOutlookBar1.addTab("Mascotas Sanas", jPanel5);

        jLabel1.setText("Bienvenido a \"Pet's  Friends\"");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Se le agradece el habernos solicitado como apoyo web para la salud fisica de su mascota, como vera en el menu la ultima pestaña del lado derecho estara el nombre de su usuario.\n\npet's Friends es un sistema medico automatizado que a partir de datos y sintomas descritos\npor usted se le informara sobre las posible enfermedades de su mascota, sin embargo si \nlos sintomas perciben por mas de dos dias, se recomienda que visite un consultorio de \nveterinario, pues el programa establece lo posible con ciertas limitaciones fisiologica y medicas  ");
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jOutlookBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jOutlookBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setAlignmentY(0.5F);

        jMenu1.setText("Login");

        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mascota");

        jMenuItem3.setText("Registar una mascota");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenu3.setAlignmentX(35.0F);

        jMenuItem2.setText("Ajustes De cuenta");
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jMenu3.add(jRadioButtonMenuItem1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Modo Nocturno");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jMenuItem4.setText("Cerrar sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
    }//GEN-LAST:event_formComponentResized

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
     if(jCheckBoxMenuItem1.isSelected())
     {   jPanel1.setOpaque(true);
         jPanel2.setOpaque(true);
         jPanel3.setOpaque(true);
         jPanel4.setOpaque(true);
         jPanel5.setOpaque(true);
         jPanel6.setOpaque(true);
         this.setVisible(false);
            Color r=new Color(39,13,39);
         this.setBackground(r);
         jPanel1.setBackground(r);
         jPanel2.setBackground(r);
         jPanel3.setBackground(r);
         jPanel4.setBackground(r);
         jPanel5.setBackground(r);
         jPanel6.setBackground(r);
         
         jLabel1.setForeground(Color.white);
        
         this.setVisible(true);
     }
     else{
         this.setVisible(false);
         jPanel1.setOpaque(false);
        jPanel2.setOpaque(false);
        jPanel3.setOpaque(false);
        jPanel4.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel6.setOpaque(false);
        jScrollPane1.setOpaque(false);
        jLabel1.setForeground(Color.BLACK);
        
         this.setVisible(true);
         
     }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
       ADDmascota nuevo=new ADDmascota(jMenu3.getText());
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jOutlookBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOutlookBar1MouseClicked
        try {
            establecer_list();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jOutlookBar1MouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("boton lista");
        try {
            establecer_list();
        } catch (IOException ex) {
           // Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       while(modelo.getRowCount()!=0) {
             modelo.removeRow(0);
            }
        System.out.println("boton enfermo");
       try {
            establecerModelo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        while(modelo2.getRowCount()!=0) {
             modelo2.removeRow(0);
            }
        System.out.println("bton sanos");
        try {
            establecerModelo1();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        LOGIN regreso=new LOGIN();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private com.l2fprod.common.swing.JOutlookBar jOutlookBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private project.AL_mascota tEst21;
    // End of variables declaration//GEN-END:variables
public void settext(String text)
{
   jMenu3.setText(text);
}
    public void establecer_list() throws IOException{
        DefaultListModel temp=new DefaultListModel();/*
        archivo=new File("Users//"+jMenu3.getText());
         try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    Dueño next=(Dueño)linaje.get(0);*/
        String t=jMenu3.getText()+".dat";
      //  System.out.println("1");
        AL_mascota.CrearFileDueño(new File(t)); 
       // System.out.println(t);
        int s=AL_mascota.getNumeroRegistro();
        //System.out.println("2");
        //System.out.println(AL_mascota.getNumeroRegistro());
        for(int i=0;i<s/*next.getlistalenght()*/;i++ ){
       // System.out.println(AL_mascota.getDueño(i)+"12");    
    temp.addElement(" Nombre : \""+AL_mascota.getDueño(i).getName()/*next.getmascotaList(i).getName()*/+"\"");
    temp.addElement("                 edad : "+AL_mascota.getDueño(i).getEdad());//next.getmascotaList(i).getEdad());
    temp.addElement("                 sexo : "+AL_mascota.getDueño(i).getSexo());//next.getmascotaList(i).getSexo());
    temp.addElement("                 Peso : "+AL_mascota.getDueño(i).getPeso());//next.getmascotaList(i).getPeso());
    temp.addElement("                 Estatura : "+AL_mascota.getDueño(i).getEstatura());//next.getmascotaList(i).getEstatura());
    temp.addElement("                 Especie  : "+AL_mascota.getDueño(i).getEspecie());//next.getmascotaList(i).getEspecie());
    temp.addElement("---------------------------------------------------------------------------------------------------------------------");
    
}AL_mascota.cerrar();jList1.setModel(temp);
         
    }
    
    public void establecerModelo() throws IOException
    {
       /*archivo=new File("Users//"+jMenu3.getText());
         try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    Dueño next=(Dueño)linaje.get(0);
      */
        String t=jMenu3.getText()+".dat";
        AL_mascota.CrearFileDueño(new File(t));       
    Object []temp= new Object[6];
    for(int i=0;i<AL_mascota.getNumeroRegistro()/*next.getlistalenght()*/;i++ ){
    if(/*next.getmascotaList(i)*/AL_mascota.getDueño(i).getEnfermo()==true)
        {
            
            temp[0]= AL_mascota.getDueño(i).getName();//next.getmascotaList(i).getName();
            temp[1]=AL_mascota.getDueño(i).getEdad();//next.getmascotaList(i).getEdad();
            temp[2]=AL_mascota.getDueño(i).getSexo();//next.getmascotaList(i).getSexo();
            temp[3]=AL_mascota.getDueño(i).getPeso();//next.getmascotaList(i).getPeso();
            temp[4]=AL_mascota.getDueño(i).getEstatura();//next.getmascotaList(i).getEstatura();
            temp[5]=AL_mascota.getDueño(i).getEspecie();//next.getmascotaList(i).getEspecie();
            
            modelo.addRow(temp);
        }
    }
        AL_mascota.cerrar();jTable1.setModel(modelo);
    }
    
  
    
    
    
    
    
    public void establecerModelo1() throws IOException
    {
     /*  archivo=new File("Users//"+jMenu3.getText());
         try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    Dueño next=(Dueño)linaje.get(0);*/
    String t=jMenu3.getText()+".dat";
        AL_mascota.CrearFileDueño(new File(t));  
    Object []temp= new Object[6];
    for(int i=0;i<AL_mascota.getNumeroRegistro();i++ ){
    //for(int i=0;i<next.getlistalenght();i++ ){
    if(/*next.getmascotaList(i)*/AL_mascota.getDueño(i).getEnfermo()==false)
        {
            AL_mascota.getDueño(i);
            temp[0]= AL_mascota.getDueño(i).getName();//next.getmascotaList(i).getName();
            temp[1]=AL_mascota.getDueño(i).getEdad();//next.getmascotaList(i).getEdad();
            temp[2]=AL_mascota.getDueño(i).getSexo();//next.getmascotaList(i).getSexo();
            temp[3]=AL_mascota.getDueño(i).getPeso();//next.getmascotaList(i).getPeso();
            temp[4]=AL_mascota.getDueño(i).getEstatura();//next.getmascotaList(i).getEstatura();
            temp[5]=AL_mascota.getDueño(i).getEspecie();//next.getmascotaList(i).getEspecie();
            
            modelo2.addRow(temp);
        }
    }
       AL_mascota.cerrar();jTable2.setModel(modelo2);
    }
    
}
