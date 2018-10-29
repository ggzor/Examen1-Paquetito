public class Nombre {
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;

  public Nombre (String nombre, String apellidoPaterno, String apellidoMaterno) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getNombre() {
    return nombre;
  }  

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  @Override
  public String toString() {
    return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
  }
}