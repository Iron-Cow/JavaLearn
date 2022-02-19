public class MultidimensionalArray {
    public static void main(String[] args) {
        /**
         * array vs matrix:
         * 1 2 3
         *
         * vs
         *
         * 1 2 3
         * 3 4 5
         * 5 6 7
         * */

        int[] numbers = {1, 2, 3}; // one dimensional array
        System.out.println(numbers[2]); // number[el_idx] 3

        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5},
                {5, 6, 7}
        }; // multi (2) dimensional array/table/matrix
        System.out.println(matrix[1][2]); // matrix[row_idx][el_idx] // 5

        for(int i = 0; i < matrix.length; i++){ // rows
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        Output:
//
//        1 2 3
//        3 4 5
//        5 6 7


        // size of each row in matrix can be different
        // we also can predefine array sizes:
        String[][] strings = new String[2][3]; // 2 rows with 3 elements in each row
        System.out.println(strings[0][2]); // null

    }
}
