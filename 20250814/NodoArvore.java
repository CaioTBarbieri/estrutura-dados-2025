public class NodoArvore {
    public NodoArvore filhoEsquerda;
    public int chave;
    public NodoArvore filhoDireita;

    // O construtor foi alterado para public
    public NodoArvore(int chave) {
        this.chave = chave;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
}