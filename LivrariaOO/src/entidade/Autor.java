package entidade;

public class Autor {

    public String nome;
    public String email;
    public String cpf;

    public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {
        System.out.println("Autor Da Obra: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("CPF: " + cpf);
    }
}
