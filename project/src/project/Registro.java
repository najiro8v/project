/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import frame_clases.Dueño;
import frame_clases.Mascota;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
//import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author casa
 */
public class Registro {
    File archivo;
    ObjectInputStream oop;
    ObjectOutputStream oos; 
    private  int edad;
    private static int Tamaño_Registro=80000;
    private static int numero_de_Regsitros;
    private Dueño nuevo,tol;
    private String nombreR,fechaN,CONTRASEÑA,nombreU,CLAVE;
    private static  RandomAccessFile flujo;
    private Vector linaje =new Vector();
    public Registro()
    {
        
        
        
    }
    
    public boolean addDueño(int edad1, String nombre_real,String fecha_de_nacimiento,String contraseña,String nombre_de_usuario,String email )
    {
        
        this.edad=edad1;
        nombreR=nombre_real;
        fechaN=fecha_de_nacimiento;
        CONTRASEÑA=contraseña;
        nombreU=nombre_de_usuario;
        nuevo=new Dueño(nombreU,edad,nombreR,fechaN,CONTRASEÑA,email);
        archivo=new File("Users//"+nombreU);
        if(archivo.exists()){
        JOptionPane.showMessageDialog(null,"Nombre de Usuario ya registrado","Revision de usuarios ",JOptionPane.PLAIN_MESSAGE);
        
        return false;}
        else{
        add(nuevo);
        return true;}
        
    }
    
    /*public void addMASCOTA_a_Dueño(String nombre,String sexo,float peso,float estatura,int edad,String Espec)
    {
        Mascota pet=new Mascota(nombre, sexo, peso,estatura ,edad,Espec );
        Lectura_para_mascota();
        Dueño Temp=(Dueño)linaje.get(0);
        Temp.setmascota(pet);
        Temp.addLIST();
        add(Temp);     
    }*/
    
    public void add(Dueño magic){
    linaje.add(magic);
    file();
    }
    
    public void file()  {
    try{oos=new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(linaje);
        oos.close();
    }
    catch(IOException e){}
    
    }
    public void LEctura()
    {
        try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    
    }
    public void Key(String key){
    archivo=new File("Users//"+key);
        CLAVE=key;}
     public void Lectura_para_mascota()
    {   File archivo=new File("Users//"+CLAVE);
        try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    
    }
    
    public void show(){
        LEctura();
        int i= linaje.size();
        for(int j=0;j<i;j++)
        {
            tol=(Dueño)linaje.get(j);
            JOptionPane.showMessageDialog(null,"el usuario: "+tol.getNombre_de_Usuario()+"\nnombre: "+tol.getNombre_Real()
                    +"\nFecha de Nacimiento: "+tol.getFecha_de_Nacimiento()
                    +"\nEdad: "+tol.getEdad()+"\nCorreo Electronico: "+tol.getEmail(),"datos del usuario", JOptionPane.ERROR_MESSAGE);
        }
    }

   /* public void showC(){
        LEctura();
        
        
            tol=(Dueño)linaje.get(0);
            for(int i=0;i<tol.getlistalenght();i++ ){
            JOptionPane.showMessageDialog(null,"el usuario:"+tol.getNombre_de_Usuario()+"\nnombre: "+tol.getNombre_Real()
                    +"\nFecha de Nacimiento "+tol.getFecha_de_Nacimiento()
                    +"\nFecha de Nacimiento "+tol.getEdad()+"\n Mascota #"+(i+1)+
                    "\nNombre de la Mascota "+tol.getmascotaList(i).getName()
                    +"\nedad de la Mascota "+tol.getmascotaList(i).getEdad()
                    +"\nsexo de la Mascota "+tol.getmascotaList(i).getSexo()
                    +"\nPeso de la Mascota "+tol.getmascotaList(i).getPeso()
                    +"\nEstatura de la Mascota "+tol.getmascotaList(i).getEstatura()
                    +"\nEspecie  de la Mascota "+tol.getmascotaList(i).getEspecie(),"Completo", JOptionPane.ERROR_MESSAGE);
        
            }
    } */
}
