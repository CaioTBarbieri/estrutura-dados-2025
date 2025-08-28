public class Automovel implements Comparable<Automovel> {
    String tipo;
    String marca;
    String modelo;
    String cor;
    String anoFabricacao;

    @Override
    public int compareTo(Automovel outro) {
        String valorAtual = this.marca + '-' + this.modelo + '-' + this.anoFabricacao + '-' + this.numeroChassi;
        String valorOutro = outro.marca + '-' + outro.modelo + '-' + outro.anoFabricacao + '-' + outro.numeroChassi;
        // Retorna:
        // -1 se esse é menor do que outro
        // 1 se esse é maior do que outro
        // 0 se são iguais
        return valorAtual.compareTo(valorOutro);
    }

    String anoModelo;
    String numeroChassi;
    String placa;

    public Automovel(String marca, String modelo, String tipo, String chassi, String anoFabricacao, String anoModelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.numeroChassi = chassi;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
    }

    @Override
    public String toString() {  
        return "Automovel: " + this.marca + '-' + this.modelo + '-' + this.anoFabricacao + '-' + this.numeroChassi + "\n";
    }
    
}
