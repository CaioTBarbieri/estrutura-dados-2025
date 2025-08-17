public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();


        arvore.inserir(69);
        arvore.inserir(37);
        arvore.inserir(60);

        arvore.imprime_preFixado();

        arvore.inserir(50);
        arvore.imprime_preFixado();

        arvore.pesquisa(69);
        System.out.println(arvore.pesquisa(69));




    }
}