package p1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        try{
            nums[6] = 100;
            //nums[6] = Integer.parseInt("dfhdgshjf");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Выход за пределы массива");
        }
        catch (NumberFormatException exception){
            System.out.println("Ошибка преобразования");
        }
        finally {
            System.out.println("Блок finally");
        }
        System.out.println("End program");
    }
}