public class Passageiro {
    private String nome;
    private int idade;
    private double valorEmCarteira;
    private Passagem P;

    public Passageiro(String nome, int idade, double valorEmCarteira) {
        this.nome = nome;
        this.idade = idade;
        this.valorEmCarteira = valorEmCarteira;
    }

    public boolean compraPassagem(Passagem P) {
        if (P.getPreco() > valorEmCarteira || P != null)
            return false;
            valorEmCarteira -= P.getPreco();
            this.P = P;
    }

    public String getInfos() {
    return "Passageiro de nome " + nome + " com passagem " + P.getInfo();
    }
    // getters e setters
    public double getCarteira() {
    return this.valorEmCarteira;
    }
    public String getNome() {
    reutrn nome;
    }
    public int getIdade() {
    return idade;
    }
    public Passagem getPassagem() {
    return P;
    }
    public void setIdade(int idade) {
    this.idade = idade;
    }
    }
