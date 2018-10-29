import java.io.FileNotFoundException;
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

    Busqueda busqueda = new Busqueda(arreglo);
  
    do {
      System.out.println("\t\t\t Menú: \nSeleccione una opción:\n" + "\t 1.-Buscar la imformacion de un paciente por nombre.\n"
      + "\t 2.-Buscar el nombre de los paciente que acudieron \n" + "\t a una consulta en determinada fecha.\n"
      + "\t 3.-Buscar por número de expediente.\n" + "\t 4.-Número de cada tipo de pacientes. \n "
      + "\t 0.-Salir. \n ");

      System.out.println("Opcion: "); 
      int entrada = opcion.nextInt();         
      opcion.nextLine();

      switch (entrada) {
      case 1:
      //por nombre
        System.out.println("Ingrese el nombre: ");
        String nombreBuscado = opcion.nextLine();
        Expediente encontrado1 = busqueda.buscarPorNombre(nombreBuscado);

        if (encontrado1 == null){
          System.out.println("Nombre no encontrado");
        }else{
          System.out.println(encontrado1.toString());
        }
        break;
      case 2:
      //por fecha
        System.out.println("Ingrese la fecha: ");
        String fechaBuscada = opcion.next();
        opcion.nextLine();
        ArrayList<Nombre> encontrados = busqueda.buscarPorFechaConsultaDeterminada(fechaBuscada);
         
        if (encontrados == null){
          System.out.println("Nombre no encontrado");
        }else{
          for(int i = 0; i < encontrados.size(); i++) {
            System.out.println(encontrados.get(i).toString());
          }
        }
        break;
      case 3:
      //por identificador
        System.out.println("Ingrese el identificador: ");
        int identificador = opcion.nextInt();
        opcion.nextLine();
        Expediente encontrado = busqueda.buscarPorNumeroExpediente(identificador);
        if (encontrado == null){
          System.out.println("Identificador no encontrado");
        }else{
          System.out.println(encontrado.toString());
        }

        break;
      case 4:
        System.out.println(
            "\t\t\t Menú: \nSeleccione una opción:\n" + "\t 1.-Número de pacientes diabeticos e hipertensos.\n"
                + "\t 2.-Número de pacientes menores de 12 años \n" + "\t 3.-Número de pacientes regulares.\n"
                + "\t 0.-Salir. \n ");
        do {
          switch (opcion.nextInt()) {
          case 1:
            int contador1 = busqueda.contarNumeroPacientesDiabeticos();
            System.out.println("El número total de pacientes diabeticos es:" + contador1);
            break;
          case 2:
            int contador2 = busqueda.contarNumeroPacientesMenoresEdad();
            System.out.println("El número total de pacientes menores de 12 años es:" + contador2);
            break;
          case 3:
            int contador3 = busqueda.contarNumeroPacientesRegulares();
            System.out.println("El número total de pacientes regulares es:" + contador3);
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
    }catch(FileNotFoundException fe) {
      System.out.println("No se encontro el archivo"+ fe.toString());
    } catch (Exception re) {
      System.out.println("Error:" + re.toString());
    }
  }  
}
