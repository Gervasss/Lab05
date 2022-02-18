package modelo;

public class Produto {

    private int codigo, preco_custo, quantidade_estoque;
    private String nome;

    
    public Produto(int codigo, int preco_custo, int quantidade_estoque, String nome) {
        this.codigo = codigo;
        this.preco_custo = preco_custo;
        this.quantidade_estoque = quantidade_estoque;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPreco_custo() {
        return this.preco_custo;
    }

    public void setPreco_custo(int preco_custo) {
        this.preco_custo = preco_custo;
    }

    public int getQuantidade_estoque() {
        return this.quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
       
    @Override
    public String toString(){
        return "\nNome: "+ getNome()+
        "\nCódigo: " + getCodigo() +
        "\nPreço de custo: " + getPreco_custo()+
        "\nQuantidade no estoque: "+ getQuantidade_estoque();  
    }

}
