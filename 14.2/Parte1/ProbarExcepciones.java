import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Practica 14.2, parte 1
 * 
 * @author Jorge Reina Romero
 */

public class ProbarExcepciones {
  public static void main(String[] args) {
    
    

    boolean condition = true;

    try (Scanner datos = new Scanner(System.in);) {
      do {

        System.out.println("MENU");
        System.out.println("Opcion 1: StackOverFlowError");
        System.out.println("Opcion 2: NumberFormatException");
        System.out.println("Opcion 3: ArrayIndexOutOfBoundsException");
        System.out.println("Opcion 4: FileNotFoundException");
        System.out.println("Opcion 5: ArithmeticException");
        System.out.println("Opcion 6: Salir");
        System.out.println();
        System.out.print("Introduce una opcion: ");
        int opcion = datos.nextInt();
        switch (opcion) {
          case 1:
              opcion1(0);
            break;
          case 2:
              opcion2();
            break;
          case 3:
              opcion3();
            break;
          case 4:
              opcion4();
            break;
          case 5:
              opcion5(18);
            break;
          case 6:
            condition = false;
            break;
          default:
            break;
        }
      } while (condition);
    } catch (ArithmeticException e) {
      System.out.println("Los datos introducidos no son correctos");
    }

  }

  public static void opcion1(int i) throws StackOverflowError {
    try {
      System.out.println("Llamada número: " + i);
      opcion1(i+1);
    } catch (StackOverflowError e) {
      System.out.println(e.getMessage());
      System.out.println(e.getClass());
      throw e;
    }
}

  public static void opcion2() throws NumberFormatException {
    
    try (Scanner s = new Scanner(System.in);) {
      System.out.print("Introduce una palabra: ");
      int respuesta = Integer.parseInt(s.next());
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getClass());
      throw e;
    }
  }

  public static void opcion3() throws ArrayIndexOutOfBoundsException {
    try (Scanner s = new Scanner(System.in);) {
      int x[] = new int[5];
      for (int i = 0; i < 6; i++) {
        x[i] = 1;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getClass());
      throw e;
    }
  }

  public static void opcion4() {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("archivo_que_no_existe.txt"));
        String linea = null;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
      } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
      } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
      }
  }

  public static int opcion5(int x) throws ArithmeticException {
    try {
      return x / 0;
    } catch (ArithmeticException ae) {
      System.out.println(ae.getMessage());
      System.out.println(ae.getClass());
      throw ae;
    }
    
  }

}
