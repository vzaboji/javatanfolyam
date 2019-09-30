package firstweek;

import javax.swing.*;
import java.util.Scanner;

public class ChristmasTree {

    public static void main (String[] args){

        System.out.println("Adja be hogy hany sorja legyen a fanak:");
        Scanner input = new Scanner(System.in);
         int numbers = input.nextInt();
         String space = " ";
         String star = "*";
        for (int i = 0; i < numbers; i++) {

            for (int k = 0; k < numbers-i; k++) {
                System.out.print(space);
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}

