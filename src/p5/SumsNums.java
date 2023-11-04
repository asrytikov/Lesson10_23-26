package p5;

public class SumsNums {

    public static int getSumsNums(int a, int b) throws SumsException{
        if (a<1 || b<1) throw new SumsException("The numbers < 1", a, b);
        return a+b;
    }

}

class SumsException extends Exception{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public SumsException(String message, int a, int b) {
        super(message);
        this.a = a;
        this.b = b;
    }
}
