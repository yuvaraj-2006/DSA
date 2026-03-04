class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 1) {
                    boolean isSpecial = true;
                    for (int col = 0; col < mat[0].length; col++) {
                        if (col != j && mat[i][col] == 1) {
                            isSpecial = false;
                            break;
                        }
                    }

                    for (int row = 0; row < mat.length && isSpecial; row++) {
                        if (row != i && mat[row][j] == 1) {
                            isSpecial = false;
                        }
                    }

                    if (isSpecial) count++;
                }
            }
        }

        return count;
    }
}