package array_list;

public class Array_List {
    public static void main(String[] args) {
        Pergunta p1;
        Pergunta p2;
        int numPerguntasTesteHistoria = 20;
        Pergunta[] PerguntasTesteHistoria = new Pergunta[numPerguntasTesteHistoria];
        Frequencia f1 = new Frequencia("História");
        
        p1 = new Pergunta();
        p2 = new Pergunta();
        
        p1.setTexto("Qual foi o primeiro Rei de Portugal?");
        p1.setNumero(1);
        p1.setValor(2.5);
        
        p2.setTexto("Em que ano o Ser Humano pisou a lua pela primeira vez?");
        p2.setNumero(2);
        p2.setValor(3.5);
        
        PerguntasTesteHistoria[0] = p1;
        PerguntasTesteHistoria[1] = p2;
        for(int i = 0; i<numPerguntasTesteHistoria; i++){
            if(PerguntasTesteHistoria[i] == null)
                PerguntasTesteHistoria[i] = new Pergunta();
        }
        
        f1.setPerguntas(PerguntasTesteHistoria);
        
        System.out.println(f1.toString());
    } 
}

