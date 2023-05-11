package Parte1;

public class PruebaVehiculos {

  public static void main(String[] args) {

    boolean repetir = true;

    do {
        int opcion = 0;
        int km;
        
        Bicicleta bhSpeedrom = new Bicicleta(9);
        Coche saab93 = new Coche(1900);
  
        while (opcion != 8) {
          System.out.println("\n1. Anda con la bicicleta");
          System.out.println("2. Haz el caballito con la bicicleta");
          System.out.println("3. Anda con el coche");
          System.out.println("4. Quema rueda con el coche");
          System.out.println("5. Ver kilometraje de la bicicleta");
          System.out.println("6. Ver kilometraje del coche");
          System.out.println("7. Ver kilometraje total");
          System.out.println("8. Salir");
          System.out.println("Elige una opción (1-8): ");
          
          String opcionStr = System.console().readLine();
          if (isNumeric(opcionStr)) {
            opcion = Integer.parseInt(opcionStr);
          } else {
            System.out.println("Entrada inválida. Intente nuevamente.");
            continue;
          }
          
          switch (opcion) {
            case 1:
              System.out.print("¿Cuántos kilómetros quiere recorrer? ");
              String kmStr = System.console().readLine();
              if (isNumeric(kmStr)) {
                km = Integer.parseInt(kmStr);
                bhSpeedrom.recorre(km);
              } else {
                System.out.println("Entrada inválida. Intente nuevamente.");
              }
              break;
            case 2:
              bhSpeedrom.hazCaballito();
              break;
            case 3:
              System.out.print("¿Cuántos kilómetros quiere recorrer? ");
              kmStr = System.console().readLine();
              if (isNumeric(kmStr)) {
                km = Integer.parseInt(kmStr);
                saab93.recorre(km);
              } else {
                System.out.println("Entrada inválida. Intente nuevamente.");
              }
              break;
            case 4:
              saab93.quemaRueda();
              break;
            case 5:
              System.out.print("La bicicleta lleva recorridos ");
              System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
              break;
            case 6:
              System.out.print("El coche lleva recorridos ");
              System.out.println(saab93.getKilometrosRecorridos() + " Km");
              break;
            case 7:
              System.out.print("Los vehículos llevan recorridos ");
              System.out.println(Vehiculo.getKilometrosTotales() + " Km");
              break;
            default:
              System.out.println("Opción inválida. Intente nuevamente.");
              break;
          } // switch
        } // while

        System.out.println("¿Desea repetir? (true/false)");
        String repetirStr = System.console().readLine();
        repetir = Boolean.parseBoolean(repetirStr);

    } while (repetir);
  }

  // comprueba si la cadena es un número
  private static boolean isNumeric(String str){
    return str != null && str.matches("[0-9.]+");
  }

}
