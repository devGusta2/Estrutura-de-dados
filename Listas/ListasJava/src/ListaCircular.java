import java.util.LinkedList;
import java.util.ListIterator;
public class ListaCircular{
    private LinkedList<String> lista =  new LinkedList<>();

    public ListaCircular(){

    }
    public void adicionar(String item){
        lista.add(item);
    }
    public void remover(String item){
        if(lista.isEmpty()){
            System.out.println("A lista está vazia");
            return;
        }
    }
    public void percorrer(int loops){
    
        ListIterator<String> it = lista.listIterator();

        int contador = 0;

        while(contador < loops){
            if(!it.hasNext()){

            }
        
        }
    }
}