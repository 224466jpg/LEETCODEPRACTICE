class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix[0].length;
        int m = matrix.length;
        int i = 0; 
        int j = n-1;
        while(j>=0&& i<m){
            if(matrix[i][j]<target){
                i++;

            }
            
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                 return true;
            }
        }
        return false;
    }
}