import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe que representa uma tela de login com funcionalidade básica de autenticação com login e senha.
 */
public class LoginScreen {

    // Simulando um user Database.
    private Map<String, String> userDatabase;

    /**
     * Constrói um novo objeto LoginScreen e inicializa o user Database
     * com pares de nome de usuário e senha padrão.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tenta realizar o login de um usuário com o nome de usuário e senha.
     *
     * @param username O nome de usuário que está sendo utilizado para realizar o login.
     * @param password A senha do usuário que está sendo utilizado para realizar o login.
     * @return {@code true} se o login for realizado com sucesso, {@code false} caso contrário.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; // Autenticação feita com sucesso.
            }
        }
        return false; // Autenticação falhou.
    }

    /**
     * Adiciona um novo usuário ao banco de dados.
     *
     * @param username É o nome do novo usuário.
     * @param password É a senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
