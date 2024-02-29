/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args ){

        Main main = new Main();

        main.compute();
    }

    public void compute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if(name.equals("Bob")){
            System.out.println("Hello Bob!");
        }else if(name.equals("Alice")){
            System.out.println("Hello Alice!");
        }else{
            System.out.println("You are neither Alice or Bob");
        }
        scanner.close();
    }
}
