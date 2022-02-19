public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // array of integers with size 5 (empty (0 actually) for this moment)
        System.out.println(numbers[3]);  // 0

        // element-wise assignment
        numbers[0] = 10;
        numbers[1] = 20;
        // ...

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        0
//        10
//        20
//        30
//        40

        // init whole array at once
        int[] numbers1 = {1, 2, 3};

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
//        1
//        2
//        3
    }
}
