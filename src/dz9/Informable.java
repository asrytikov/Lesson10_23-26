package dz8;

public interface Informable {

    default void infoD(){
        System.out.println("Информации о телефоне на данном этапе нет");
    }
}
