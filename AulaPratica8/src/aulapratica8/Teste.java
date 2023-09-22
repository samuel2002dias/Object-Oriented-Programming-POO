package aulapratica8;
import java.util.ArrayList;

public class Teste {
    public static int contaAlunosLicenciaturaA(Aluno[] ListaAlunos){
        int cont = 0;
        for(int i=0; i<ListaAlunos.length;i++){
            if(ListaAlunos[i] instanceof AlunoLicenciatura)
                cont++;
        }
        return cont;
    }
    public static int contaAlunosLicenciaturaB(ArrayList<Aluno> ListaAlunos){
        int cont = 0;
        for(int i=0; i<ListaAlunos.size();i++){
            if(ListaAlunos.get(i) instanceof AlunoLicenciatura)
                cont++;
        }
        return cont;
    }
    public static void main(String[] args) {
        Aluno a2 = new Aluno(14, "João Martins");
        
        AlunoLicenciatura b1 = new AlunoLicenciatura(new Aluno(13, "Guilherme Teixeira"), "EI");
        AlunoLicenciatura b2 = new AlunoLicenciatura(new Aluno(15, "Tiago Ribeiro"), "Design");
        
        Aluno[] arrayAlunos = new Aluno[3];
        arrayAlunos[0] = a2;
        arrayAlunos[1] = b1;
        arrayAlunos[2] = b2;     
        
        ArrayList<Aluno> arraylistAlunos = new ArrayList<Aluno>();
        arraylistAlunos.add(a2);
        arraylistAlunos.add(b1);
        arraylistAlunos.add(b2);
        
        Disciplina Multimedia = new Disciplina(1, "Multimédia");
        Disciplina POO = new Disciplina(2, "POO");
        Disciplina MatDisc = new Disciplina(3, "Matemática Discreta");
        Disciplina Calc = new Disciplina(4, "Cálculo");
        
        ArrayList<Disciplina> discb1 = new ArrayList<Disciplina>();
        ArrayList<Disciplina> discb2 = new ArrayList<Disciplina>();
        
        POO.setNota(20);
        discb1.add(POO);
        Calc.setNota(16);
        discb1.add(Calc);
        
        MatDisc.setNota(10);
        discb2.add(MatDisc);
        Calc.setNota(11);
        discb2.add(Calc);
        
        b1.setDisciplina(discb1);
        b2.setDisciplina(discb2);
        
        System.out.println(b1.getNotaDisciplina(2));
        
        System.out.println(b2.getNotaDisciplina(4));
        
        System.out.println(b1.getMediaDisciplinas());
        
        System.out.println(b2.getMediaDisciplinas());
        
        System.out.println(Teste.contaAlunosLicenciaturaA(arrayAlunos));
        System.out.println(Teste.contaAlunosLicenciaturaB(arraylistAlunos));
        
    }
}
