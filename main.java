public class main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("João", "joao@email.com", "senha123");
        
        
        Livro livro1 = new Livro("Java para Iniciantes", "Autor X", "1234567890", true);
        Livro livro2 = new Livro("Python para Iniciantes", "Autor Y", "0987654321", true);
        
        
        Troca troca = new Troca(livro1, livro2, usuario);
        
        
        System.out.println("Usuário adicionado: " + usuario.getNome());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Login bem-sucedido: " + usuario.login("joao@email.com", "senha123"));
        
        System.out.println("Título do Livro 1: " + livro1.getTitulo());
        System.out.println("Autor do Livro 1: " + livro1.getAutor());
        System.out.println("ISBN do Livro 1: " + livro1.getIsbn());
        System.out.println("Disponível do Livro 1: " + livro1.isDisponivel());
        
        System.out.println("Título do Livro 2: " + livro2.getTitulo());
        System.out.println("Autor do Livro 2: " + livro2.getAutor());
        System.out.println("ISBN do Livro 2: " + livro2.getIsbn());
        System.out.println("Disponível do Livro 2: " + livro2.isDisponivel());
        
        System.out.println("Troca criada entre livros: " + troca.getLivroOferecido().getTitulo() + " e " + troca.getLivroDesejado().getTitulo());
        
    }
}

