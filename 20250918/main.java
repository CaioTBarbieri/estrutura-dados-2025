import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Escreve seu código para implementar as classes arvore e populá-las.

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("João", "1995-05-15","50800670809", "123456789","135792460","23456789"));
        pacientes.add(new Paciente("Maria", "1998-03-22","51500670809", "987654321","395841263","23456789"));
        pacientes.add(new Paciente("Ana", "1996-07-10","52000670809", "456789123","246813574","23456789"));
        pacientes.add(new Paciente("Carlos", "1990-12-01","53000670809", "789123456","417593681","23456789"));
        pacientes.add(new Paciente("Beatriz", "2000-01-15","54000670809", "321654987","528649710","23456789"));
        pacientes.add(new Paciente("Daniel", "1985-11-30","55000670809", "654987321","639752846","23456789"));
        pacientes.add(new Paciente("Eduardo", "1992-09-12","56000670809", "987123654","753198642","23456789"));
        pacientes.add(new Paciente("Fernanda", "1997-04-25","57000670809", "123789456","864297537","23456789"));
        pacientes.add(new Paciente("Gabriela", "1994-06-18","58000670809", "456123789","975318648","23456789"));
        pacientes.add(new Paciente("Hugo", "1988-08-08","59000670809", "789456123","984627135","23456789"));


        ArvoreBinaria<Paciente> arvorePorCPF = new ArvoreBinaria<>();
        ArvoreBinariaComparator<Paciente> arvorePorRG = new ArvoreBinariaComparator<>(new PacienteRGComparator());

        for (Paciente paciente : pacientes) {
            arvorePorCPF.inserir(paciente);
            arvorePorRG.inserir(paciente);
        }

        System.out.println("Impressão em ordem (por CPF):");
        arvorePorCPF.imprimeEmOrdem();
        System.out.println("\nImpressão em pré-ordem (por RG):");
        arvorePorRG.imprimeEmOrdem();

        arvorePorCPF.remover(pacientes.get(3)); 
        arvorePorRG.remover(pacientes.get(3)); 

        System.out.println(" ");
        arvorePorCPF.pesquisa(pacientes.get(3));
        arvorePorRG.pesquisa(pacientes.get(3)); 

        System.out.println();

        arvorePorCPF.pesquisa(pacientes.get(5));
        arvorePorRG.pesquisa(pacientes.get(5)); 

        System.out.println("\n Árvore Binária de Busca por CPF (Pré fixado):");
        arvorePorCPF.imprimePreFixado();
        System.out.println(" ");

        System.out.println("\n Árvore Binária de Busca por RG (Pré fixado):");
        arvorePorRG.imprimePreFixado();
        System.out.println(" ");

        System.out.println("\n Árvore Binária de Busca por CPF (Pós fixado):");
        arvorePorCPF.imprimePosFixado();
        System.out.println(" ");

        System.out.println("\n Árvore Binária de Busca por RG (Pós fixado):");
        arvorePorRG.imprimePosFixado();
        System.out.println(" ");
        }
}
