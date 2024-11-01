import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        // declarando a lista
        ArrayList<String> frutas = new ArrayList<>();


        // adicionar elementoS : ADD

        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Melancia");
        frutas.add("Uva");
        

        // remover
        frutas.remove(1);

        // consultar elementos de maneira direta

        System.out.println(frutas.get(0));

        // consultar o tamanho da lista
        System.out.println("O tamanho da lista é:"+frutas.size());

        // verificar se a lista está vazia
        System.out.println("A lista está vazia ?");
        if(frutas.isEmpty()){
            System.out.println("Está vazia");
        }else{
            System.out.println("Não está vazia");
        }
    }
}
