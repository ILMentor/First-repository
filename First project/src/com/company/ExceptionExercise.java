package com.company;

import java.util.*;

public class ExceptionExercise {

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] m = {0, 1, 2};
        for(;;){
            try {
                System.out.println(4/m[a]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("/ by 0. Try again.");
                a = sc.nextInt();
                continue;
            }  catch (Exception e) {
                System.out.println("No. Try again.");
                a = sc.nextInt();
                continue;
            }
            break;
        }
    }

}
