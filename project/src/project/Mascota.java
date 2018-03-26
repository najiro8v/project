/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author reyna
 */
public class Mascota {
    private String Name,Sexo;
    private int Edad;
    private float Peso,Estatura;
    public Mascota(String name,String sexo,float peso,float estatura,int edad)
    {
        this.Edad=edad;
        this.Estatura=estatura;
        this.Name=name;
        this.Peso=peso;
        this.Sexo=sexo;
    }
    public int getEdad()
    {
        return Edad;
    }
     public String getName()
    {
        return Name;
    }
      public float getEstatura()
    {
        return Estatura;
    }
       public float getPeso()
    {
        return Peso; 
    }
      public String getSexo()
    {
        return Sexo; 
    }
     /******************************SETs*********************************/
       public void setEdad(int edad)
    {
        this.Edad=edad;
    }
     public  void setName(String name)
    {
        this.Name=name;
    }
      public void setEstatura(float estatura)
    {
        this.Estatura=estatura;
    }
       public  void setPeso(float peso)
    {
        this.Peso=peso; 
    }
      public  void setSexo(String sexo)
    {
         this.Sexo=sexo; 
    }
      public int GetTamañoM()
      {
          return getSexo().length()*2+4+4+4+getName().length()*2;
      }
}
