public class Trem {
    private String modelo;
    private String destino;
    private Passageiro [] listaP;
    private int nPas; 
    // publico pois é constante
    public final int capacidade;

    public Trem(String modelo, String destino, int capacidade) {
        this.modelo = modelo;
        this.destino = destino;
        this.capacidade = capacidade;
        listaP = new Passageiro[capacidade];
    }

    public boolean adicionaPassageiro(Passageiro P) {
        if (getLotado())
            return false;

        listaP[nPas++] = P;
        return true;
    }

    // getters e setters
    public int getCapacidade() {
        return capacidade;
    }

    public boolean checaDestino(String destino) {
        return this.destino == destino;
    }

    public boolean getLotado() {
        return nPas == capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDestino() {
        return destino;
    }

    public int getNPas() {
        return nPas;
    }
}