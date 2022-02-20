import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    void win(){
        var TicTacToe = new TicTacToe();
        char sign = 'x';
        char[] board = new char[9];
        board[0] = sign;

        board[2] = sign;
        assertFalse(TicTacToe.checkWin(board, sign));

    }
    @Test
    void changinPlayerToO(){
        var TicTacToe = new TicTacToe();

        assertEquals('O', TicTacToe.changePlayer('X'));
    }

}