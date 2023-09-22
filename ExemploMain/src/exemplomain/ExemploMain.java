
package exemplo;
import java.util.ArrayList;

public class ExemploMain {
    
    public static void main(String[] args) {
        Exemplo e1;
        Exemplo e2;
        Exemplo e3;
        e1 = new Exemplo();
        e2 = new Exemplo();
        e3 = new Exemplo();
        e1.setN(7);
        e1.setS("João");
        String conteudoe1, conteudoe2, conteudoe3;
        
        int[] arrayX = new int[10];
        arrayX[0] = 10;
        arrayX[1] = 4;
        arrayX[2] = 9;
        arrayX[3] = 1;
        arrayX[4] = 2;
        arrayX[5] = 11;
        arrayX[6] = 8;
        arrayX[7] = 7;
        arrayX[8] = 5;
        arrayX[9] = 12;
        e1.setListaX(arrayX);
        
        ArrayList<String> listaY = new ArrayList<>();
        listaY.add("J");
        listaY.add("O");
        listaY.add("A");
        listaY.add("O");
        listaY.add("MATRAQUILHOS");
        e1.setListaY(listaY);
        
        Telefone[] listaT = new Telefone[5];
        Telefone t1 = new Telefone("CasaCHN", 275612334);
        Telefone t2 = new Telefone("TrabalhoCHN", 972353777);
        Telefone t3 = new Telefone("Pessoal", 921463248);
        for(int i = 0; i < listaT.length; i++){
            listaT[i] = new Telefone();
        }
        listaT[0] = t1;
        listaT[1] = t2;
        listaT[2] = t3;
        e1.setListaT(listaT);
        
        ArrayList<Telefone> listaZ = new ArrayList<>();
        listaZ.add(t3);
        e1.setListaZ(listaZ);
        
        conteudoe1 = e1.toString();
        System.out.println("---E1---\n" + conteudoe1);
        
        e2.setN(2);
        e2.setS("teste");
        arrayX[7] = 9;
        e2.setListaX(arrayX);
        e2.setListaY(listaY);
        e2.setListaT(listaT);
        Telefone t4 = new Telefone("Oficina", 978564534);
        listaZ.add(t4);
        e2.setListaZ(listaZ);
        conteudoe2 = e2.toString();
        System.out.println("---E2---\n" + conteudoe2);
        
        System.out.println("E1 e E2 iguais?? " + e1.equals(e2));
        
        e3 = (Exemplo) e1.clone();
        conteudoe3 = e3.toString();
        System.out.println("---E3---\n" + conteudoe3);
        System.out.println("E1 e E3 iguais?? " + e3.equals(e1));
        
        
        
        
        
        
    }
    
    
}
