import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isGameActive = true;
        char sign = 'X';

        char[] board = new char[9];       /*  1 | 2 | 3
                                              4 | 5 | 6
                                              7 | 8 | 9  */
        int count = 1;
        for (int i = 0; i < board.length; i++) {
            if (i > 0 && i % 3 == 0) {
                System.out.println(" |");
            }
            board[i] = ' ';
            System.out.print(" | " + board[i]);
            count++;
        }
        System.out.println(" |");

        game(board, sign);


    }

    public static char[] game(char[] board, char sign) {
        writeOnBoard(board, sign);
        if (!checkWin(board, sign)) {
            game(board, changePlayer(sign));
        }
        return board;
    }

    public static boolean validation(char[] board, int field) {
        if (field < 0 && field > 9 || board[field - 1] != ' ') {
            return false;
        } else {
            return true;
        }
    }

    public static char changePlayer(char sign) {
        if (sign == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

    public static char[] writeOnBoard(char[] board, char sign) {
        Scanner scan = new Scanner(System.in);
        int field = 0;
        System.out.print("Player: " + sign + "'s Turn. Please Choose a field[1-9]");
        field = scan.nextInt();

        if (validation(board, field)) {
            for (int i = 0; i < board.length; i++) {
                if (i > 0 && i % 3 == 0) {
                    System.out.println(" |");
                }
                board[field - 1] = sign;
                System.out.print(" | " + board[i]);
            }
            System.out.println(" |");
            return board;
        } else {
            throw new IllegalArgumentException("no");
        }
    }


    public static boolean checkWin(char[] board, char sign) {
        if (!checkTie(board)) {
            if ((board[0] == sign) && (board[1] == sign) && (board[2] == sign)) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[3] == sign && board[4] == sign && board[5] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[6] == sign && board[7] == sign && board[8] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[0] == sign && board[3] == sign && board[6] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[1] == sign && board[4] == sign && board[7] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[2] == sign && board[5] == sign && board[8] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[0] == sign && board[4] == sign && board[8] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            } else if (board[2] == sign && board[4] == sign && board[6] == sign) {
                System.out.println("Player num " + sign + " is winner!");
                return true;
            }
        }else
        {
            System.out.println("Tie");
            System.exit(0);
            return false;
        }
        return false;
    }

    public static boolean checkTie(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                return false;
            }
        }return true;
    }
}
