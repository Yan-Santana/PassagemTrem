public class Produto {
    private String nome;                        
    private double valor;                       
    private double peso;                        
    private int quantidade;                    
    
    // CONSTRUTORES
    public Produto(String nNome, double nValor, double nPeso, int quant){
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = quant;
    }

    public Produto(String nNome, double nValor, double nPeso){
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
    }

    //GETTERS E SETTERS:
    public String getNome(){
        return nome;
    }

    public void  setValor(double valor){
        this.valor = valor;
        devolveValorAgregado();
    }

    public void setPeso(double peso){
        this.peso = peso;
        devolvePesoAgregado();
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
        devolvePesoAgregado();
    }

    // METODOS 
    private double devolveValorAgregado(){          
        return valor * quantidade;
    }

    private double devolvePesoAgregado(){          
        return peso * quantidade;
    }

    public double converteEmDolares(double cotacaoUSD){    
        return valor / cotacaoUSD;
    }

}
