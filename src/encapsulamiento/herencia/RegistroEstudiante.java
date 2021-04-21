
package encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //Objeto de la clase Estudiante
        
        //Agregar la clase respectiva para la lectura desde teclado
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        try{
            
            //Ingreso de los espectivos valores
            System.out.println("Carnet del estudiante");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del estudiante");
            String nombres = leer.readLine();
            System.out.println("Apellidos del estudiante");
            String apellidos = leer.readLine();
            
            //Asignando los valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombresEstudiante(nombres);
            est.setApellidosEstudiante(apellidos);
            
            
            //Recuperación de datos
            System.out.println("<<<Recuperando valores>>>");
            System.out.println("Carnet : " + est.getCarnetEstudiante());
            System.out.println("Nombres : " + est.getNombresEstudiante());
            System.out.println("Apellidos : " +est.getApellidosEstudiante());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
