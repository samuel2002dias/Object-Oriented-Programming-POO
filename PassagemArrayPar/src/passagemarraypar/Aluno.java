package passagemarraypar;

public class Aluno {
    private int n;
    private String nome;
    private String[] disc;
    private static int ultimo = 0;
    
    public Aluno(String nome){
        this.nome = nome;
        ultimo++;
        this.n = ultimo;
        disc = new String[3];
    }
    
    public static int getUltimo(){
        return ultimo;
    }
    
    public String[] getDisc(){
        return disc;
    }
    
    public void setDisc(String[] disc){
        for(int i = 0; i<3; i++)
            this.disc[i] = disc[i];
        //this.disc = disc;
        //  Se usassemos a linha de código anterior em vez do ciclo forte,
        // teriamos de criar um array novo na main de cada vez que quisessemos
        // definir novas disciplinas. Com o for isso não acontece (verificar main)
    }
    
    public String toString(){
        String s = "Último:" + ultimo;
        s = s + "  nº:" + n + "  Nome:" + nome + "  Disciplinas:";
        for(int i = 0; i<3; i++)
            s = s + disc[i] + ",";
        return s;
    }
}
