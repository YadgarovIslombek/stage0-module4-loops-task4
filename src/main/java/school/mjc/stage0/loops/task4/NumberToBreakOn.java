package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i<numberToGoUntil; i++) {

            if (i > toBreakWith) {
                break;

            }
            if (toBreakWith > numberToGoUntil){
                System.out.print(i);
            }else {

            System.out.print( i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberToBreakOn ss = new NumberToBreakOn();
        ss.printNumbersUntilWithBreakOn(a,b);
    }
}
