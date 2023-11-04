package p5;

public class Main {

    public static void main(String[] args) {
        try {
            int res = SumsNums.getSumsNums(0, 1);
        }catch (SumsException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getA());
            System.out.println(exception.getB());
        }
    }

}
