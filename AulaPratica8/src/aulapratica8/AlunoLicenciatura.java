package aulapratica8;

import java.util.ArrayList;

public class AlunoLicenciatura extends Aluno {
    private String cursoFrequentado;
    private ArrayList<Disciplina> disciplinasFeitas;
    
    public AlunoLicenciatura(Aluno a, String cursoFrequentado){
        super(a.getNum(), a.getNome());
        this.cursoFrequentado = cursoFrequentado;
    }
    
    public AlunoLicenciatura(AlunoLicenciatura a){
        super(a.getNum(), a.getNome());
        this.cursoFrequentado = cursoFrequentado;
        this.disciplinasFeitas = (ArrayList<Disciplina>) a.disciplinasFeitas;
    }

    public String getCursoFrequentado() {
        return cursoFrequentado;
    }
    public void setCursoFrequentado(String cursoFrequentado) {
        this.cursoFrequentado = cursoFrequentado;
    }
    
    public int getNumSuper(){
        return super.getNum();
    }
    public void setNumSuper(int num){
        super.setNum(num);
    }
    
    public String getNomeSuper(){
        return super.getNome();
    }
    public void setNomeSuper(String nome){
        super.setNome(nome);
    }
    
    public ArrayList<Disciplina> getDisciplinasFeitas(){
        return this.disciplinasFeitas;
    }
    public void setDisciplina(ArrayList<Disciplina> disciplinasFeitas){
        this.disciplinasFeitas = (ArrayList<Disciplina>) disciplinasFeitas;
    }

    public String toString() {
        return (super.toString() + " // Curso:" + this.cursoFrequentado + ", Disciplinas Feitas: "+this.disciplinasFeitas);
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            AlunoLicenciatura e = (AlunoLicenciatura) obj;
            ig = super.equals(e);
            ig = ig && (this.cursoFrequentado.equals(e.cursoFrequentado)) && (this.disciplinasFeitas.equals(e.disciplinasFeitas));
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        AlunoLicenciatura copia = new AlunoLicenciatura(this);
        return copia;
    }
    
    public void addDisciplina(Disciplina disc){
        if(!this.disciplinasFeitas.contains(disc))
           this.disciplinasFeitas.add(disc);
    }
    
    public int getNotaDisciplina(int cod){
        boolean encontrou = false;
        int nota = 0;
        for(int i=0; i<this.disciplinasFeitas.size() && encontrou != true;i++){
            if(this.disciplinasFeitas.get(i).getCodigo() == cod){
                encontrou = true;
                nota = disciplinasFeitas.get(i).getNota();
            }
        }
        if(encontrou == true)
            return nota;
        else
            return 0;
    }
    
    public float getMediaDisciplinas(){
        float media=0, soma=0;
        for(int i=0; i<this.disciplinasFeitas.size();i++)
            soma += this.disciplinasFeitas.get(i).getNota();
        media = soma / this.disciplinasFeitas.size();
        return media;
    }
    
}
