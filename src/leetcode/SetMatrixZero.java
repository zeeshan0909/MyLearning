package leetcode;

class SetZero {
	public void setZeroes(int[][] matrix) {
		int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] copy = new int[rows][cols];
        
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

		System.out.println("this is your ans start");
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    
                    for (int k = 0; k < cols; k++) {
                    	copy[i][k] = 0;
                    }
                    for (int k = 0; k < rows; k++) {
                    	copy[k][j] = 0;
                    }
                }
            }
        }
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		

	}
}

public class SetMatrixZero {
	public static void main(String[] args) {
		SetZero setZero = new SetZero();
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
		setZero.setZeroes(matrix);
	}

}
