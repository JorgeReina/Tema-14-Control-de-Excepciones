import java.util.Scanner;

public class ProbarExcepciones {
  public static void main(String[] args) {
    
    Scanner datos = new Scanner(System.in);

    boolean condition = true;

    try {
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
          case 6:
            condition = false;
            break;
          default:
            break;
        }
      } while (condition);
    } catch (Exception e) {
      // TODO: handle exception
    }

  }
}
