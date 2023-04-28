import java.util.Scanner;

/**
 * Practica 14.2, parte 2
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    int maximo = Integer.MIN_VALUE;

    System.out.println("Introduce 6 numeros por teclado:");

    for (int i = 0; i < 6; i++) {
      
      boolean repetir = false;

      int numeros = 0;

      do {
        try {
          numeros = datos.nextInt();
          repetir = true;
        } catch (Exception e) {
          System.out.println("El dato introducido no es correcto, porfavor introduzca uno nuevo. ");
        }
      } while (!repetir);

      if (numeros > maximo) {
        maximo = numeros;
      }

    }
    
    System.out.println("El valor maximo es: " + maximo);

  }
}
