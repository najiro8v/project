/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import frame_clases.Dueño;
import frame_clases.Mascota;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author casa
 */
public class AL_mascota {    
    private static File temp;
   private static RandomAccessFile flujo;
   private static int tamaño_Arc=1200,Cant_deReg;
   public static void CrearFileDueño(File Archivo)throws IOException{
       if(Archivo.exists()&&!Archivo.isFile()){
           throw new IOException(Archivo.getName()+"!! NO es un Archivo");
       }
       flujo=new RandomAccessFile(Archivo,"rw");
       temp=Archivo;
       Cant_deReg=(int)Math.ceil((double)flujo.length()/(double)tamaño_Arc);
       
   }
   public static void cerrar()throws IOException{flujo.close();}
   public static boolean setDueño(int i,Mascota persona)throws IOException{
       if(i>=0&&i<=getNumeroRegistro()){
           if(persona.GetTamañoM()>tamaño_Arc)
           {System.out.println("\nTamaño registro excedido");}
           else{
           flujo.seek(i*tamaño_Arc);
           flujo.writeUTF(persona.getName());
           
           flujo.writeUTF(persona.getSexo());
           flujo.writeFloat(persona.getPeso());
           flujo.writeFloat(persona.getEstatura());
           flujo.writeInt(persona.getEdad());
           flujo.writeUTF(persona.getEspecie());
           flujo.writeBoolean(persona.getEnfermo());
          return true;
           
           }
           
       }
       else{System.out.println("\n el numero de registros esta fuera de limites");}
       return false;    
   }
   public static void añadirDueño(Mascota persona)throws IOException{
       if(setDueño(Cant_deReg, persona))
       {    Cant_deReg++;}
   }
   public static int getNumeroRegistro() {
      // System.out.println("HOLA?");
        return  Cant_deReg;
    }
   public static Mascota getDueño(int i) throws IOException
   {int Edad=0;
     //String Nombre_Real="",Fecha_de_Nacimiento="",Contraseña="",Nombre_de_Usuario="",Correo="";
       if(i>=0&&i<=getNumeroRegistro())
       {
           //System.out.println("linea 5");
         //  System.out.println(i*getNumeroRegistro());
        flujo.seek(i*gettam());
        // System.out.println(i*getNumeroRegistro());
         
         
           
           //System.out.println("------------------------+");
           Mascota falso=new Mascota(flujo.readUTF(),flujo.readUTF(),flujo.readFloat(),flujo.readFloat(),flujo.readInt(),flujo.readUTF(),flujo.readBoolean());
           
          // System.out.println("+++++++++++++++++");
       return falso;
       }
       else{
       return null;
       }
       
   }
   public static int gettam(){return tamaño_Arc;}
   public static int buscarRegistro(String buscado)throws IOException{
   String nombre;
   System.out.println("line 0");
   if(buscado.length()<=0)
   {
       return -1;
   }
    //  System.out.println("line 1");
    //flujo=new RandomAccessFile("Dueño.dat","r");
   // System.out.println("line 2");
  //  System.out.println(getNumeroRegistro()+"--");
   for(int i=0;i<=getNumeroRegistro();i++)
    { //  System.out.println("line 3");
  //  System.out.println(gettam()+"--"+i);
        flujo.seek(i*gettam());
      //  System.out.println(i*gettam()+"--to");
      //  System.out.println("line 4");
      //  System.out.println(buscado.length()+" ++"+getNumeroRegistro()+"++");
        nombre=getDueño(i).getName();
      //  System.out.println("line 5i");
        if(nombre.equals(buscado))
        {
          //  System.out.println("y que te hiciste?");
            return i;
        }
        
        //System.out.println("y que te hiciste wey? "+i);
    }
      // System.out.println("perdio el boer");
   return -1;
   }
   
}
