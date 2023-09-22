package aulapratica7;
import java.util.ArrayList;

public class Equipa {
    private String nomeEquipa;
    private ArrayList<Jogador> equipaFut;
    
    public Equipa(String nomeEquipa){
        this.nomeEquipa = nomeEquipa;
        equipaFut = new ArrayList<Jogador>();
    }
    
    public void inserirJogador(Jogador j){
        this.equipaFut.add(j);
    }
    public void removeJogador(int posicao){
        this.equipaFut.remove(posicao);
    }
    public int numeroDeJogadores(){
        return this.equipaFut.size();
    }
    public boolean jogadorPertenceEquipa(String nome){
        boolean pertence = false;   
        for(int i=0; i<this.equipaFut.size(); i++){
            if(this.equipaFut.get(i).getNome().equals(nome))
                pertence = true;
        }
        return pertence;
    }
    
    public String jogadorCoMaisGolos(){
        int maior = 0;
        Jogador jogadorComMaisGolos = new Jogador("");
        for(int i=0; i<this.equipaFut.size(); i++){
            if(this.equipaFut.get(i).totalGolos() > maior){
                maior = this.equipaFut.get(i).totalGolos();
                jogadorComMaisGolos = this.equipaFut.get(i);
            }    
        } 
        return jogadorComMaisGolos.getNome();
    }
    
    public String toString(){
        String s;
        s = "Nome da equipa: "+ nomeEquipa + " // Jogadores: "+equipaFut;
        return s;
    }
      
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Equipa e = (Equipa) obj;
            ig = (this.nomeEquipa.equals(e.nomeEquipa) && this.equipaFut.equals(e.equipaFut));        
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        Equipa copia = new Equipa("");
        copia.nomeEquipa = this.nomeEquipa;   
        copia.equipaFut = (ArrayList<Jogador>) this.equipaFut.clone();
        return copia;
    }
}
