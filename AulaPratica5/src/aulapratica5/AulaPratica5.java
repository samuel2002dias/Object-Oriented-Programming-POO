package aulapratica5;

public class AulaPratica5 {
    public static void main(String[] args) {
        System.out.println("Nº do último aluno registado --> "+Aluno.getUltimo());
        
        Aluno a1 = new Aluno("Manuel Silva");
        Aluno a2 = new Aluno("Maria Espinho");
        
        Disciplina POO = new Disciplina(1000, "POO");
        POO.setProf("Paula Prata");
  
        Disciplina IA = new Disciplina(2000, "IA");
        IA.setProf("Luís Alexandre");
      
        Disciplina Mult = new Disciplina(3000, "Multimédia");
        Mult.setProf("Manuel Pereira");
        
        Disciplina PE = new Disciplina(4000, "Probabilidades e Estatística");
        PE.setProf("João Duque");
        
        Disciplina[] ListaA1 = new Disciplina[3];
        ListaA1[0] = POO;
        ListaA1[1] = IA;
        ListaA1[2] = Mult;
        
        a1.setLista(ListaA1);
 
        Disciplina[] ListaA2 = new Disciplina[3];
        ListaA2[0] = POO;
        ListaA2[1] = PE;
        
        a2.setLista(ListaA2);
         
        System.out.println(a1.toString());
        
        System.out.println(a2.toString());
        
        System.out.println("Nº do último aluno registado --> "+Aluno.getUltimo());
        
        System.out.println("Nº do a1 --> "+a1.getNumero());
        
        ListaA1[0] = PE;
        a1.setLista(ListaA1);
        System.out.println("Disciplinas de A1 (substitui POO por PE): ");
        for(int i=0; i<ListaA1.length; i++){
            System.out.println(ListaA1[i].toString());
        }
        
        boolean ver;
        ver = a1.verificaDisciplinasPertenceAluno(POO);
        if(ver == false)
            System.out.println(POO.getDisc()+" não pertence às disciplinas do aluno 1.");
        else
            System.out.println(POO.getDisc()+" pertence às disciplinas do aluno 1.");
        
        a2.adicionarDisciplina(IA, 2);
        System.out.println(a2.toString());      
    }   
}

