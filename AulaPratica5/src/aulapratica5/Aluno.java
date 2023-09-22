package aulapratica5;

public class Aluno {
    private static int ultimo = 0;
    private int numero;
    private String nome;
    private Disciplina[] lista;
    private Disciplina DNula;
    
    public Aluno(String nome){  
        this.nome = nome;
        numero = ultimo + 1;
        ultimo = numero;
        lista = new Disciplina[3]; 
    }
    
    public static int getUltimo(){
        return ultimo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Disciplina[] getDisciplinasEmArray(){
        return(this.lista);
    }
    
    public static void setUltimo(int ult){
        ultimo = ult;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setLista(Disciplina[] lista){
        Disciplina DNula = new Disciplina();
        for(int i=0; i<lista.length;i++){
            if(lista[i] == null){
                this.lista[i] = DNula;  
            }
            else{
                this.lista[i] = lista[i];
            } 
        }
    }
    
    public void adicionarDisciplina(Disciplina d, int p){   
        this.lista[p].setCodigo(d.getCodigo());
        this.lista[p].setNomeDisc(d.getDisc());
        this.lista[p].setProf(d.getProf());     
    }
    
    public String toString(){
        String s;  
        s = "Nome: "+nome+ "// "+"Número: "+numero+" // Último: "+ultimo+" // Disciplinas--> ";
        for(int i = 0; i<lista.length; i++){
            if(!lista[i].getDisc().equals(""))
                s = s + this.lista[i].toString();
            if(i<2 && !lista[i+1].getDisc().equals(""))
                s = s + "----  ";    
        }
        return s;
    }
    
    public boolean verificaDisciplinasPertenceAluno(Disciplina d){
        boolean encontrou = false;
        for(int i=0; i<lista.length && encontrou == false ;i++){
            if(d.getCodigo() == lista[i].getCodigo())
                encontrou = true;
        }
        return encontrou;
    }
}
