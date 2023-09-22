package exemplo;
import java.util.ArrayList;

public class Exemplo {
    public static void main(String[] args) {
        e amostra = new e();
        e amostra2 = new e();
        
        int[] listaInteiros = new int[10];
        listaInteiros[0] = 1;
        listaInteiros[1] = 2;
        listaInteiros[2] = 3;
        
        ArrayList<String> ListaStrings = new ArrayList<String>();
        ListaStrings.add("Terra");
        ListaStrings.add("Céu");
        ListaStrings.add("Sol");
        
        Telefone t1 = new Telefone("Casa", 245678912);
        Telefone t2 = new Telefone("Móvel", 966734532);
        Telefone t3 = new Telefone("Trabalho", 346623452);
        Telefone[] ListaTelefonica = new Telefone[3];
        for(int i=0; i<ListaTelefonica.length;i++)
            ListaTelefonica[i] = new Telefone();
        ListaTelefonica[0] = t1;
        ListaTelefonica[1] = t2;
        //ListaTelefonica[2] = t3;
        
        ArrayList<Telefone> ListaDINATelefonica= new ArrayList<Telefone>();
        ListaDINATelefonica.add(t3);
        ListaDINATelefonica.add(t2);
        
        amostra.setN(2);
        amostra.setS("teste");
        amostra.setListaX(listaInteiros);
        amostra.setListaY(ListaStrings);
        amostra.setListaT(ListaTelefonica);
        amostra.setListaZ(ListaDINATelefonica);
        
        amostra2.setN(2);
        amostra2.setS("teste");
        listaInteiros[7] = 9;
        amostra2.setListaX(listaInteiros);
        amostra2.setListaY(ListaStrings);
        amostra2.setListaT(ListaTelefonica);
        Telefone t4 = new Telefone("Oficina", 978564534);
        ListaDINATelefonica.add(t4);
        amostra2.setListaZ(ListaDINATelefonica);
        
        System.out.println(amostra);
        System.out.println(amostra2);
        
        boolean igual = amostra.equals(amostra2);
        System.out.println(igual);
        
        e a3 = new e();
        a3 = (e) amostra2.clone();
        
        System.out.println(a3);
        
        igual = amostra2.equals(a3);
        System.out.println(igual);
        
        
       
    }   
}
