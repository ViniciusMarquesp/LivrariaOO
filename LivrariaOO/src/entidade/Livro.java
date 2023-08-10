package entidade;

public abstract class Livro {

    private String nome, descricao, isbn;
    private Double valor;

    private Autor autor;

    public Livro() {
    }

    public Livro(Autor autor) {
        this.autor = autor;
    }

    public Livro(String nome, String descricao, Double valor, String isbn, Autor autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

//    public void mostrarDetalhes() {
//        System.out.println("\nNome do Livro: " + this.nome);
//        System.out.println("Descrição: " + this.descricao);
//        System.out.println("Preço: " + this.valor);
//        System.out.println("ISBN: " + this.isbn);
//        System.out.println("-----------------------------\n");
//    }
//
//    public Boolean aplicaDescontoDe(Double porcentagem) {
//        if (porcentagem > 0.3)
//            return false;
//
//        this.valor -= this.valor * porcentagem;
//        return true;
//    }
}