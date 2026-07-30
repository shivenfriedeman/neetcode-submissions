class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target, 0, matrix.length * matrix[0].length);
    }

    private boolean search(int[][] matrix, int target, int lo, int hi){
        if(lo >= hi){
            return false;
        }
        int mid = (hi + lo) / 2;
        int val = matrix[mid / matrix[0].length][mid % matrix[0].length];
        if(val == target){
            return true;
        }
        if(target < val){
            return search(matrix, target, lo, mid);
        } else {
            return search(matrix, target, mid + 1, hi);
        }
    }
}
