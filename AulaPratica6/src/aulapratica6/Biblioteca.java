package aulapratica6;
import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Biblioteca {
    String nome;
    ArrayList<String> listaDeLivros;
    
    public Biblioteca(){
        nome = "";
        listaDeLivros = new ArrayList<String>();
    }
    
    public Biblioteca(String nome){
        this.nome = nome;
        listaDeLivros = new ArrayList<String>();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<String> getLista(){
        return this.listaDeLivros;
    }
    
    public void setLista(ArrayList<String> listaDeLivros){
        this.listaDeLivros = (ArrayList<String>) listaDeLivros.clone();
    }
    
    public String toString(){
        String s = "|| Biblioteca: " + nome + "Livros: "+ this.listaDeLivros;
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && obj.getClass() == this.getClass()){
            Biblioteca e = (Biblioteca) obj;
            ig = (this.nome == e.nome);
            for(int i=0; i< this.listaDeLivros.size();i++)
                ig = (ig && (this.listaDeLivros.get(i).equals(e.listaDeLivros.get(i))));
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        Biblioteca copia = new Biblioteca();
        copia.nome = this.nome;
        copia.listaDeLivros = (ArrayList<String>) listaDeLivros.clone(); 
        return copia;
    }
    
    public boolean verificaLivro(String nomeLivro){
        boolean existe = false;
        for(int i=0; i<this.listaDeLivros.size();i++){
            if(this.listaDeLivros.get(i).equals(nomeLivro))
                existe = true;
        }
        return existe;
    }
    
    public ArrayList<String> livrosComPalavra(String palavra){
        ArrayList<String> livrosComPalavra = new ArrayList<String>();
        for(int i=0; i<this.listaDeLivros.size();i++){
            if(this.listaDeLivros.get(i).contains(palavra))
                livrosComPalavra.add(listaDeLivros.get(i));               
        }
        return livrosComPalavra;
    }
    
    public ArrayList<String> livrosComNome(String nome){
        ArrayList<String> livrosComNome = new ArrayList<String>();
        for(int i=0; i<this.listaDeLivros.size();i++){
            if(this.listaDeLivros.get(i).equals(nome))
                livrosComNome.add(listaDeLivros.get(i));               
        }
        return livrosComNome;
    }
    
    public void adicionaCasoNaoExista(String nomeLivro){
        boolean existe = this.verificaLivro(nomeLivro);
        if(existe == false)
            this.listaDeLivros.add(nomeLivro);
    }
    
    public void removeLivro(String nomeLivro){
        for(int i=0; i<this.listaDeLivros.size();i++){
            if(this.listaDeLivros.get(i).equals(nomeLivro))
                this.listaDeLivros.remove(i);
        }
    }
    
    public void removeLivro(int pos){
        for(int i=0; i<this.listaDeLivros.size();i++){
            if(pos == i)
                this.listaDeLivros.remove(i);
        }
    }  
}
