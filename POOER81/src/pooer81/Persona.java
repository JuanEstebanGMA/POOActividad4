package pooer81;

public class Persona {
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;

    public Persona(String nombres, String apellidos, String telefono, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
