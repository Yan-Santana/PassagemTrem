public class Apartamento {
    private int nMoradores;                                                
    private int nQuartos;                                                  
    private double espaco;                                                  
    private double valorAluguel;                                            


    // CONSTRUTORES 
    public Apartamento(int nQuar, double esp, double valorAlg){            
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    public Apartamento(int nMor, int nQuar, double esp, double valorAlg){ 
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
        this.nMoradores = nMor;   
    }

    //GETTERS E SETTERS:
    public void setnMoradores( int nMoradores){
        this.nMoradores = nMoradores;
        dividirAluguel();
        aumentarMoradores();
        diminuirMoradores();
    }

    public int getnQuartos(){
        return nQuartos;
    }

    public void setEspaco(double espaco){
        this.espaco = espaco;
        valorporm2();
    }

    public void setValorAluguel(double valorAluguel){
        this.valorAluguel = valorAluguel;
        dividirAluguel();
        valorporm2();
    }




    // METODOS 

    private double dividirAluguel(){                                        
        return valorAluguel / nMoradores;
    }

    private double valorporm2(){                                           
        return valorAluguel / espaco;
    }

    private boolean aumentarMoradores(){                                    
        if(nMoradores < nQuartos){                                  
            nMoradores++;                                                                                                                
            return true;                                                  
        }
        return false;                                                                
    }
    private boolean diminuirMoradores(){                                   
        if(nMoradores > 0){
            nMoradores--;
            return true;
        }
        return false;
    }


}
