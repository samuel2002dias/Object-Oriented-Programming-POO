package aulapratica9;

public class FrascoChocolates {
    int capacidade, conteudo;

    public FrascoChocolates(int cap, int cont) {
        capacidade = cap;
        conteudo = cont;
    }
    
    public void retira(int qtd) throws FrascoVazio{
        if(qtd <= this.conteudo)
            conteudo -= qtd;
        else
            throw new FrascoVazio("OH! OH! guloso, queres demais. Quantidade:" + qtd +" Conteúdo:" + this.conteudo);
    }
    
    public void enche(int qtd) throws FrascoCheio{
        if(qtd+this.conteudo <= this.capacidade)
            this.conteudo -= qtd;
        else
            throw new FrascoCheio("OH! OH! já chega, estou de dieta " + qtd +" Conteúdo:" + this.conteudo);
    }
}
