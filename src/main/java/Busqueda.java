
import java.util.ArrayList;


public class Busqueda {
  private ArrayList<Expediente> arreglo = new ArrayList <Expediente>();

  public Busqueda (ArrayList<Expediente> arreglo){
    this.arreglo = arreglo;
  }
  
  public void buscarPorNumeroExpediente(int buscado) {
    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      if(busqueda.getIdentificador() == buscado){
  
      }
    }
  }

  public Nombre buscarPorFechaConsultaDeterminada(String buscado) {
    ArrayList<Nombre> nombres = new ArrayList <Nombre>(); 

    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      for (int j = 0; i < max; g++) {
        
      }
      if(busqueda.getConsultas().get(i)
      .toString().equals(buscado) ){
  
      }
    }
  }
  }

  public void buscarPorNombre(String buscado) {
    for (int i = 0; i < arreglo.size(); i++) {
      Expediente busqueda = arreglo.get(i);
      if(busqueda.getPaciente().getNombre().toString().equals(buscado) ){
  
      }
    }
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