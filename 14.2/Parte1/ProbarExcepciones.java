import java.util.Scanner;

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
        System.out.print("Introduce una opción: ");
        int opcion = datos.nextInt();
        switch (opcion) {
          case 1:
              
            break;
          case 2:
              opcion2();
            break;
          case 3:
              opcion3();
            break;
          case 4:
              
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
