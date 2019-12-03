/* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio21 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
      Random r = new Random();

      double not1;
      double not2;
      double notmedia;
      int notrecuperacion;
      
      System.out.print("Inserte la nota de su primer examen: ");
      not1 = s.nextDouble();

      System.out.print("Inserte la nota de su segundo examen: ");
      not2 = s.nextDouble();    

      notmedia = ( not1 + not2 ) / 2;

      if (notmedia >= 5){

        System.out.println("La nota del primer examen es: "+not1);
        System.out.println("La nota de su segundo examen es: "+not2);
        System.out.printf("\nSu nota media del trimestre es: %.2f",notmedia);

      } else {

        System.out.println("La nota del primer examen es: "+not1);
        System.out.println("La nota de su segundo examen es: "+not2);
        System.out.printf("Su nota media del trimestre es %.2f, al no superar el 5 se debe someter a una recuperación",notmedia);

        

        notrecuperacion = r.nextInt(9)+1;
        
        System.out.print("\nLa nota de su recuperación es: "+notrecuperacion);

        if ( notrecuperacion < 5 ){

          System.out.println("\nSu calificación en la recuperación no es apta.");

        } else {

          System.out.println("\nSu calificación en la recuperación es apta.");

        }
      }
  }
}
