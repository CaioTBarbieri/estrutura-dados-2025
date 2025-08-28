public class main {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("Marca1", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        ArvoreBinaria<Automovel> arvore = new ArvoreBinaria<>();
        arvore.inserir(auto1);
        Automovel auto2 = new Automovel("Marca2", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        Automovel auto3 = new Automovel("Marca3", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        Automovel auto4 = new Automovel("Marca4", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        Automovel auto5 = new Automovel("Marca5", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        Automovel auto6 = new Automovel("Marca6", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placa1");
        arvore.inserir(auto4);
        arvore.inserir(auto6);
        arvore.inserir(auto3);
        arvore.inserir(auto5);
        arvore.inserir(auto2);
        arvore.imprimeEmOrdem();
        arvore.imprimePreFixado();
    }
}
