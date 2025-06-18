package model;

public class Veiculo {
    private String marca;
    private int ano;


    //getters e os setters
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    //oque ele faz
    public void exibirInformacaoDoVeiculo(String marca , int ano){
        setAno(ano);
        setMarca(marca);
        int anoDeLancamento = getAno();
        String nomeDaMarca = getMarca();

        if (anoDeLancamento < 1886)System.out.println("Gabriel nao quer um carro com o ano menor que 1886!");
        else System.out.println("Gabriel gostou desse veiculo!. Veiculo: " + nomeDaMarca + " Data de lançamento: " + anoDeLancamento);
    }
}
