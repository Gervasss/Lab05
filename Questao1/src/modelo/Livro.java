
package modelo;

public class Livro extends Produto{

    private String nomeAutor, assunto, editora, ISBN;
    private double calculaPrecoLivro; 

    
    public Livro(int codigo, int preco_custo, int quantidade_estoque, String nome, 
    String nomeAutor, String assunto, String editora, String ISBN, double calculaPrecoLivro) {
        super(codigo, preco_custo, quantidade_estoque, nome);
        this.nomeAutor = nomeAutor;
        this.assunto = assunto;
        this.editora = editora;
        this.ISBN = ISBN;
        this.calculaPrecoLivro = calculaPrecoLivro;
    }


    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public double calculaPrecoLivro(double preco_custo){
        preco_custo = preco_custo * 1.5;
        return preco_custo;
    }

    public double getCalculaPrecoLivro() {
        return this.calculaPrecoLivro;
    }

    public void setCalculaPrecoLivro(double calculaPrecoLivro) {
        this.calculaPrecoLivro = calculaPrecoLivro;
    }


    @Override
    public String toString() {
        return "Editora : " + getEditora() +
        "\nAssunto: " + getAssunto() +  
        "\nNome do autor : " + getNomeAutor() + 
        "\nISBN:" + getISBN()+
        "\nNome: "+ getNome()+
        "\nCódigo: " + getCodigo() +
        "\nPreço de custo: " + getPreco_custo()+
        "\nQuantidade no estoque: "+ getQuantidade_estoque()+
        "\nValor de venda: " + getCalculaPrecoLivro();
        
    }
}