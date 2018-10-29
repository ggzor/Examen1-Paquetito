
import java.util.ArrayList;


public class Busqueda {
  private ArrayList<Expediente> arreglo = new ArrayList <Expediente>();

  public Busqueda (ArrayList<Expediente> arreglo){
    this.arreglo = arreglo;
  }
  
  public Expediente buscarPorNumeroExpediente(int buscado) {
    Expediente encontrado = null;

    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      if(busqueda.getIdentificador() == buscado){
        encontrado = busqueda;
      }
    }
  }

  public ArrayList<Nombre> buscarPorFechaConsultaDeterminada(String buscado) {
    ArrayList<Nombre> nombres = new ArrayList <Nombre>(); 

    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      for (int j = 0; j < busqueda.getConsultas().size(); j++) {
        if(busqueda.getConsultas().get(j).toString().equals(buscado)) {
          nombres.add(busqueda.getPaciente().getNombre()); 
        }
      }
    }
    return nombres;
  }

  public Expediente buscarPorNombre(String buscado) {
    Expediente encontrado = null;

    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      if(busqueda.getPaciente().getNombre().toString().equals(buscado)){
        encontrado = busqueda;
      }
    }
    return encontrado;
  }

  public int contarNumeroPacientesRegulares() {
    int cuentaPR = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteRegular) {
        cuentaPR++;
      }
    }

    return cuentaPR;
  }

  public int contarNumeroPacientesDiabeticos() {
    int cuentaPD = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteDiabetico) {
        cuentaPD++;
      }
    }

    return cuentaPD;
  }

  public int contarNumeroPacientesMenoresEdad() {
    int cuentaPME = 0;

    for (int i = 0; i < arreglo.size(); i++) {
      if (arreglo.get(i) instanceof ExpedienteMenorEdad) {
        cuentaPME++;
      }
    }

    return cuentaPME;
  }
   
}