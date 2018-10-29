import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class  EntradaSalidaExpediente {

  public static Vector<String> leerExpedienenteR() throws FileNotFoundException {
    FileInputStream archivo = new FileInputStream("Pacientes.txt");
    Scanner sc = new Scanner(archivo);
    Vector<String> vector = new Vector<String>();

    while (sc.hasNext()) {
      vector.addElement(sc.nextLine());
    }
    return vector;
  }

  public static ArrayList<ExpedienteRegular> leerExpedienteRegular() throws FileNotFoundException {
    Vector<String> vector = leerExpedienenteR();
    ArrayList<ExpedienteRegular> expedientesRegulares = new ArrayList<ExpedienteRegular>();

    for (int i = 0; i < vector.size(); i++) {
      expedientesRegulares.add(leerPacienteRegular(vector.get(i)));
    }
    return null;
  }

  public static ExpedienteRegular leerPacienteRegular(String cadena) {
    ByteArrayInputStream entrada = new ByteArrayInputStream(cadena.getBytes());
    Scanner sc = new Scanner(entrada);
    Vector<Fecha> fechas = new Vector<Fecha>();
    ExpedienteRegular expedienteRegular = new ExpedienteRegular(fechas, leerPaciente(sc));

    while (sc.hasNext()) {
      fechas.add(leerFecha(sc.next()));
    }
    return expedienteRegular;
  }
  
  public static Paciente leerPaciente(Scanner sc) {
    return new Paciente(
      new Nombre (sc.next(), sc.next() , sc.next()),
      leerFecha(sc.next()),
      sc.next().charAt(0),
      sc.nextFloat(),
      sc.nextFloat(),
      sc.next()
    );
  }

  public static Fecha leerFecha(String cadena) {
    String valores[] = cadena.split("/");

    return new Fecha(
      Integer.parseInt(valores[0]), 
      Integer.parseInt(valores[1]), 
      Integer.parseInt(valores[2])
    );
  }



  public static Vector<String> leerExpedienenteD() throws FileNotFoundException {

    FileInputStream archivo = new FileInputStream("PacientesDiabeticos.txt");
    Scanner sc2 = new Scanner(archivo);
    Vector<String> vector2 = new Vector<String>();

    while (sc2.hasNext()) {
      vector2.addElement(sc2.nextLine());
    }
    return vector2;
  }

  public static ArrayList<ExpedienteDiabetico> leerExpedienteDiabetico() throws FileNotFoundException {
    Vector<String> vector2 = leerExpedienenteD();
    ArrayList<ExpedienteDiabetico> expedientesDiabeticos = new ArrayList<ExpedienteDiabetico>();

    for (int i = 0; i < vector2.size(); i++) {
      expedientesDiabeticos.add(leerPacienteDiabetico(vector2.get(i)));
    }
    return null;
  }

  public static ExpedienteDiabetico leerPacienteDiabetico(String cadena) {
    ByteArrayInputStream entrada = new ByteArrayInputStream(cadena.getBytes());
    Scanner sc2 = new Scanner(entrada);
    Vector<Fecha> fechas = new Vector<Fecha>();
    Vector<ConsultaGlucosa> registroGlucosa = new Vector<ConsultaGlucosa>();
    ExpedienteDiabetico expedienteDiabetico = new ExpedienteDiabetico(fechas, leerPaciente(sc2), registroGlucosa);

    String leido;

    do {
      leido = sc2.next();
      if (sc2.hasNext() && !leido.equals("|")) {
        fechas.add(leerFecha(leido));
      }
    } while (sc2.hasNext() && !leido.equals("|"));

    while (sc2.hasNext()) {
      registroGlucosa.add(leerConsultaGlucosa(sc2));
    }

    return expedienteDiabetico;
  }

  public static ConsultaGlucosa leerConsultaGlucosa(Scanner sc2) {
    return new ConsultaGlucosa(Integer.parseInt(sc2.next()), leerFecha(sc2.next()));
  }



  
  public static Vector<String> leerExpedienenteM() throws FileNotFoundException {

    FileInputStream archivo = new FileInputStream("PacientesMenores.txt");
    Scanner sc3 = new Scanner(archivo);
    Vector<String> vector3 = new Vector<String>();

    while (sc3.hasNext()) {
      vector3.addElement(sc3.nextLine());
    }
    return vector3;
  }

  public static ArrayList<ExpedienteMenorEdad> leerExpedienteMenor() throws FileNotFoundException {
    Vector<String> vector3 = leerExpedienenteM();
    ArrayList<ExpedienteMenorEdad> expedientesMenoresEdad = new ArrayList<ExpedienteMenorEdad>();

    for (int i = 0; i < vector3.size(); i++) {
      expedientesMenoresEdad.add(leerPacienteMenorEdad(vector3.get(i)));
    }
    return null;
  }

  public static ExpedienteMenorEdad leerPacienteMenorEdad(String cadena) {
    ByteArrayInputStream entrada = new ByteArrayInputStream(cadena.getBytes());
    Scanner sc3 = new Scanner(entrada);
    Vector<Fecha> fechas = new Vector<Fecha>();
    Vector<ConsultaVacuna> registroVacunas = new Vector<ConsultaVacuna>();
    ExpedienteMenorEdad expedienteMenorEdad = new ExpedienteMenorEdad(fechas, leerPaciente(sc3), registroVacunas);

    String leido;

    do {
      leido = sc3.next();
      if (sc3.hasNext() && !leido.equals("|")) {
        fechas.add(leerFecha(leido));
      }
    } while (sc3.hasNext() && !leido.equals("|"));

    while (sc3.hasNext()) {
      registroVacunas.add(leerConsultaVacuna(sc3));
    }

    return expedienteMenorEdad;
  }

  public static ConsultaVacuna leerConsultaVacuna(Scanner sc3) {
    return new ConsultaVacuna(sc3.next(), leerFecha(sc3.next()));
  }
}