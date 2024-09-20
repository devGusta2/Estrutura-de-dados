import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int [][] matriz = new int[3][3];


        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 5;

        matriz[1][0] = 4;
        matriz[1][1] = 7;

        matriz[2][0] = 9;
        matriz[2][1] = 8;


        //iniciar sem valorez


        System.out.println(Arrays.deepToString(matriz));

        for(int linha=0; linha<matriz.length; linha++){

            for(int col=0; col<matriz[linha].length; col++){
                System.out.println(matriz[linha][col]);
            }
            System.out.println("");
        }

        //Matriz com valores preenchidos

        int [][] matriz2 = {
            {
                1,2
            },
            {
                2,3
            },
            {
                4,5
            }
        };

    }
}
