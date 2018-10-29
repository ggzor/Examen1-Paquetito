import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

   try{
        Scanner opcion = new Scanner(System.in);
    ArrayList<ExpedienteRegular> arreglo1 = EntradaSalidaExpediente.leerExpedienteRegular();
    ArrayList<ExpedienteDiabetico> arreglo2 = EntradaSalidaExpediente.leerExpedienteDiabetico();
    ArrayList<ExpedienteMenorEdad> arreglo3 = EntradaSalidaExpediente.leerExpedienteMenor();
   
    ArrayList<Expediente> arreglo = new ArrayList <Expediente>();
    arreglo.addAll(arreglo1);
    arreglo.addAll(arreglo2);
    arreglo.addAll(arreglo3);
    
    System.out.println("\t\t\t Menú: \nSeleccione una opción:\n" + "\t 1.-Buscar la impormacion de un paciente por nombre.\n"
            + "\t 2.-Buscar el nombre de los paciente que acudieron \n" + "\t a una consulta en determinada fecha.\n"
            + "\t 3.-Buscar por número de expediente.\n" + "\t 4.-Número de cada tipo de pacientes. \n "
            + "\t 0.-Salir. \n ");
        
    int entrada = opcion.nextInt();  
    
    do {
      switch (entrada) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        System.out.println(
            "\t\t\t Menú: \nSeleccione una opción:\n" + "\t 1.-Número de pacientes diabeticos e hipertensos.\n"
                + "\t 2.-Número de pacientes menores de 12 años \n" + "\t 3.-Número de pacientes regulares.\n"
                + "\t 0.-Salir. \n ");
        do {
          switch (opcion.nextInt()) {
          case 1:
            
            break;
          case 2:
            break;
          case 3:
            break;
          default:
            System.out.println("Opcion Inválida.");
            break;
          case 0:
            System.out.println("adiós :)");
            break;
          }
        } while (opcion.nextInt() != 0);
      default:
        System.out.println("Opcion Inválida.");
        break;
      }
    } while (opcion.nextInt() != 0);
   } catch (Exception re) {

   }
  }
}
