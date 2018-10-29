public class ConsultaVacuna {
  private Fecha fechaConsulta;
  private String tipoVacuna;

  public ConsultaVacuna (String tipoVacuna, Fecha fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    this.tipoVacuna = tipoVacuna;
  }
  
  public Fecha getFechaConsulta() {
    return fechaConsulta;
  }
 
  public String getTipoVacuna() {
    return tipoVacuna;
  }

  public String toString() {
    return fechaConsulta + " -> " + tipoVacuna;    
  }
}