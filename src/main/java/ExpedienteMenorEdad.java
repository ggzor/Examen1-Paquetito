import java.util.Vector;

public class ExpedienteMenorEdad extends Expediente {
  private Vector<ConsultaVacuna>  registroVacunas;

  public ExpedienteMenorEdad(Vector<Fecha> consultas, Paciente paciente, Vector<ConsultaVacuna> registroVacunas) {
      super(consultas,paciente);
      this.registroVacunas = registroVacunas;
  }

  public Vector<ConsultaVacuna> getRegistroVacunas() {
    return registroVacunas;
  }

  public String toString() {
    StringBuilder registroVacunasCadena = new StringBuilder();

    for (int i = 0; i < registroVacunas.size(); i++) {
      registroVacunasCadena.append("  - ");
      registroVacunasCadena.append(registroVacunas.get(i));
      registroVacunasCadena.append('\n');
    }

    return super.toString() + "\n"
         + "Registro de vacunas: \n" + registroVacunasCadena;
  }
}