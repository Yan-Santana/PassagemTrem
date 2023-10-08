public class Passagem {
    private Trem T;
    private double horario_saida;
    private double horario_chegada;
    private double preco;

    public Passagem(Trem T, double horario_chegada, double horario_saida) {
        this.T = T;
        this.horario_saida = horario_saida;
        this.horario_chegada = horario_chegada;
    // subtracao simples, nao precisamos complicar
        double tempo_viagem = horario_chegada - horario_saida{

        if(horaro_saida < 5){
            preco = 20 * tempo_viagem + T.getCapacidade();}
        else
            preco = 15 * tempo_viagem + T.getCapacidade();
    }

    // setters e getters
    public double getPreco() {
        return preco;
    }
    public double getSaida() {
        return horario_saida;
    }
    public double getChegada() {
        return horario_chegada;
    }
    public Trem getTrem() {
        return T;
    }
    }