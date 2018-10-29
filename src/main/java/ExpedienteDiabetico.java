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

  public String toString() {
    StringBuilder registroGlucosaCadena = new StringBuilder();

    for (int i = 0; i < registroGlucosa.size(); i++) {
      registroGlucosaCadena.append("  - ");
      registroGlucosaCadena.append(registroGlucosa.get(i));
      registroGlucosaCadena.append('\n');
    }

    return super.toString() + "\n"
         + "Registro de glucosa: \n" + registroGlucosaCadena;
  }
}