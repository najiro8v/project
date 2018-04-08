/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author casa
 */
public class Dueño {
    private Mascota mascota;
    private int Edad;
    private String Nombre_Real,Fecha_de_Nacimiento,Contraseña,Nombre_de_Usuario;
    public Dueño(Mascota mascota1,int edad, String nombre_real,String fecha_de_nacimiento,String contraseña,String nombre_de_usuario)
    {
        this.mascota=mascota1;
        this.Contraseña=contraseña;
        this.Edad=edad;
        this.Fecha_de_Nacimiento=fecha_de_nacimiento;
        this.Nombre_Real=nombre_real;
        this.Nombre_de_Usuario=nombre_de_usuario;
        
       
    }
    public String getNombre_Real()
    {
        return Nombre_Real;
    }
    public String getFecha_de_Nacimiento()
    {
        return Fecha_de_Nacimiento;
    }
    public String getContraseña()
    {
        return Contraseña;
    }
    public String getNombre_de_Usuario()
    {
        return Nombre_de_Usuario;
    }
    public int getEdad()
    {
        return Edad;
    }
    public Mascota getmascota()
    {
        return mascota;
    }
    /***************************************************************/
    public void setNombre_Real(String nombre_real)
    {
        this.Nombre_Real=nombre_real;
    }
    public void setFecha_de_Nacimiento(String fecha_de_nacimiento)
    {
        this.Fecha_de_Nacimiento=fecha_de_nacimiento;
    }
    public void setContraseña(String contraseña)
    {
       this.Contraseña=contraseña;
    }
    public void setNombre_de_Usuario(String nombre_de_usuario)
    {
        this.Nombre_de_Usuario=nombre_de_usuario;
    }
    public void setEdad(int edad)
    {
        this.Edad=edad;
    }
    public void setmascota(Mascota mascota1)
    {
        this.mascota=mascota1;
    }
    public int getTamaño() {
      return  getNombre_Real().length()*2
              + 4 
              +getNombre_de_Usuario().length()*2
              +getContraseña().length()*2
              +getFecha_de_Nacimiento().length()*2
              +getmascota().GetTamañoM();
         
    }
}
