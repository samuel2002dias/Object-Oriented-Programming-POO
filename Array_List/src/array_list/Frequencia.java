package array_list;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Frequencia {

    private String NomeDisciplina;
    private LocalDate data;
    //private Pergunta[] perguntas;
    private ArrayList<Pergunta> perguntas;

    public Frequencia(String NomeDisc) {
        this.NomeDisciplina = NomeDisc;
        //this.perguntas = new Pergunta[numperguntas];
        this.perguntas = new ArrayList<>();
        data = LocalDate.now();
    }

    public String getNomeDisc() {
        return NomeDisciplina;
    }

    public LocalDate getData() {
        return data;
    }

    public ArrayList<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setNomeDisc(String nomeDisc) {
        this.NomeDisciplina = nomeDisc;
    }

    public void setPerguntas(Pergunta perguntas[]) {        
        for (int i = 0; i < perguntas.length; i++) {     
            this.perguntas.add(perguntas[i]);
        }
    }

    public void setData(int aaa, int mm, int dd) {
        this.data = LocalDate.of(aaa, mm, dd);
    }

    public String toString(){
        String s;
        s = "Disciplina: "+NomeDisciplina+"; Data: "+data+"; Perguntas ---> ";
        for(int i=0; i<perguntas.size();i++){
            if(i == perguntas.size() - 1 && !perguntas.get(i).getTexto().equals(""))
                s = s + perguntas.get(i).toString();
            else if(!perguntas.get(i).getTexto().equals(""))
                s = s + perguntas.get(i).toString() + " // ";
        }
        return s;
    }
}
