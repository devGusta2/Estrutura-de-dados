
//FIFO (FIRST IN - FIRST OUT) - FILA estrutura de dados 29/11/2024
// fila é limitada - overflow
// Fila circular - os elementos sao usados de maneira circular onde o ultimo elmento esta agarrado ao primeiro elemento
// Fila circular nao permite dar o overflow, vai subistituindo os dados

// Filas de prioridade - dependendo da prioridade ele pode ser colocado no inicio da fila (enqueue)

// remover - desenfileiramento pelo primeiro


// Fila dupla

/*
    --enqueue - enfileira
    -- size - retornar o tamanho
    --dequeue - tira da fila
    --empty - verifica se é vazio
*/

// offer - adiciona elementos na lista;
import java.util.LinkedList;
import java.util.Queue;
public class App {
    public static void main(String[] args) throws Exception {
        // Criando Fila
        Queue<String> veiculos  = new LinkedList<>();
        veiculos.offer("Gol");
        veiculos.offer("Argo");
        veiculos.offer("Kwid");
        veiculos.offer("HB20");
        

        // Qual o tamanho esta na fila
        System.out.println("Quantidade de veículos na fila: " + veiculos.size());
        // A fila está vazia ?
        System.out.println("Tem veículos na fila ?: " + veiculos.isEmpty());
        // Quem está no inicio - peek();
        System.out.println("O veículo que está no início é: " + veiculos.peek());
        
        
        // Percorrendo uma fila
        for(String carro:veiculos){
            System.out.println(carro);
        }
        
        //Removendo elementos do inicio da fila
        
        System.err.println("Removendo veículo: " + veiculos.poll());
        System.err.println("Removendo veículo: " + veiculos.poll());
        
    }
}
