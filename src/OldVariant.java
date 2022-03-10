public class OldVariant {

    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = CAT;

        switch (animal){
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

    }

}
