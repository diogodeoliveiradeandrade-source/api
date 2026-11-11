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

//
