package visao;

import controle.*;

import java.util.Scanner;

public class Livraria {
    public static String menu(){
        return  "(1) Cadastrar produto\n" + 
                "(2) Pesquisar produto por código\n" +
                "(3) Pesquisar produto por nome\n" +
                "(4) Realizar pedido\n" +
                "(0) Sair do Programa\n";
    }
    public static void main(String[] args) {
        int op = 10, codigo, preco_custo, quantidade_estoque, codigo2,quantidadeProduto;
        String nome;
        Scanner teclado = new Scanner(System.in);
        ControleProduto produto = new ControleProduto();

        while(op != 0) {
            menu();
            op = teclado.nextInt();

            switch (op) {
                case 1:
                System.out.println("Digite o codigo do produto: ");
                codigo = teclado.nextInt();
                System.out.println("Digite o preço do produto: ");
                preco_custo = teclado.nextInt();
                System.out.println("Quantidade no estoque: ");
                quantidade_estoque = teclado.nextInt();
                System.out.println("Digite o nome do produto");
                nome = teclado.next();
                produto.cadastrarProduto(codigo, preco_custo, quantidade_estoque, nome);
                    break;
                case 2:
                System.out.println("Digite o codigo do produto a ser pesquisado: ");
                codigo = teclado.nextInt();
                produto.pesquisaCodigoProduto(codigo);
                    break;
                case 3:
                System.out.println("Digite o nome do produto a ser pesquisado: ");
                nome = teclado.next();
                produto.pesquisaNomeProduto(nome);
                    break;
                case 4:
                System.out.println("Digite o codigo do produto: ");
                codigo = teclado.nextInt();
                System.out.println("Digite a quantidade do produto: ");
                quantidadeProduto = teclado.nextInt();
                
            }
            teclado.close();
        }
    }
}
