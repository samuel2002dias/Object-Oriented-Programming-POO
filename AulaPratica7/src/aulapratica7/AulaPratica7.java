package aulapratica7;
import java.lang.Math;

public class AulaPratica7 {
    public static void main(String[] args) {
       Jogador j1 = new Jogador("Jogador 1", 5000);
       Jogador j2 = new Jogador("Jogador 2", 2000);
       Jogador j3 = new Jogador("Jogador 3", 3000);
       Jogador j4 = new Jogador("Jogador 4", 4000);
       
       int[] golos1 = new int[34];
       int[] golos2 = new int[34];
       int[] golos3 = new int[34];
       int[] golos4 = new int[34];
       
       for(int i=0; i<34;i++){
           int rand = (int)(Math.random() * 7);
           golos1[i] = rand;
                   
       }
       j1.setGolos(golos1);
       for(int i=0; i<34;i++){
           int rand = (int)(Math.random() * 6);
           golos2[i] = rand;
       }
       j2.setGolos(golos2);
       for(int i=33; i>=0;i--){
           int rand = (int)(Math.random() * 6);
           golos3[i] = rand;
       }
       j3.setGolos(golos3);
       for(int i=0; i<34;i++){
           int rand = (int)(Math.random() * 6);
           golos4[i] = rand;
       }
       j4.setGolos(golos4);
       
       Equipa equipa1 = new Equipa("Equipa 1");
       Equipa equipa2 = new Equipa("Equipa 2");
       equipa1.inserirJogador(j1);
       equipa1.inserirJogador(j2);
       equipa2.inserirJogador(j3);
       equipa2.inserirJogador(j4);
       
       System.out.println(equipa1);
       System.out.println(equipa2);
       System.out.println("A equipa 1 tem "+equipa1.numeroDeJogadores()+ " jogadores.");
       System.out.println("O "+j1.getNome()+" pertence à equipa 2? --> "+ equipa2.jogadorPertenceEquipa(j1.getNome()));
       System.out.println("O "+j1.getNome()+" pertence à equipa 1? --> "+ equipa1.jogadorPertenceEquipa(j1.getNome()));
       System.out.println("O nome do jogador da equipa 1 com mais golos é: "+equipa1.jogadorCoMaisGolos());
       System.out.println("Golos j1 --> "+j1.totalGolos());
       System.out.println("Golos j2 --> "+j2.totalGolos());
       System.out.println("Golos j3 --> "+j3.totalGolos());
       System.out.println("Golos j4 --> "+j4.totalGolos());
       
       System.out.println("Equipa1 = Equipa2 ?? --> "+equipa1.equals(equipa2));
       Equipa equipa3 = (Equipa) equipa1.clone();
       System.out.println("Equipa1 = Equipa3 ?? --> "+equipa1.equals(equipa3));
       System.out.println("Jogador 1 = Jogador 2 ?? --> "+j1.equals(j2));  
    }
}
