import java.util.Scanner;

public class ejercicio16 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      int contador,verfal;

      contador = 0;

      System.out.println("---- T E S T   D E   F I D E L I D A D ----");

      System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("2. Ha aumentado sus gastos de vestuario. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }
      
      System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }
      
      System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer). (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("5. No te deja que mires la agenda de su teléfono móvil. (Verdadero/Si = 1, Falso/No = 0)");
       verfal = s.nextInt();

       System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("9. Has notado que últimamente se perfuma más. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo. (Verdadero/Si = 1, Falso/No = 0)");
      verfal = s.nextInt();

      System.out.println("\n");

      if ( verfal == 1 ){

        contador = contador + 3;

      }

      if ( contador <= 10  ){

        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");

      }

      if ((contador >= 11) && ( contador <= 22  )){

        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

      }

      if ( contador >22 ){

        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");

      } 
  }
}





