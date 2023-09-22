package passagemarraypar;

public class PassagemArrayPar {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marco");
        Aluno a2 = new Aluno("Guilherme");
        
        String[] d = new String[3];
        String resumo;
        
        d[0] = "POO";
        d[1] = "IA";
        d[2] = "AC";
        
        a1.setDisc(d);
        
        d[0] = "TEC";
        d[1] = "PE";
        d[2] = "MULT";
        
        a2.setDisc(d);
           
        resumo = a1.toString();
        System.out.println(resumo);
        
        resumo = a2.toString();
        System.out.println(resumo);  
    } 
}
