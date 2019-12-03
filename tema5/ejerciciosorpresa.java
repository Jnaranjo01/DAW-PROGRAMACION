import java.util.Scanner;

public class ejerciciosorpresa {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);

    int altura;
    int altura2;
    int h;
    int cont;
    int espacios;
    int espacios2;
    int caracter;
    int varcaracter;
    
    
    System.out.println("Dime la altura inicial: ");

    altura = s.nextInt();

    System.out.println("Dime el incremento de la altura: ");

    h = s.nextInt();

    System.out.println("Dime las veces que quieres que se pinte la piramide: ");
    
    cont = s.nextInt();
    
    altura2 = 1;
    espacios = altura -1;
    espacios2 = 1;
    varcaracter=1;
    
    while (cont > 0){
      while (altura2 <= altura){
         espacios = altura -1;
        while(espacios >= espacios2){
          
          System.out.print(" ");
          espacios = espacios -1;
          
        }

            caracter = 1;
        while (caracter<=varcaracter){

          System.out.print("*");
          caracter = caracter+1;
        }
        System.out.print("\n");
        espacios2 = espacios2+1;
        varcaracter = varcaracter+2;
        altura2 = altura2 + 1;
      }
      cont = cont - 1;
    }

  }
}
