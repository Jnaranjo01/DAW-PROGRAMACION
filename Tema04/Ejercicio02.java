import java.util.Scanner;

public class Ejercicio02 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      int hora;
      
      System.out.print("Introduce la hora del dia, obviando los minutos: ");

      hora = s.nextInt();

      if ((6<=hora) && (hora<=12)){

        System.out.println("Buenos días!");

      }

      if ((13<=hora) && (hora<=20)){

        System.out.println("Buenas tardes!");

      }

      if ((hora>=0) && (hora<=5) || (21<=hora) && (hora<=23)){

        System.out.println("Buenas Noches!");

      }
      if (hora>24){

        System.out.println("Esa hora no comprende al sistema horario");

      }

    }
  }

