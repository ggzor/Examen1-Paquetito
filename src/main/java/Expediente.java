import java.util.Vector;

public abstract class Expediente {
  private Paciente paciente;
  private Vector <Fecha> consultas;
  private int identificador;
  private static int contador = 1;

  public Expediente (Vector<Fecha> consultas,Paciente paciente) {
    this.consultas = consultas;
    this.paciente = paciente;
    this.identificador = contador;
    contador++;
  }

  public Vector<Fecha> getConsultas() {
    return consultas;
  }

  public Paciente getPaciente() {
    return paciente;
  }
 
  public int getIdentificador() {
    return identificador;
  }

  public String toString() {
    StringBuilder consultasString = new StringBuilder();

    for (int i = 0; i < consultas.size(); i++) {
      consultasString.append("  - ");
      consultasString.append(consultas.get(i));
      consultasString.append('\n');
    }

    return "Identificador: " + identificador + "\n"
         + paciente + "\n"
         + "Consultas: \n" + consultasString;
  }
}