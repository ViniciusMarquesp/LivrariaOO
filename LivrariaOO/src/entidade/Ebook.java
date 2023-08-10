package entidade;

public class Ebook extends Livro implements Promocional {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public Ebook(String nome, String descricao, Double valor, String isbn, Autor autor, String waterMark) {
        super(nome, descricao, valor, isbn, autor);
        setWaterMark(waterMark);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }


    @Override
    public Boolean aplicaDescontoDe(Double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\nLivro Versão Ebook");
        System.out.println("Nome do Livro: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("\n------Detalhes do Autor------");
        getAutor().mostrarDetalhes();
        System.out.println("-----------------------------\n");
    }


}

