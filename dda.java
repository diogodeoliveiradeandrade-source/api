//matrizes
public class ExemploMatrizCompleta {
    public static void main(String[] args) {
        // Declaração e instanciação de uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];
        
        // Preenchendo a matriz com valores manuais usando loops aninhados
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas[span_10](start_span)[span_10](end_span)
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas da linha 'i[span_11](start_span)'[span_11](end_span)
                matriz[i][j] = contador * 10;
                contador++;
            }
        }
        
        // Exibindo a matriz e somando os elementos
        int somaTotal = 0;
        System.out.println("Elementos da Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                somaTotal += matriz[i][j]; // Acumula os valores[span_12](start_span)[span_12](end_span)
            }
            System.out.println(); // Quebra de linha para formar o formato de tabela
        }
        
        System.out.println("A soma de todos os elementos da matriz é: " + somaTotal);
    }
}

//métodos 
public class ExemploMetodosCompletos {
    
    public static void main(String[] args) {
        // Chamada de um método sem retorno
        exibirMensagem("Estudar para a P2 de Algoritmos!");
        
        // Chamada de um método com retorno (armazenando o resultado numa variável)
        int resultadoArea = calcularAreaQuadrado(5);
        System.out.println("A área do quadrado é: " + resultadoArea);
    }
    
    // 1. Método SEM retorno (void) que recebe um parâmetro String[span_6](start_span)[span_6](end_span)
    public static void exibirMensagem(String texto) {
        System.out.println("=== AVISO ===");
        System.out.println(texto);
        System.out.println("=============");
    }
    
    // 2. Método COM retorno (int) que recebe um parâmetro int[span_7](start_span)[span_7](end_span)
    public static int calcularAreaQuadrado(int lado) {
        int area = lado * lado;
        return area; // Devolve o valor calculado para quem chamou o método[span_8](start_span)[span_8](end_span)
    }
}
//random 
import java.util.Random; // 1. Importação obrigatória da biblioteca

public class ExemploAleatorio {
    public static void main(String[] args) {
        Random random = new Random(); // 2. Criação do gerador
        
        // Sorteia um número inteiro entre 0 e 9
        int deZeroANove = random.nextInt(10);
        
        // Sorteia um número inteiro entre 10 e 100 (Início: 10, Quantidade de elementos: 91)
        int entre10E100 = 10 + random.nextInt(90 + 1);
        
        // Sorteia um número de ponto flutuante entre 0.0 e 1.0 (sem parâmetros)
        double pontoFlutuante = random.nextDouble();
        
        System.out.println("Número entre 0 e 9: " + deZeroANove);
        System.out.println("Número entre 10 e 100: " + entre10E100);
        System.out.println("Double entre 0 e 1: " + pontoFlutuante);
    }
}

//interação 
public class ExemploIteracao {
    public static void main(String[] args) {
        int[][] predio = new int[2][3];

        // Loops aninhados para percorrer todo o "prédio" (iterar sobre a matriz)[span_6](start_span)[span_6](end_span)
        for (int linha = 0; linha < predio.length; linha++) {
            for (int coluna = 0; coluna < predio[linha].length; coluna++) {
                
                // Guardando um bloco virtual em cada porta de cada andar
                System.out.println("Visitando andar " + linha + ", porta " + coluna);
                
            }
        }
    }
}

//Este guia intensivo de estudos foca nos conteúdos programados para a Avaliação P2 - Objetiva. A prova abrangerá comandos de iteração, números aleatórios, funções, vetores e matrizes.
1. Números Aleatórios (Classe Random)
A geração de valores aleatórios em Java é feita através da classe Random.
 * Importação e Instanciação: É obrigatório importar a biblioteca com import java.util.Random; e instanciar o gerador com Random random = new Random();.
 * Gerando Inteiros (nextInt):
   * random.nextInt() sorteia um valor dentro de todo o intervalo possível de inteiros.
   * random.nextInt(10) sorteia um número entre 0 e 9.
 * Sorteio com Intervalo Específico: A fórmula geral é inicio do intervalo + random.nextInt(quantidade de elementos). Por exemplo, para sortear um número entre 10 e 100, utiliza-se 10 + random.nextInt(90 + 1).
 * Gerando Ponto Flutuante (nextDouble):
   * O método random.nextDouble() sorteia um valor entre 0 e 1 e não aceita parâmetros.
   * Para ampliar o intervalo (ex: entre 10 e 100), multiplica-se a amplitude e soma-se a base: 10 + random.nextDouble() * 90.
2. Modularização (Métodos e Funções)
Métodos são blocos de código que dividem um problema maior em partes, cada uma resolvendo uma tarefa específica. Isso evita repetição de código e traz agilidade na manutenção.
 * Métodos Sem Retorno: Utilizam a palavra-chave void na sua declaração, indicando que executam um conjunto de instruções e apenas retornam ao ponto de onde foram chamados, sem devolver um valor ao sistema. Exemplo de sintaxe: public static void nomeMetodo() { ... }.
 * Métodos Com Retorno: Devolvem um valor para o chamador, substituindo o void pelo tipo de dado (como int, float, double, boolean) e exigem a presença da palavra return dentro do bloco de código. Exemplo: public static int somar(int n1, int n2) { return n1 + n2; }.
 * Parâmetros: São opcionais e funcionam como variáveis locais do método que recebem valores externos no momento da chamada (argumentos), devendo ser separados por vírgula com seus respectivos tipos declarados.
3. Matrizes (Arrays Bidimensionais)
Matrizes são arrays de arrays usados para organizar dados de forma estruturada em linhas e colunas.
 * Declaração e Instanciação:
   * A declaração (ex: int[][] matriz) informa ao compilador a existência da variável e suas duas dimensões, mas não aloca memória.
   * A instanciação reserva espaço na memória utilizando new (ex: new int[linhas][colunas]). O Java inicializa automaticamente cada posição com o valor padrão do tipo (como zero para números). Também é possível inicializar diretamente com chaves aninhadas, onde cada conjunto interno representa uma linha.
 * Acesso por Índices: Os dados são acessados usando os índices numéricos de linha e coluna, sendo que ambos obrigatoriamente iniciam em zero. É crucial respeitar os limites da matriz para evitar erros de execução de acesso fora dos limites.
 * Percorrendo Matrizes: Utiliza-se loops aninhados (um laço dentro do outro), onde o loop externo geralmente percorre as linhas e o interno percorre as colunas.
 * Propriedade length:
   * matriz.length retorna a quantidade total de linhas.
   * matriz[i].length retorna a quantidade de colunas presentes especificamente na linha i. O uso do length garante que o código funcione corretamente mesmo que a matriz tenha linhas de tamanhos diferentes.
Se precisar revisar as estruturas de iteração (while, do-while e for) para aplicar dentro das matrizes, ou testar a lógica com um pequeno exercício, me avise o ponto de maior dúvida.
    //
    Na programação, a iteração (frequentemente chamada de laço de repetição ou loop) é o processo de executar um mesmo bloco de código repetidas vezes, geralmente até que uma condição específica seja atingida ou concluída.
No contexto da sua disciplina, este tema é classificado no cronograma como comandos de iteração e estruturas de repetição. Os principais comandos ensinados são:
 * Laço while e do while: Avaliam uma condição e repetem a execução enquanto essa condição for verdadeira.
 * Laço for: Muito utilizado quando se sabe exatamente quantas vezes o bloco de código precisará de ser repetido.
Para a sua avaliação de matrizes, a iteração é o mecanismo utilizado para percorrer os dados. Utilizam-se loops aninhados (um comando de iteração dentro do outro, iterando sobre as linhas e as colunas) para ler, modificar ou acumular os valores armazenados em cada posição da matriz.
    //
    Aqui está a explicação de cada conceito usando exemplos do dia a dia:
 * Array (Vetor): Pense num trem de brinquedo de vários vagões. O trem inteiro é o seu "array" e cada vagão serve para guardar uma única coisa do mesmo tipo (como pecinhas de lego). A única regra esquisita na programação é que o maquinista começa a contar os vagões a partir do zero. Então, o primeiro vagão é o número 0, o segundo é o 1, e assim por diante.
 * Matrizes (Arrays Bidimensionais): Imagine um tabuleiro do jogo Batalha Naval ou um prédio de apartamentos. Se você quiser entregar uma carta em um prédio, não basta dar um número só; você precisa dar o andar (linha) e o número da porta (coluna). A matriz é essa grade que organiza as informações cruzando linhas e colunas.
 * Iteração (Repetição): Imagine que a sua mãe pede para você guardar 50 bloquinhos na caixa. Em vez de ela falar "guarde um", depois "guarde outro", depois "guarde outro" cinquenta vezes, ela apenas diz: "repita a ação de guardar um bloco até acabar". Iterar é um comando que ensina o computador a repetir um trabalho chato várias vezes em círculos (os loops) até terminar a missão, sem precisar que você escreva o comando dezenas de vezes.
//
    Os comandos de iteração abordados na sua disciplina servem para automatizar a repetição de blocos de código, possuindo cada um um comportamento estrutural distinto:
 * while (Enquanto): Avalia a condição lógica antes de executar o código. Se a condição for falsa logo à partida, o bloco nunca chega a ser executado. É ideal para cenários onde não se sabe previamente o número exato de repetições necessárias (por exemplo, continuar a pedir uma palavra-passe até o utilizador acertar).
 * do while (Fazer... Enquanto): Executa o bloco de código primeiro e só depois avalia a condição lógica. Esta inversão garante que a ação é realizada pelo menos uma vez, mesmo que a regra de paragem seja imediatamente falsa.
 * for (Para): Agrupa a criação da variável de controlo, a condição de paragem e o incremento (ou decremento) numa única linha. É a estrutura de eleição quando se sabe exatamente quantas vezes o ciclo tem de rodar, sendo a ferramenta padrão para percorrer posições de arrays e matrizes do início ao fim.
    //
    
    
A modularização consiste em dividir um problema grande e complexo em partes mais pequenas, denominadas módulos. Na linguagem Java, estes módulos são chamados de métodos, sendo que cada um é desenhado para resolver uma tarefa específica e única.
Para compreender o conceito de forma simples, imagine a cozinha de um restaurante:
 * O método principal (main): Funciona como o Chefe de Cozinha. É ele que gere o código e aciona os outros módulos para executarem tarefas, em vez de fazer o trabalho todo sozinho.
 * Parâmetros (Os Ingredientes): São as informações de entrada que o método precisa para funcionar. Por exemplo, para calcular a soma de dois valores, o método tem de receber esses dois números como parâmetros.
 * Métodos Sem Retorno (void): É como pedir a um empregado para "limpar a mesa". Ele vai, executa a ação e volta, sem entregar nada nas mãos do Chefe. Em código, a palavra void indica que o método executa um conjunto de instruções (como imprimir uma mensagem) e regressa ao ponto onde foi chamado, sem devolver qualquer valor de volta ao sistema.
 * Métodos Com Retorno: É como pedir a um pasteleiro para "fazer um bolo". Ele recebe os ingredientes (parâmetros), executa o trabalho e devolve o bolo pronto. Na programação, o método faz o cálculo e devolve o valor exato (utilizando a instrução return) para o local onde foi inicialmente chamado.
A principal vantagem de utilizar métodos é evitar a repetição de código no programa. Se precisar de fazer a mesma equação matemática dez vezes, em vez de escrever o cálculo dez vezes, cria um método apenas uma vez e simplesmente "chama" esse método quando precisar, o que traz uma enorme facilidade e agilidade na manutenção do código.
Veja como isto se traduz na prática em código Java:
public class ExemploMetodos {
    
    // O Chefe de Cozinha (Módulo principal onde o programa começa a executar)[span_9](start_span)[span_9](end_span)
    public static void main(String[] args) {
        
        // O main "chama" o método somar e passa os ingredientes (10 e 50) como argumentos[span_10](start_span)[span_10](end_span)
        int resultado = somar(10, 50); 
        System.out.println("A soma é: " + resultado);
    }

    // O Ajudante (Método com retorno que recebe dois parâmetros do tipo int)[span_11](start_span)[span_11](end_span)
    public static int somar(int n1, int n2) {
        // A instrução return devolve o valor final da soma para quem chamou o método[span_12](start_span)[span_12](end_span)
        return n1 + n2; 
    }
}

    
    
