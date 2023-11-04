package p3;

public class Main {

    public static void main(String[] args) {

        try {
            int res = getSum(1, 5);
            System.out.println(res);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        int res2 = getSum2(0,5);
        System.out.println(res2);
    }

    public static int getSum(int a, int b) throws Exception{
        if (a<1 || b<1) throw new Exception("The numbers < 1");
        return a+b;
    }

    public static int getSum2(int a, int b){
        int res = 0;
        try {
            if (a < 1 || b < 1) throw new Exception("The numbers < 1");
            res = a + b;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            res = a;
        }
        return res;
    }
}
