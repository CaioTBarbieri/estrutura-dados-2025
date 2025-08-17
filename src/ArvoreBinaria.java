public class ArvoreBinaria implements Arvore {

    private NodoArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }


    @Override
    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private NodoArvore inserirRecursivo(NodoArvore noAtual, int valor) {
        if (noAtual == null) {
            return new NodoArvore(valor);
        }


        if (valor < noAtual.chave) {
            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, valor);

        } else if (valor > noAtual.chave) {
            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, valor);
        }


        return noAtual;
    }

    @Override
    public NodoArvore pesquisa(int valor) {
        return pesquisaRecursivo(this.raiz, valor);
    }

    private NodoArvore pesquisaRecursivo(NodoArvore noAtual, int valor) {
        if (noAtual == null || noAtual.chave == valor) {
            return noAtual;
        }

        if (valor < noAtual.chave) {
            return pesquisaRecursivo(noAtual.filhoEsquerda, valor);
        } else {
            return pesquisaRecursivo(noAtual.filhoDireita, valor);
        }
    }


    @Override
    public void remover(int valor) {
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    private NodoArvore removerRecursivo(NodoArvore noAtual, int valor) {
        if (noAtual == null) {
            return null;
        }

        if (valor < noAtual.chave) {
            noAtual.filhoEsquerda = removerRecursivo(noAtual.filhoEsquerda, valor);
        } else if (valor > noAtual.chave) {
            noAtual.filhoDireita = removerRecursivo(noAtual.filhoDireita, valor);
        } else {

            if (noAtual.filhoEsquerda == null && noAtual.filhoDireita == null) {
                return null;
            }

            if (noAtual.filhoDireita == null) {
                return noAtual.filhoEsquerda;
            }
            if (noAtual.filhoEsquerda == null) {
                return noAtual.filhoDireita;
            }

            int menorValor = encontrarMenorValor(noAtual.filhoDireita);

            noAtual.chave = menorValor;

            noAtual.filhoDireita = removerRecursivo(noAtual.filhoDireita, menorValor);
        }
        return noAtual;
    }


    private int encontrarMenorValor(NodoArvore no) {
        return no.filhoEsquerda == null ? no.chave : encontrarMenorValor(no.filhoEsquerda);
    }


    @Override
    public void imprime_preFixado() {
        imprimePreFixadoRecursivo(this.raiz);
        System.out.println();
    }


    private void imprimePreFixadoRecursivo(NodoArvore no) {
        if (no != null) {
            System.out.print(no.chave + " ");
            imprimePreFixadoRecursivo(no.filhoEsquerda);
            imprimePreFixadoRecursivo(no.filhoDireita);
        }
    }
}