import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("Marca1", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaF");
        ArvoreBinaria<Automovel> arvore = new ArvoreBinaria<>();
        List<Automovel> listaCarros = new ArrayList<Automovel>();
        arvore.inserir(auto1);
        listaCarros.add(auto1);
        Automovel auto2 = new Automovel("Marca2", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaE");
        Automovel auto3 = new Automovel("Marca3", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaD");
        Automovel auto4 = new Automovel("Marca4", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaC");
        Automovel auto5 = new Automovel("Marca5", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaB");
        Automovel auto6 = new Automovel("Marca6", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "PlacaA");
        Automovel auto7 = new Automovel("Marca7", "Modelo1", "Tipo1", "Chassi1", "2020", "2021", "Cor1", "Placaa");
        arvore.inserir(auto4);
        listaCarros.add(auto4);
        arvore.inserir(auto6);
        listaCarros.add(auto6);
        arvore.inserir(auto3);
        listaCarros.add(auto3);
        arvore.inserir(auto5);
        listaCarros.add(auto5);
        arvore.inserir(auto2);
        listaCarros.add(auto2);
         System.out.println("Em ordem:");
         arvore.imprimeEmOrdem();
         System.out.println("Pré-fixado:");
         arvore.imprimePreFixado();
         System.out.println("Achei: " + arvore.pesquisa(auto7));
         arvore.remover(auto3);
         arvore.imprimeEmOrdem();
         System.out.println("Achei: " + arvore.pesquisa(auto3));
         arvore.remover(auto5);
        System.out.println("Achei: " + arvore.pesquisa(auto5));
        arvore.remover(auto4);
        System.out.println("Achei: " + arvore.pesquisa(auto4));
        arvore.imprimeEmOrdem();
        System.out.println("Lista de carros:");
        System.out.println(listaCarros);
        List<Automovel> listaCarrosOrdenada = new ArrayList<>(listaCarros);
        Collections.sort(listaCarrosOrdenada);
        System.out.println("Lista de carros ordenada:");
        System.out.println(listaCarrosOrdenada);
        List<Automovel> listaCarrosOrdenadaPlaca = new ArrayList<>(listaCarros);
        Collections.sort(listaCarrosOrdenadaPlaca, new AutomovelPlacaComparator());
        System.out.println("Lista de carros ordenada por placa:");
        System.out.println(listaCarrosOrdenadaPlaca);
    }
}
