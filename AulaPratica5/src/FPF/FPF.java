package FPF;

public class FPF {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Bruno");
        Jogador j2 = new Jogador("Rafael", 2300);
        
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        
        //Set golos
        int[] golosJ1 = new int[34];
        for(int i=0; i<34; i++)
            golosJ1[i] = i;        
        System.out.println("SetGolos - Array");
        j1.setGolos(golosJ1);
        System.out.println(j1.toString());
        
        System.out.println("SetGolos numa jornada específica");
        j1.setGolosJornada(0, 6);
        j1.setGolos(golosJ1);
        System.out.println(j1.toString());
        
        System.out.println("Aumentar salário dada uma percentagem");
        j2.aumentarSalario(50);
        System.out.println(j2.toString());
        
        System.out.println("J1 fez "+j1.getGolosJornada(9)+" golos na 9ª jornada.");
        
        System.out.println(j1.getNome()+" fez "+j1.totalGolos()+" golos no total.");
    }
}
