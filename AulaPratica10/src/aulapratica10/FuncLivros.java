package aulapratica10;

import java.io.*;
import java.util.ArrayList;

public class FuncLivros {

    public static void inserirLivro(ArrayList<Livro> livros) {
        System.out.println("Qual o número do Livro? ");
        int num = Ler.umInt();
        // validar número de livro
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == num) {
                System.out.println("Já existe um livro com esse número");
                return;
            }
        }
        //obter dados do livro; instanciar o objeto Livro; 
        System.out.println("Qual o nome do Livro? ");
        String nome = Ler.umaString();
        System.out.println("Qual o autor do Livro? ");
        String autor = Ler.umaString();
        Livro l = new Livro(num, nome, autor);

        // adicionar o novo livro à lista
        livros.add(l);
        // atualizar ficheiro
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\teste\\livros.dat"));
            // escrever o objeto livros no ficheiro 
            os.writeObject(livros);
            os.flush(); // os dados são copiados de memória para o disco
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarLivro(ArrayList<Livro> livros) {
        System.out.println(livros);
    }

    public static void apagarLivro(ArrayList<Livro> livros) {
        System.out.println("Qual o número do Livro que pretende remover? ");
        int num = Ler.umInt();
        // validar número de livro
        boolean existe = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == num) {
                existe = true;
            }
        }

        if (existe == false) {
            System.out.println("Não existe nenhum livro com esse número.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getId() == num) {
                    livros.remove(i);
                }
            }
            System.out.println("Livro removido com suceso.");
        }
    }

    public static void consultarLivro(ArrayList<Livro> livros) {
        System.out.println("Qual o nome do Livro que pretende remover? ");
        String nome = Ler.umaString();
        // validar número de livro
        boolean existe = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(nome)) {
                existe = true;
            }
        }

        if (existe == false) {
            System.out.println("Não existe nenhum livro com esse nome.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getTitulo().equals(nome)) {
                    livros.get(i);
                }
            }
        }
    }

    public static void AlterarTituloLivro(ArrayList<Livro> livros) {
        System.out.println("Qual o nome do Livro que pretende alterar? ");
        String nome = Ler.umaString();
        // validar número de livro
        boolean existe = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(nome)) {
                existe = true;
            }
        }

        if (existe == false) {
            System.out.println("Não existe nenhum livro com esse nome.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getTitulo().equals(nome)) {
                    System.out.println("Novo nome: ");
                    nome = Ler.umaString();
                    livros.get(i).setTitulo(nome);
                }
            }
        }
    }

    public static String AutorComMaisLivros(ArrayList<Livro> livros) {
        ArrayList<String> autores = new ArrayList<String>();
        String autorComMaisLivros="";
        int maior = 0, numeroDeVezesQueAparece=0, autorNaPos = 0;
              
        // Constrói uma ArrayList com os autores dos livros
        for(int i = 0; i < livros.size(); i++)
            autores.add(livros.get(i).getAutor());
        
        // Percorre a ArrayList de Strings de Autores
        while(autorNaPos<=autores.size()){
            numeroDeVezesQueAparece = 0;
            // Para cada autor, conta quantas vezes ele apareceu na lista
            for(int i = 0; i < autores.size(); i++){
                if(autores.get(autorNaPos).equals(autores.get(i)))
                    numeroDeVezesQueAparece++;
            }
            // Se um determinado autor apareceu mais vezes que o que tinha aparecido mais vezes, esse autor passa a ser o maio
            if(numeroDeVezesQueAparece>maior){
                maior = numeroDeVezesQueAparece;
                autorComMaisLivros = autores.get(autorNaPos);
            }
            autorNaPos++;
        }
        
        /*
        // Mesma coisa com ciclos for
        for(autorNaPos = 0; autorNaPos<autores.size(); autorNaPos++){
            numeroDeVezesQueAparece = 0;
            for(int i = 0; i < autores.size(); i++){
                if(autores.get(autorNaPos).equals(autores.get(i)))
                    numeroDeVezesQueAparece++;
            }
            if(numeroDeVezesQueAparece>maior){
                maior = numeroDeVezesQueAparece;
                autorComMaisLivros = autores.get(autorNaPos);
            }
        }*/
         
        return autorComMaisLivros;
    }

}
