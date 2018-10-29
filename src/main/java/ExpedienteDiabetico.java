import java.util.Vector;

public class ExpedienteDiabetico extends Expediente {
  private Vector<ConsultaGlucosa> registroGlucosa;
  
  public ExpedienteDiabetico(Vector<Fecha> consultas, Paciente paciente, Vector<ConsultaGlucosa> registroGlucosa) {
    super(consultas,paciente);
    this.registroGlucosa = registroGlucosa;
  }

  public Vector<ConsultaGlucosa> getRegistroGlucosa() {
    return registroGlucosa;
  }
}