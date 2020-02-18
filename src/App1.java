import java.util.*;
import static util.Keyboard.*;
import util.Keyboard;
import java.io.*;




public class App1 {


    public static void main(String[]args) {
        System.out.println("Enter the length of the array: ");
        int lungime = nextInt();

        int[] sir = new int[lungime];

        System.out.println("Enter a number to find how many digits can be found from "+lungime+ " numbers");
        int d = nextInt();

        int count = 0;

        for (int i = 0; i < sir.length; i++) {
            sir[i] = (i + 1)*(i + 1);
            print(sir[i]+" ");
                if(sir[i]==d){
                    count ++;
                }
                if(sir[i]>d){
                    while(sir[i]>=10){
                        int digit = sir[i] %10;
                        if(digit == d){
                            count++;
                        }
                        sir[i] = sir[i] / 10;
                        if(sir[i] ==d){
                            count++;
                        }
                    }
            }
        }
        if(count==1){
            System.out.println("\nThe digit "+d+" can be found "+count+" time");
        }else{
            System.out.println("\nThe digit "+d+" can be found "+count+" times");
        }
    }
}
