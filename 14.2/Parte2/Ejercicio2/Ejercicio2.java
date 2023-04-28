package Parte2.Ejercicio2;

/**
 * Practica 14.2, parte 2
 * 
 * Ejercicio 2
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    Gato garfield = new Gato("macho");
    Gato tom = new Gato("macho");
    try {
      garfield.apareaCon(tom);
    } catch (ExcepcionApareamientoImposible eai) {
      eai.printStackTrace();
      System.out.println("Dos gatos del mismo sexo no se pueden aparear.");
    }
  }
}
