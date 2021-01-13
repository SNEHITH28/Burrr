package InterviewCoding;

public class ValidSuduko {

	public static void main(String[] args) {
		
		char[][] board = {
						{'8','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'},
						{'.','9','.','.','.','.','.','6','.'},
						{'.','.','.','.','6','.','.','.','3'},
						{'4','.','.','8','.','3','.','.','1'},
						{'7','.','.','.','2','.','.','.','6'},
						{'.','6','.','.','.','.','2','8','.'},
						{'.','.','.','4','1','9','.','.','5'},
						{'.','.','.','.','8','.','.','7','9'}
					};
		
		if(validRows(board) && validColums(board) && validGrid(board)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

	private static boolean validGrid(char[][] board) {
		for(int row = 0;row < 3;row++) {
			for(int col = 0;col < 3;col++) {
				int[] count = new int[9];
				for(int i = row * 3;i < row * 3 + 3;i++) {
					for(int j = col * 3;j < col * 3 + 3;j++) {
						if(board[i][j] != '.') {
							if(count[board[i][j] - '1'] == 0) {
								count[board[i][j] - '1']++;
							}
							else{
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	private static boolean validColums(char[][] board) {
		for(int i = 0;i < 9;i++) {
			int[] count = new int[9];
			for(int j = 0;j < 9;j++) {
				if(board[j][i] != '.') {
					if(count[board[j][i] - '1'] == 0) {
						count[board[j][i] - '1']++;
					}
					else{
						return false;
					}
				}
			}
		}
		return true;
	}

	private static boolean validRows(char[][] board) {
		for(int i = 0;i < 9;i++) {
			int[] count = new int[9];
			for(int j = 0;j < 9;j++) {
				if(board[i][j] != '.') {
					if(count[board[i][j] - '1'] == 0) {
						count[board[i][j] - '1']++;
					}
					else{
						return false;
					}
				}
			}
		}
		return true;
	}
}
