package dz8;
/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
Informable c default методом info() с default реализацией,
применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */

public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        phone.receiveCall("Misha");
        phone.info();
        //phone.receiveCall();
        phone.infoD();
    }
}