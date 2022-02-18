package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleProduto {
    //int preco;
    //Produto p = new Produto(preco, preco, preco, nome);
    ArrayList<Produto> produtos = new ArrayList<>();
    
    public void cadastrarProduto(int codigo, int preco_custo, int quantidade_estoque, String nome) {
        Produto produto = new Produto(codigo, preco_custo, quantidade_estoque, nome);
        produtos.add(produto);
    }

    public void removeProduto(int codigo, int preco_custo, int quantidade_estoque, String nome) {
        Produto produto = new Produto(codigo, preco_custo, quantidade_estoque, nome);
        produtos.remove(produto);
    }

    public Produto pesquisaCodigoProduto(int codigo) {
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == codigo) {
                return produtos.get(i);
            }
        }
        return null;
    }

    public Produto pesquisaNomeProduto(String nome) { // Pesquisa por nome
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getNome() == nome) {
                return produtos.get(i);
            }
        }
        return null;
    }

    public boolean verificaExiste(int codigo) {
        boolean existe = false;
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == codigo) {
                existe = true;
            }
        }
            return existe;
    }

    public boolean verificaQuantidade(int quantidade_estoque) {
        boolean quant = false;
        
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getQuantidade_estoque() == quantidade_estoque) {
                return quant = true;
            }
        }
            return quant;
    }


    public int RealizarPedido(int codigoProduto, int quantidadeProduto) {
        int custo = 0;
        if(verificaQuantidade(quantidadeProduto) && verificaExiste(codigoProduto) ){
            for (int i = 0; i < produtos.size(); i++){
               custo = custo + produtos.get(i).getPreco_custo();
            }
        }
        return custo;
    }



    /*public double calculaPreco(int codigo2, int quantidadeProduto) {
        int cp = getPreco_custo();
        if(verificaExiste(codigo2) && verificaQuantidade(quantidadeProduto) == true) {
            preco = cp *= quantidadeProduto;
            return preco;
        } else {
            return preco;
            }
            */
}