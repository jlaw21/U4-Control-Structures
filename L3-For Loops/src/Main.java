import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        /*String word = "Programming";

        for(int i = 2; i < 10; i++){
            System.out.println(i*2);
        }

        System.out.println();*/

        //Create a for loop that counts backwards from 10.

        /*for(int i = 10; i > 0; i--){
            System.out.println(i);
        }*/

        //Create a for loop that outputs every third number from 1 to 30.

        for(int i = 0; i < 4; i++){
            for(int j = 4; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}