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
}