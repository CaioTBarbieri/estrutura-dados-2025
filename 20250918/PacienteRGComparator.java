import java.util.Comparator;
public class PacienteRGComparator implements Comparator<Paciente> {

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return p1.getRg().compareTo(p2.getRg());
    }
}
