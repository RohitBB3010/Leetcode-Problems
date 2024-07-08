import java.util.HashMap;

public class validSoduko {

    public boolean isValidSudoku(char[][] board){
        int current_grid = 1;

        //Checking each column for repetition
        for(int i = 0; i < 9; i++){
            int j = 0;
            HashMap<Character, Integer> checkMap = new HashMap<>();

            while(j < 9){

                if(checkMap.containsKey(board[i][j]) && board[i][j] != '.'){

                    return false;
                } else{
                    checkMap.put(board[i][j], 1);
                }
                j++;
            }
        }

        //checking row for repetition
        for(int i = 0; i < 9; i++){
            int j = 0;
            HashMap<Character, Integer> checkMap = new HashMap<>();
            while(j < 9){
                if(checkMap.containsKey(board[j][i]) && board[j][i] != '.'){

                    return false;
                } else{
                    checkMap.put(board[j][i], 1);
                }
                j++;
            }
        }

        //checking first 3 grids
        for(int i = 0; i < 9; i++){
            if(current_grid % 3 == 1){
                HashMap<Character, Integer> checkMap = new HashMap<>();
                for(int j = 0; j < 3; j++){
                    for(int k = setYStart(current_grid); k < setYStart(current_grid)+3;k++){
                        if(checkMap.containsKey(board[j][k]) && board[j][k] != '.'){

                            return false;
                        } else{
                            checkMap.put(board[j][k], 1);
                        }
                    }
                }
                current_grid++;
            } else if (current_grid % 3 == 2) {
                HashMap<Character, Integer> checkMap = new HashMap<>();
                for(int j = 3; j < 6; j++){
                    for(int k = setYStart(current_grid); k < setYStart(current_grid)+3;k++){
                        if(checkMap.containsKey(board[j][k]) && board[j][k] != '.'){

                            return false;
                        } else{
                            checkMap.put(board[j][k], 1);
                        }
                    }
                }
                current_grid++;
            } else{
                HashMap<Character, Integer> checkMap = new HashMap<>();
                for(int j = 6; j < 9; j++){
                    for(int k = setYStart(current_grid); k < setYStart(current_grid)+3;k++){
                        if(checkMap.containsKey(board[j][k]) && board[j][k] != '.'){

                            return false;
                        } else{
                            checkMap.put(board[j][k], 1);
                        }
                    }
                }
                current_grid++;
            }

        }


        return true;
    }

    public static int setYStart(int currentGrid){
        if(currentGrid <= 3) {
            return 0;
        } else if (currentGrid <= 6) {
            return 3;
        } else{
            return 6;
        }
    }

    public static void main(String[] args){

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board2 = {
                {'.', '.', '.', '1', '.', '8', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '7', '.', '.', '8', '4', '1'},
                {'.', '.', '.', '.', '7', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '6', '.', '.'},
                {'.', '.', '.', '6', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        validSoduko instance = new validSoduko();

        System.out.println(instance.isValidSudoku(board2));
    }
}

