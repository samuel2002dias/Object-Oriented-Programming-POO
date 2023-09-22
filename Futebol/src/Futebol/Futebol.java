
package futebol;


public class Futebol {

    
    public static void main(String[] args) {
        String conteudoj1, conteudoj2;
        
        
        Jogador j1;
        Jogador j2;
        
        int[] registogolosj1;
        int[] registogolosj2;
        int[] verificacaogolos = new int[34];
        
        j1 = new Jogador("João Baltazar");
        
        j2 = new Jogador("Cristiano Ronaldo", 560);
        
        registogolosj1 = new int[34];
     
        for(int i = 0; i < registogolosj1.length; i++){
            if(i == 1)
            registogolosj1[i] =  2;
            else
                if(i == 17){
                    registogolosj1[i] = 1;
                }
            else
                    registogolosj1[i] = 0;
                    
            
        }
        
        j1.setArrayGolos(registogolosj1);
        
        registogolosj2 = new int[34];
        
        for(int i = 0; i < registogolosj1.length; i++){
            if(i == 1)
            registogolosj2[i] =  2;
            else
                if(i == 2){
                    registogolosj2[i] = 5;
                }
            else
                    registogolosj2[i] = 0;
                    
            
        }
        
        j2.setArrayGolos(registogolosj2);
        
        conteudoj1 = j1.toString();
        conteudoj2 = j2.toString();
        System.out.println(conteudoj1);
        System.out.println(conteudoj2);
        
        verificacaogolos = j1.getArrayGolos();
        for(int i = 0; i<verificacaogolos.length;i++)
            System.out.println(verificacaogolos[i]);
        
        
    }
    
}
