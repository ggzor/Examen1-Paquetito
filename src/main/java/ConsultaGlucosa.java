public class ConsultaGlucosa {
  private Fecha fechaConsulta;
  private int nivelGlucosa;

  public ConsultaGlucosa (int nivelGlucosa, Fecha fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    this.nivelGlucosa = nivelGlucosa;
  }
  
  public Fecha getFechaConsulta() {
    return fechaConsulta;
  }

  public int getNivelGlucosa() {
    return nivelGlucosa;
  }

  public String toString() {
    return fechaConsulta + " = " + nivelGlucosa;
  }
}