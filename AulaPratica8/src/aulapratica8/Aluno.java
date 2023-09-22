package aulapratica8;

public class Aluno {
    private int num;
    private String nome;
    
    public Aluno(int num, String nome){
        this.nome = nome;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getNome() {
        return nome;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "num= " + num + ", nome= " + nome;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Aluno e = (Aluno) obj;
            ig = (this.nome.equals(e.nome) && this.num == e.num);
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        Aluno copia = new Aluno(this.num, this.nome);
        return copia;
    }
}
