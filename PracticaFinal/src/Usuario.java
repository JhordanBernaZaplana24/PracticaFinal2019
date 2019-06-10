import java.util.Date;

public class Usuario implements Comparable<Usuario>{
    private final String usuario;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fechaNacimiento;

    public Usuario(String usuario, String nombre, String apellidos, String email) {
        this.usuario = usuario;
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Usuario o) {
        return o.getUsuario().compareTo(this.getUsuario());
    }
}