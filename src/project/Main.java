package project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///t - user's number, that program should factor
        ///k - value of exponent
        ///i - default number by which program will divide t
        int t, k, i=2;
        ///a - variable that help the program output result
        boolean a = false;
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        System.out.print(t+" = ");
        ///If i <=t then go to code execution , if i>t then exit
        while(i<=t){
            ///If t-number is dividing by i-number then go to code execution, if no then i+1 and recheck this
            if(t%i == 0){
                k = 1;
                t /= i;

                ///Finding right exponent for i-number
                while (t%i ==0){
                    t /= i;
                    k++;
                }
                ///Output code
                if(!a){
                    System.out.print(i);
                }
                else{
                    System.out.print("*" +i);
                }
                if(k>1){
                    System.out.print("^" + k);
                }
                a = true;
            }
            i++;
        }
    }
}

