import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int amigos = 0;
        int inimigos = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] =sc.nextInt();

            if(i == 0 || i == 1 ||i == 2 || i == 5){
                amigos += arr[i];
            }else{
                inimigos += arr[i];
            }
        }

        if(inimigos > amigos){
            System.out.println("Sauron has returned.");
        }else{
            System.out.println("Middle-earth is safe.");
        }

        sc.close();
    }
}
