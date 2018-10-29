import java.util.Vector;
import java.util.ArrayList;


public class Busqueda {
  private ArrayLimport <Expediente> arreglo = new ArrayList <Expediente>();
  
  
  public Expediente buscarPorNumeroExpediente() {
    return null;
  }

  public Nombre buscarPorFechaConsultaDeterminada() {
    return null;
  }

  public Expediente buscarPorNombre() {
    return null;
  }

  public int contarNumeroPacientesRegulares(Vector<Expediente> arreglo) {
    int cuentaPR = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteRegular) {
        cuentaPR++;
      }
    }

    return cuentaPR;
  }

  public int contarNumeroPacientesDiabeticos(Vector<Expediente> arreglo) {
    int cuentaPD = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteDiabetico) {
        cuentaPD++;
      }
    }

    return cuentaPD;
  }

  public int contarNumeroPacientesMenoresEdad(Vector<Expediente> arreglo) {
    int cuentaPME = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteMenorEdad) {
        cuentaPME++;
      }
    }

    return cuentaPME;
  }
   
}