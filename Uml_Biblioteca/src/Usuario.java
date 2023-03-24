import java.util.ArrayList;

public class Usuario {
    private String user;
    private String contraseña;
    private ArrayList<Usuario> users_registrados;

    public Usuario(String user, String contraseña) {
        this.user=user;
        this.contraseña=contraseña;
    }

    public boolean verificar(String user, String contraseña) {
        if (this.user.equals(user) && this.contraseña.equals(contraseña)) {
            return true;
        } else {
            return false;
        }

    }

    public String setuser(String user) {
        return this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String setContraseña(String contraseña) {
        return this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

}
