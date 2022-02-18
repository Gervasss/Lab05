package modelo;

public class Papelaria extends Produto{

    private String descricao, fabricante;
    private double calculaPrecoPapelaria;

    
    
    public Papelaria(String descricao, String fabricante, int codigo, int preco_custo,
    int quantidade_estoque, String nome,
     double calculaPrecoPapelaria) {
        super(codigo, preco_custo, quantidade_estoque, nome);

        this.descricao = descricao;
        this.fabricante = fabricante;
        this.calculaPrecoPapelaria = calculaPrecoPapelaria;
    }


    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public double calculaPrecoPapelaria(double preco_custo){
        preco_custo = preco_custo * 2.0;
        return preco_custo;
    }
    
    public double getCalculaPrecoPapelaria() {
        return this.calculaPrecoPapelaria;
    }

    public void setCalculaPrecoPapelaria(double calculaPrecoPapelaria) {
        this.calculaPrecoPapelaria = calculaPrecoPapelaria;
    }


       @Override
    public String toString() {
        return "Fabricante : " + getFabricante() +
        "\nDescrição: " + getDescricao() +
        "\nvalor de vende:"+getCalculaPrecoPapelaria()+
        "\nNome : " + getNome() + 
        "\nPreço custo :" + getPreco_custo() +
        "\nQuantidade em estoque :" + getQuantidade_estoque();
        
    }
    
}
