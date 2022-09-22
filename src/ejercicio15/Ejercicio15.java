/*
 Dadas las edades y alturas de 5 alumnos, mostrar la edad y estatura media, la cantidad de alumnos mayores
de 18 años, y la cantidad de alumnos que miden más de 1.75.
 */
package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, suma_edad=0,conteoMayor18=0,conteoMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;
        
        for (int i=1; i<=5; i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su edad: "));
            altura=Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su estatura: "));
            
            suma_edad += edad; //Suma iterativa de edades
            sumaAltura += altura; //Suma iterativa de las alturas
            
            if (edad > 18){ //Si la edad es mayor a 18
                conteoMayor18++;
  
            }
            if (altura > 1.75){ //Si la altura es mayor a 1.75
               conteoMayor175++; 
            }
        }
        mediaEdad = (float) suma_edad/5;
        mediaAltura = (float) sumaAltura/5;
        
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden más de 1.75: "+conteoMayor175);
    }
    
}
