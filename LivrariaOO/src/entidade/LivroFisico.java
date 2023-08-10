package entidade;

public class LivroFisico extends Livro implements Promocional {


    public LivroFisico(String nome, String descricao, Double valor, String isbn, Autor autor) {
        super(nome, descricao, valor, isbn, autor);
    }

    public LivroFisico() {

    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.5;
    }

    @Override
    public Boolean aplicaDescontoDe(Double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }

        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\nNome do Livro: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("\n------Detalhes do Autor------");
        getAutor().mostrarDetalhes();
        System.out.println("-----------------------------\n");
    }

}
