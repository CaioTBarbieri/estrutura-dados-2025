public class main {
    public static void main(String[] args) {
        // Inclua seu código aqui...
        Automovel carro01 = new Automovel("Fiat", "Uno", "Seda", "01", "2020", "2020", "Branco", "ABC0001");
        Automovel carro02 = new Automovel("Fiat", "Uno", "Seda", "02", "2020", "2020", "Branco", "ABC0002");
        Automovel carro03 = new Automovel("Fiat", "Uno", "Seda", "03", "2020", "2020", "Branco", "ABC0003");
        Automovel carro04 = new Automovel("Fiat", "Uno", "Seda", "04", "2020", "2020", "Branco", "ABC0004");
        Automovel carro05 = new Automovel("Fiat", "Uno", "Seda", "05", "2020", "2020", "Branco", "ABC0005");
        Automovel carro06 = new Automovel("Fiat", "Uno", "Seda", "06", "2020", "2020", "Branco", "ABC0006");
        Automovel carro07 = new Automovel("Fiat", "Uno", "Seda", "07", "2020", "2020", "Branco", "ABC0007");
        Automovel carro08 = new Automovel("Fiat", "Uno", "Seda", "08", "2020", "2020", "Branco", "ABC0008");
        Automovel carro09 = new Automovel("Fiat", "Uno", "Seda", "09", "2020", "2020", "Branco", "ABC0009");
        Automovel carro10 = new Automovel("Fiat", "Uno", "Seda", "10", "2020", "2020", "Branco", "ABC0010");
        ArvoreBinaria<Automovel> arvore = new ArvoreBinaria<Automovel>();
        arvore.inserir(carro05);
        arvore.inserir(carro02);
        arvore.inserir(carro07);
        arvore.inserir(carro06);
        arvore.inserir(carro01);
        arvore.inserir(carro09);
        arvore.inserir(carro08);
        arvore.inserir(carro04);
        arvore.inserir(carro03);
        arvore.inserir(carro10);
        arvore.imprimePreFixado();
        arvore.imprimeEmOrdem();
        System.out.println(arvore.pesquisa(carro01));
    }
}
