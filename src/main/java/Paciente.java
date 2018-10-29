public class Paciente {
  private Nombre nombre;
  private Fecha fechaNacimiento;
  private char genero;
  private float peso;
  private float estatura;
  private String numeroTelefonico;
  

  public Paciente (Nombre nombre, Fecha fechaNacimiento, char genero, float peso, float estatura, String numeroTelefonico) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.genero = genero;
    this.peso = peso;
    this.estatura = estatura;
    this.numeroTelefonico = numeroTelefonico;
  }

   public Nombre getNombre() {
    return nombre;
  }

  public Fecha getFechaNacimiento() {
    return fechaNacimiento;
  }

  public char getGenero() {
    return genero;
  }
 
  public float getPeso() {
    return peso;
  }
 
  public float getEstatura() {
    return estatura;
  }

  public String getNumeroTelefonico() {
    return numeroTelefonico;
  }

  public String toString() {
    return "Paciente: " + nombre + "\n"
         + "Fecha de nacimiento: " + fechaNacimiento + "\n"
         + "Género: " + genero + "\n"
         + "Peso: " + String.format("%.1f", peso) + "\n"
         + "Estatura: " + String.format("%.2f", estatura) + "\n"
         + "Número telefónico: " + numeroTelefonico;
  }
}