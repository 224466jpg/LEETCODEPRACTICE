class Solution {
    public static void swap(int[][] matrix, int row , int col){
        int temp = matrix[row][col];
        matrix[row ][col]= matrix[col][row];
        matrix[col][row]= temp;
    }
    public static void swap(int[][] matrix, int row , int beg , int en){
        int temp = matrix[row][beg];
        matrix[row][beg] = matrix [row][en];
        matrix [row][en] = temp;

    }
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        //transpose
        for(int row = 0; row <n;row++){
            for(int col = 0; col<row; col++){
                swap(matrix , row , col);

            }
        }





        //mirror le lenge

        for(int row = 0; row<n; row ++){
            int beg = 0;
            int en = n-1;
            
            while(beg<en){
                swap(matrix , row, beg++, en --);
            }
            }
            return;
    }
}