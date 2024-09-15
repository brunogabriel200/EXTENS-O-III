import java.util.ArrayList;

public class Administrador {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Usuario> usuariosGerenciados;

    
    public Administrador(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.usuariosGerenciados = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Usuario> getUsuariosGerenciados() {
        return usuariosGerenciados;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuariosGerenciados.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuariosGerenciados.remove(usuario);
    }
}