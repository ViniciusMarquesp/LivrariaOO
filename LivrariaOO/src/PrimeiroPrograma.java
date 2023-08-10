public class PrimeiroPrograma {

    public static void main(String[] args) {

        double livroJava, livroTdd, total;

        livroJava = 59.90;
        livroTdd = 49.90;
        total = livroJava + livroTdd;

        System.out.println("Valor do livro de Java: " + livroJava);
        System.out.println("Valor do livro de TDD: " + livroTdd);
        System.out.println("Total dos livros: " + total);

        int valor1, valor2;
        int soma, subtracao, multiplicacao, divisao, modulo;

        valor1 = 5;
        valor2 = 2;

        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        multiplicacao = valor1 * valor2;
        divisao = valor1 / valor2;
        modulo = valor1 % valor2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

    }
}