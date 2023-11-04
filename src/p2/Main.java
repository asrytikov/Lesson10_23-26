package p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x>30) throw new Exception("Число x должно быть меньше 30");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Program end");
    }

}
