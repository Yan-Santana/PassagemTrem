public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;

    // construtor
    public Pessoa(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    // setter
    public void incrementaIdade() {
        idade++;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "111.111.111-11", 30);
        Pessoa pessoa2 = new Pessoa("Maria", "222.222.222-22", 25);

        System.out.println("Nome: " + pessoa1.getNome() + ", CPF: " + pessoa1.getCPF() + ", idade: " + pessoa1.getIdade());
        System.out.println("Nome: " + pessoa2.getNome() + ", CPF: " + pessoa2.getCPF() + ", idade: " + pessoa2.getIdade());

        pessoa1.incrementaIdade();
        pessoa2.incrementaIdade();
        pessoa2.incrementaIdade();

        System.out.println("Nome: " + pessoa1.getNome() + ", CPF: " + pessoa1.getCPF() + ", idade: " + pessoa1.getIdade());
        System.out.println("Nome: " + pessoa2.getNome() + ", CPF: " + pessoa2.getCPF() + ", idade: " + pessoa2.getIdade());
    }
}
