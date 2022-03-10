import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case DOG:
                System.out.println("It is dog");
                break;
            case CAT:
                System.out.println("It is cat");
                break;
            case FROG:
                System.out.println("It is frog");
                break;
            default:
                System.out.println("Not an animal");
        }

        Season season = Season.SUMMER;
        System.out.println(season instanceof Season); // true;
        System.out.println(season instanceof Enum); // true;
        System.out.println(season instanceof Object); // true;
        System.out.println(season.getClass()); // class Season;

        ////////// after adding constructor to Animal enum (+ adding translations)
        System.out.println(animal.getTranslation()); // Кіт

        System.out.println(animal); // Translation to Ukrainian is Kіт  // toString() result
        System.out.println(Arrays.toString(Animal.values())); // [Translation to Ukrainian is Собака, Translation to Ukrainian is Kіт, Translation to Ukrainian is Жаба]
        System.out.println(animal.name()); // CAT  // variable name
        System.out.println(animal.ordinal()); // 1  // index of chosen enum in Animal



    }
}
