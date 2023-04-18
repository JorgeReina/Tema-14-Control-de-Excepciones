package Parte3;

import java.util.Scanner;

public class ElCorteIslandes {
  public static void main(String[] args) {
    try {

      Scanner datos = new Scanner(System.in);

    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);
    System.out.println(t1);
    System.out.println(t2);
    t1.gasta(45.90);
    t2.gasta(5);
    t2.gasta(200);
    t1.gasta(3.55);
    System.out.println(t1);
    System.out.println(t2);
    TarjetaRegalo t3 = t1.fusionaCon(t2);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

    System.out.println();
    System.out.print("Introduce un número:");
    int numero = datos.nextInt();

    } catch (Exception e) {

      System.out.println("Excepción: " + e.getClass());
      System.out.println("Error: " + e.getMessage());
      System.out.println("Los datos introducidos no son correctos.");

    }
  }
}