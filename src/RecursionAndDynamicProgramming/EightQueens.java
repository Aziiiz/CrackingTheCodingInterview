package RecursionAndDynamicProgramming;

import java.util.*;

public class EightQueens {
    List<List<String>> list;
    Set<Integer> col;
    Set<Integer> posDiagonal;
    Set<Integer> negDiagonal;
    int num;
    char[][] board;

    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        list = new ArrayList<>();
        col = new HashSet<>();
        posDiagonal = new HashSet<>();
        negDiagonal = new HashSet<>();
        num = n;

        for(int i=0; i<board.length; i++) {
            Arrays.fill(board[i], '.');
        }

        backtracking(0);

        return list;
    }

    private void backtracking(int r) {
        if(r == num) {
            list.add(boardToString(board));
            return;
        }


        for(int i=0; i<num; i++) {
            if(col.contains(i)
                    || posDiagonal.contains(r+i)
                    || negDiagonal.contains(r-i)) continue;

            col.add(i);
            posDiagonal.add(r+i);
            negDiagonal.add(r-i);
            board[r][i] = 'Q';

            backtracking(r+1);

            col.remove(i);
            posDiagonal.remove(r+i);
            negDiagonal.remove(r-i);
            board[r][i] = '.';

        }
    }

    private List<String> boardToString(char[][] board) {
        List<String> temp = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            temp.add(String.valueOf(board[i]));
        }
        return temp;
    }
}
