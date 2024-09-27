import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        Stack <String> pilhaPrato = new Stack<>();
        //adicionando pratos - push
        pilhaPrato.push("Prato Laranja");
        pilhaPrato.push("Prato Vermelho");
        pilhaPrato.push("Prato Azul");
        pilhaPrato.push("Prato Verde");
    
        //tamanho da pilha - size
        int tam = pilhaPrato.size();
        System.out.println("O tamanho da pilha é: " + tam);

        //verificar o topo da pilha - peek

        String topo = pilhaPrato.peek();
        System.out.println("O elemento do topo é: " + topo);

        //removendo o elemento do topo - pop
        String rem = pilhaPrato.pop();
        System.out.println("O elemento removido foi: " + rem);

        //verificar o topo da pilha
        topo = pilhaPrato.peek();
        System.out.println("O elemento do topo é: " + topo);


        //Acessando os elementos da pilha
        for(int i = pilhaPrato.size()-1; i>=0; i-- ){
            //obtem o elemento que ta na pilha referente ao i
            System.out.println(pilhaPrato.get(i));
        }
    }
}
