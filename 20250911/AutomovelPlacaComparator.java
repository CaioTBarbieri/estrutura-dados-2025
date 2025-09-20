import java.util.Comparator;

public class AutomovelPlacaComparator implements Comparator<Automovel> {
    @Override
    public int compare(Automovel a1, Automovel a2) {
        return a1.placa.compareTo(a2.placa);
    }
}
