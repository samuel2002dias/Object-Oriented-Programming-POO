package aulapratica6;
import java.util.ArrayList;

public class AulaPratica6 {
    public static void main(String[] args) {
        int respostaFinal = 0;
        Biblioteca b = new Biblioteca("Biblioteca Municipal do Fundão");
        ArrayList<String> livrosDeB = new ArrayList<String>();
        livrosDeB.add("Livro 11");
        livrosDeB.add("Livro 23");
        livrosDeB.add("Livro 34");
        b.setLista(livrosDeB);
     
        do{
            System.out.print("---------------------------------------\n1- Mostrar Livros\n2- Adicionar Livros\n3- Remover Livros\n4- Pesquisar Livro por nome\n5- Pesquisar Livro por palavra contida\n6- Terminar\nOpção --> ");
            respostaFinal = Ler.umInt();
            switch(respostaFinal){
                case 1:
                    ArrayList<String> livros= new ArrayList<String>(); 
                    livros = b.getLista();
                    System.out.println(livros);                    
                    break;
                case 2:
                    String nomeLivroAdd;
                    System.out.println("\nNome do livro: ");
                    nomeLivroAdd = Ler.umaString();
                    b.adicionaCasoNaoExista(nomeLivroAdd);
                    break;
                case 3:
                    String nomeLivroRem;
                    System.out.println("\nNome do livro: ");
                    nomeLivroRem = Ler.umaString();
                    b.removeLivro(nomeLivroRem);
                    break;
                case 4:
                    ArrayList<String> livrosComNome = new ArrayList<String>();
                    String nome;
                    System.out.println("\nNome do livro: ");
                    nome = Ler.umaString();
                    livrosComNome = b.livrosComNome(nome);
                    if(livrosComNome.isEmpty())
                        System.out.println("Não existem livros com esse nome.");
                    else
                        System.out.println(livrosComNome); 
                    break;
                case 5:
                    ArrayList<String> livrosComPalavra = new ArrayList<String>();
                    String palavra;
                    System.out.println("\nPalavra: ");
                    palavra = Ler.umaString();
                    livrosComPalavra = b.livrosComPalavra(palavra);
                    if(livrosComPalavra.isEmpty())
                        System.out.println("Não existem livros com essa palavra contida.");
                    else
                        System.out.println(livrosComPalavra); 
                    break;       
            }
        }while(respostaFinal != 6);
        System.out.println("O utlizador saiu do programa.");
    }    
}
