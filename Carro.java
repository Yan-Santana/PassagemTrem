public class Carro {

    private String modelo;
    private int nPortas;
    private int nPassageiros;
    private double velocidade;
    private boolean estaligado;

    //CONSTRUTOR:
    public Carro(String mod, int nP, int nPas){   
        this.modelo = mod; 
        this.nPortas = nP;
        this.nPassageiros = nPas;
    }

    //GETTERS E SETTERS:
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEstaligado() {
        return estaligado;
    }

    public void setEstaligado(boolean estaligado) {
        this.estaligado = estaligado;
    }

    //METODOS:
    public void ligaCarro(){                      
        if(!estaligado) {
            estaligado = true;
        }      
    }

    public void acelerar(double novaV){            
        if(estaligado) {
            velocidade += novaV;
        }
    }

    public void frear(){                           
        velocidade = 0;
    }
    
    public String devolveInformacoes(){          
        return "Carro de modelo " + modelo + " com " + nPassageiros + " passageiros";
    }

}
