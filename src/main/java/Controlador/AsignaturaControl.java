/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Controlador;

import Modelo.Asignatura;
import Servicio.AsignaturaServiceImpl;
import java.util.List;

/**
 *
 * @author esteb
 */
public class AsignaturaControl {

  private AsignaturaServiceImpl asignaturaServiceImpl =new AsignaturaServiceImpl();
  
  public AsignaturaControl(){
  this.asignaturaServiceImpl = new AsignaturaServiceImpl(); 
  }
  public String crear(String[] data) {
      
        String retorno = "No se puede crear la Asignatura:";
        String nombre = data[0];
        String libroGuia = data[1];
        int numHoras = Integer.valueOf(data[2]).intValue();
        int numUnidades = Integer.valueOf(data[3]).intValue();
        int codigo=Integer.valueOf(data[5]).intValue();
        if (numUnidades < 0) {
            retorno += " El numero de Unidades no son validos ";
        } else {
            if (numUnidades <= 4 ) {
                retorno += " El de unidades no es valido ";
            } else {
                
                Asignatura asignatura = new Asignatura(codigo, nombre, libroGuia, numHoras, numUnidades);
                this.asignaturaServiceImpl.crear(asignatura);
                retorno = "Creado Satisfactoriamente ";
            }
  }
        return retorno;
  
}
  public List<Asignatura> listar() {
        return this.asignaturaServiceImpl.listar();
  }
}
