package InterviewCoding;

public class RotateImage {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		matrix = rotate(matrix);
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public static int[][] rotate(int[][] matrix) {
        int level = 0;
        int last = matrix.length - 1;
        while(level < matrix.length / 2){
            for(int i = level ;i < last;i++){
                swap(matrix[level][i],matrix[i][last]);
                swap(matrix[level][i],matrix[last][last - i + level]);
                swap(matrix[level][i],matrix[last - i + level][level]);
            }
            level++;
            last--;
        }
        return matrix;
    }

}
