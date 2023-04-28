package Parte2;

import java.util.Scanner;

/**
 * Practica 14.2, parte 2
 * 
 * Ejercicio 3
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio3 {

  public static void main(String[] args) {

    int numero = (int)(Math.random()* 6);

    switch (numero) {
      case 1:
          NumberFormatException();
        break;
    
      default:
        break;
    }

  }

  public static void NumberFormatException() throws NumberFormatException{
    try (Scanner datos = new Scanner(System.in)){

      System.out.println("Introduce una palabra para dar el error: ");
      int error = datos.nextInt();

    } catch (NumberFormatException e) {

      System.out.println(e.getMessage());
      System.out.println(e.getClass());
      throw e;

    }
  }
  
}
