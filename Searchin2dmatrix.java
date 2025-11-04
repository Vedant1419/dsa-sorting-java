// leetcdoe 240 search in a 2D matrix II
class Searchin2dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; //row
        int m = matrix[0].length; // coloumn
        int i = 0;     // row travel
        int j = m - 1; // coloumn travel
        
        while(i<n && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] < target){
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}