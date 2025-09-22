import java.util.Comparator;

public class ArvoreBinariaComparator<T> implements Arvore<T>{
    private NodoArvore<T> raiz;
    private final Comparator<T> comparator;

    @Override
    public void imprimePreFixado() {
        imprimePreFixadoRecursivo(raiz);
    }

    private void imprimePreFixadoRecursivo(NodoArvore<T> noAtual) {
        if (noAtual != null) {
            System.out.println(noAtual.objeto);
            imprimePreFixadoRecursivo(noAtual.filhoEsquerda);
            imprimePreFixadoRecursivo(noAtual.filhoDireita);
        }
    }

    public void imprimeEmOrdem() {
        imprimeEmOrdemRecursivo(this.raiz);
    }

    /**
     * Método auxiliar recursivo para o caminhamento em ordem.
     * * @param no O nó raiz da subárvore a ser impressa.
     */
    private void imprimeEmOrdemRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimeEmOrdemRecursivo(no.filhoEsquerda);
            System.out.print(no.objeto + " ");
            imprimeEmOrdemRecursivo(no.filhoDireita);
        }
    }
    public void imprimePosFixado() {
        imprimePosFixadoRecursivo(this.raiz);
    }

    /**
     * Método auxiliar recursivo para o caminhamento pós-fixado.
     * * @param no O nó raiz da subárvore a ser impressa.
     */
    private void imprimePosFixadoRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimePosFixadoRecursivo(no.filhoEsquerda);
            imprimePosFixadoRecursivo(no.filhoDireita);
            System.out.print(no.objeto + " ");
        }
    }



    @Override
    public NodoArvore<T> pesquisa(T objeto) {
        return pesquisaRecursivo(raiz, objeto);
    }

    private NodoArvore<T> pesquisaRecursivo(NodoArvore<T> noAtual, T objeto) {
        if (noAtual == null) {
            return null;
        }
        int cmp = comparator.compare(objeto, noAtual.objeto);
        if (cmp == 0) {
            return noAtual;
        } else if (cmp < 0) {
            return pesquisaRecursivo(noAtual.filhoEsquerda, objeto);
        } else {
            return pesquisaRecursivo(noAtual.filhoDireita, objeto);
        }
    }

    public ArvoreBinariaComparator(Comparator<T> comparator) {
        this.raiz = null;
        this.comparator = comparator;
    }

    @Override
    public void inserir(T objeto) {
        this.raiz = inserirRecursivo(this.raiz, objeto);
    }

    private NodoArvore<T> inserirRecursivo(NodoArvore<T> noAtual, T objeto) {
        if (noAtual == null) {
            return new NodoArvore<>(objeto);
        }

        if (comparator.compare(objeto, noAtual.objeto) < 0) {
            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, objeto);
        } else if (comparator.compare(objeto, noAtual.objeto) > 0) {
            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, objeto);
        }
        return noAtual;
    }

    @Override
    public void remover(T objeto) {
        this.raiz = removerRecursivo(this.raiz, objeto);
    }

    private NodoArvore<T> removerRecursivo(NodoArvore<T> no, T objeto) {
        if (no == null) {
            return null;
        }

        if (comparator.compare(objeto, no.objeto) < 0) {
            no.filhoEsquerda = removerRecursivo(no.filhoEsquerda, objeto);
        } else if (comparator.compare(objeto, no.objeto) > 0) {
            no.filhoDireita = removerRecursivo(no.filhoDireita, objeto);
        } else {
            if (no.filhoEsquerda == null && no.filhoDireita == null) {
                return null;
            } else if (no.filhoEsquerda == null) {
                return no.filhoDireita;
            } else if (no.filhoDireita == null) {
                return no.filhoEsquerda;
            } else {

                NodoArvore<T> sucessor = encontrarMinimo(no.filhoDireita);
                no.objeto = sucessor.objeto;
                no.filhoDireita = removerRecursivo(no.filhoDireita, sucessor.objeto);
            }
        }
        return no;
    }

    private NodoArvore<T> encontrarMinimo(NodoArvore<T> no) {
        while (no.filhoEsquerda != null) {
            no = no.filhoEsquerda;
        }
        return no;
    }
}