public class _187Multiply2DArray {
    public static void main(String[] args) {
        // 54. Multiply the 2D arrays [[1, 2], [3, 4]] and [[5, 6], [7, 8]].
        int[][] arr1 = { { 1, 2 }, { 3, 4 } };
        int[][] arr2 = { { 5, 6 }, { 7, 8 } };
        int mul = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                mul *= arr1[i][j] * arr2[i][j];
                // System.out.println(mul + " " + i + " " + j);
            }
        }
        System.out.println(mul);
    }
}
