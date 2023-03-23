package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Insira os dados do produto: ");

        System.out.print("Nome do Produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade no Estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();

        System.out.println("Informações do Produto: " + produto );
        System.out.println();

        System.out.print("Insira o número de produtos a serem adcionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);

        System.out.println("Informações Atualizadas: " + produto );
        System.out.println();

        System.out.print("Insira o número de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println("Informações Atualizadas: " + produto );
        System.out.println();

        sc.close();
    }

}
