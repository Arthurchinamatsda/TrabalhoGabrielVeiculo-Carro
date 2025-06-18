import model.Carro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro seiLa = new Carro();
        System.out.println("Escreva a marca");
        Scanner marca = new Scanner(System.in);
        System.out.println("Coloque um ano de lançamento");
        Scanner ano = new Scanner(System.in);
        int anoCarro = ano.nextInt();
        String marcaCarro = marca.nextLine();

        seiLa.exibirInformacaoDoVeiculo(marcaCarro , anoCarro );
    }
}