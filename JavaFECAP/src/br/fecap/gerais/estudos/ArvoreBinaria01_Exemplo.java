// Classe para representar um nó de uma árvore binária

static class arvoreBinaria01Exemplo {

    int valor;
    arvoreBinaria01Exemplo esquerda;
    arvoreBinaria01Exemplo direita;

    // Construtor da classe ArvoreBinaria01_Exemplo

    // Em primeiro lugar, cria um nó sem os filhos
    public arvoreBinaria01Exemplo(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

// Mé_todo para inserir um valor na árvore binária
// Regra BST: Se o valor for menor que o nó atual, vai para a esquerda. Se for maior, paro direita
public static arvoreBinaria01Exemplo inserir(arvoreBinaria01Exemplo raiz, int valor) {

    // Validando se a raiz é nula (árvore varia)
    if(raiz == null) {
        return new arvoreBinaria01Exemplo(valor); // Cria um novo nó com o valor e o define como raiz
    }
    if(valor < raiz.valor) {
        raiz.esquerda = inserir(raiz.esquerda, valor);
    } else if(valor > raiz.valor) {
        raiz.direita = inserir(raiz.direita, valor);
    }
    return raiz;
}

// Mé_todo para imprimir os valores da árvore em ordem
public static void imprimirEmOrdem(arvoreBinaria01Exemplo raiz) {
    if(raiz != null) {
        imprimirEmOrdem(raiz.esquerda);
        System.out.print(raiz.valor + " ");
        imprimirEmOrdem(raiz.direita);
    }
}

// Mé_todo principal
public static void main(String[] args) {
    arvoreBinaria01Exemplo raiz = null; // Inicializando a raiz da árvore como nula.
    raiz = inserir(raiz, 50); // Inserindo o valor 50 na árvores e definindo como raiz
    inserir(raiz, 30);
    inserir(raiz, 70);
    inserir(raiz, 20);
    inserir(raiz, 40);
    inserir(raiz, 60);
    inserir(raiz, 80);
    System.out.println("Árvore em ordem: ");
    imprimirEmOrdem(raiz);

}