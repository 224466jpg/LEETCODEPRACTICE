class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int nRows = matrix.length;
        int nCols = matrix[0].length;
        int k = 1;
        int begRow = 0, endRow = nRows-1;
        int begCol = 0, endCol = nCols-1;

        List<Integer> ans = new ArrayList<>();

        int totalEl = nRows * nCols;
        while(k <= totalEl){
            // Fix/Print begRow
            int col = begCol;
            while(k <= totalEl && col <= endCol){
                ans.add(matrix[begRow][col++]);
                k++;
            }
            begRow++;

            // Fix/Print endCol
            int row = begRow;
            while(k <= totalEl && row <= endRow){
                ans.add(matrix[row++][endCol]);
                k++;
            }
            endCol--;

            // Fix/Print endRow
            col = endCol;
            while(k <= totalEl && col >= begCol){
                ans.add(matrix[endRow][col--]);
                k++;
            }
            endRow--;

            // Fix/Print begCol
            row = endRow;
            while(k <= totalEl && row >= begRow){
                ans.add(matrix[row--][begCol]);
                k++;
            }
            begCol++;
        }

        return ans;
    }
}