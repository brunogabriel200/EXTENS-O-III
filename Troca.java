public class Troca {
    private Livro livroOferecido;
    private Livro livroDesejado;
    private Usuario solicitante;
    private Usuario aceitador;

    
    public Troca(Livro livroOferecido, Livro livroDesejado, Usuario solicitante) {
        this.livroOferecido = livroOferecido;
        this.livroDesejado = livroDesejado;
        this.solicitante = solicitante;
        this.aceitador = null; 
    }

    
    public Livro getLivroOferecido() {
        return livroOferecido;
    }

    public void setLivroOferecido(Livro livroOferecido) {
        this.livroOferecido = livroOferecido;
    }

    public Livro getLivroDesejado() {
        return livroDesejado;
    }

    public void setLivroDesejado(Livro livroDesejado) {
        this.livroDesejado = livroDesejado;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public Usuario getAceitador() {
        return aceitador;
    }

    public void setAceitador(Usuario aceitador) {
        this.aceitador = aceitador;
    }

    
    public void aceitarTroca() {
        
    }

    public void recusarTroca() {
        
    }

    public void concluirTroca() {
        
    }
}