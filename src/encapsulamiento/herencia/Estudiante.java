
package encapsulamiento.herencia;


public class Estudiante {
    private long carnetEstudiante;
    private String nombresEstudiante;
    private String apellidosEstudiante;

    public long getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(long carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public String getNombresEstudiante() {
        return nombresEstudiante;
    }

    public void setNombresEstudiante(String nombresEstudiante) {
        this.nombresEstudiante = nombresEstudiante;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setApellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }
}

