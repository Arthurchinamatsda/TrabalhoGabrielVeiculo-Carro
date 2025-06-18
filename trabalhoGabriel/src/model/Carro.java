package model;

public class Carro extends Veiculo{
    private String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void exibirInformacaoDoVeiculo(String marca, int ano) {
        super.exibirInformacaoDoVeiculo(marca, ano);
    }
}
