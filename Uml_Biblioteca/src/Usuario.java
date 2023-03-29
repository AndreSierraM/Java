import java.util.ArrayList;

public class Usuario {
    private String user;
    private String contraseña;
    private static ArrayList<Usuario> usuarios;

    public Usuario(String user, String contraseña) {
        this.user = user;
        this.contraseña = contraseña;
        this.usuarios = new ArrayList<>();
    }

    public static void agregarUsuario(Usuario nuevoUsuario) {
        usuarios.add(nuevoUsuario);
    }

    public static Usuario verificar(String user, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(user) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static void ingresar_nuevo(String userRegistro, String contraseñaRegistro) {
    }
}
