class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] checkRow = new boolean[9][9];
        boolean[][] checkCol = new boolean[9][9];
        boolean[][] checkBox = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (checkRow[i][c - '1']) {
                        return false;
                    } else {
                        checkRow[i][c - '1'] = true;
                    }

                    if (checkCol[j][c - '1']) {
                        return false;
                    } else {
                        checkCol[j][c - '1'] = true;
                    }

                    if (checkBox[(i / 3) * 3 + j / 3][c - '1']) {
                        return false;
                    } else {
                        checkBox[(i / 3) * 3 + j / 3][c - '1'] = true;
                    }
                }
            }
        }
        return true;
    }
}
