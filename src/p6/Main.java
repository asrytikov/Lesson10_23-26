package p6;

public class Main {

    public static void main(String[] args) {
        try{
            System.err.println("level 0");
            if (true){
                throw new Error();
            }
            System.err.print("level 1");
        } catch (Error exception){
            System.err.println("level 2");
        }
        System.err.println("level 3");

    }


}
