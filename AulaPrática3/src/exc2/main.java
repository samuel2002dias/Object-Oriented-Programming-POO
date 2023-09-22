package exc2;

public class main {
    public static void main(String[] args) {
        Espetaculo show1; 
        String s, msgBilhete;
        
        show1 = new Espetaculo("Circo", 100, 2.5);
        s = show1.toString();
        System.out.println(s);
        
        show1.setCapacidade(200);
        s = show1.toString();
        System.out.println(s);
        
        System.out.println("O custo do espetáculo "+show1.getNome()+" é de "+show1.getCusto()+" euros.");
        
        msgBilhete = show1.comprarBilhete();
        System.out.println(msgBilhete);
        s = show1.toString();
        System.out.println(s);
    }
}
