public class main {
    public static void main(String[] args) {

        ArvoreBinaria<medico> arvore = new ArvoreBinaria<>();

        //Inserindo médicos na árvore
        arvore.inserir(new medico("Juliana Santos", "Otorrinolaringologia", "789012SP"));
        arvore.inserir(new medico("Marcos Andrade", "Clínica Geral", "789012MG"));
        arvore.inserir(new medico("Beatriz Ribeiro", "Geriatria", "789012RJ"));
        arvore.inserir(new medico("Felipe Azevedo", "Nefrologia", "789012BA"));
        arvore.inserir(new medico("Larissa Moreira", "Reumatologia", "789012RS"));
        arvore.inserir(new medico("Thiago Rocha", "Pneumologia", "789012DF"));
        arvore.inserir(new medico("Camila Barros", "Angiologia", "789012PR"));
        arvore.inserir(new medico("Guilherme Martins", "Infectologia", "789012ES"));
        arvore.inserir(new medico("Amanda Goncalves", "Hematologia", "789012CE"));
        arvore.inserir(new medico("Bruno Ferreira", "Oncologia", "789012PE"));

        System.out.println("\n--- Impressão da Árvore ---");
        System.out.println();

        System.out.print("Caminhamento Pré-Fixado (Raiz, Esquerda, Direita): ");
        arvore.imprimePreFixado();
        System.out.println(); 
        System.out.println();

        System.out.print("Caminhamento Em Ordem (Esquerda, Raiz, Direita): ");
        arvore.imprimeEmOrdem();
        System.out.println();
        System.out.println();

        System.out.print("Caminhamento Pós-Fixado (Esquerda, Direita, Raiz): ");
        arvore.imprimePosFixado();
        System.out.println();
        System.out.println();

    }
}