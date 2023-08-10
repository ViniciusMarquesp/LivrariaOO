import entidade.Autor;
import entidade.Ebook;
import entidade.Livro;
import entidade.LivroFisico;

public class CadastroDeLivro {

    public static void main(String[] args) {

        Autor autor = new Autor("Vinicius Marques", "vinicius@email.com", "2983928378");

        LivroFisico livro = new LivroFisico("Java 11 Prático", "aprenda Java 11", 59.90, "989-85-66258-46-6", autor);
        livro.mostrarDetalhes();

        Autor outroAutor = new Autor("Beatriz Seraphim", "Beatriz@email.com", "238772387238");
        LivroFisico outroLivro = new LivroFisico("Lógica De Programação",
                "Aprenda Lógica De Programação",
                49.90,
                "872-809-201-0", outroAutor
        );
        outroLivro.mostrarDetalhes();

        Autor autorEbook = new Autor("Vinicius Marques", "vinicius@email.com", "2983928378");

        Ebook ebook = new Ebook("java pratico", "aprenda java nesse Ebook", 29.99, "222-999-441-5", autorEbook, "marca d'gua ebook");
        ebook.mostrarDetalhes();
    }
}