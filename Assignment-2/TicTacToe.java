import java.util.Scanner;

// Tic Tac Toe

class TicTacToe {

    char board[] = new char[9];
    char player1 = 'O';
    char player2 = 'X';

    TicTacToe() {
        for (int i = 48; i < 57; i++)
            board[i - 48] = (char) i;
    }

    void display() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    boolean move(int position, char player) {
        if (board[position] == 'X' || board[position] == 'O') {
            System.out.println("Position already occupied!");
            return false;
        } else {
            board[position] = player;
            return true;
        }
    }

    boolean checkWin() {

        if (board[0] == board[1] && board[1] == board[2])
            return true;
        if (board[3] == board[4] && board[4] == board[5])
            return true;
        if (board[6] == board[7] && board[7] == board[8])
            return true;

        if (board[0] == board[3] && board[3] == board[6])
            return true;
        if (board[1] == board[4] && board[4] == board[7])
            return true;
        if (board[2] == board[5] && board[5] == board[8])
            return true;

        if (board[0] == board[4] && board[4] == board[8])
            return true;
        if (board[2] == board[4] && board[4] == board[6])
            return true;

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        TicTacToe tt = new TicTacToe();

        char currentPlayer = tt.player1;

        while (true) {

            tt.display();

            System.out.print("Player " + currentPlayer + ", Enter position (0-8): ");
            int pos = sc.nextInt();

            if (pos < 0 || pos > 8) {
                System.out.println("Invalid Position");
                continue;
            }

            if (!tt.move(pos, currentPlayer))
                continue;

            if (tt.checkWin()) {
                tt.display();
                System.out.println("Player " + currentPlayer + " Wins!");
                break;
            }

            boolean draw = true;
            for (int i = 0; i < 9; i++) {
                if (tt.board[i] != 'X' && tt.board[i] != 'O') {
                    draw = false;
                    break;
                }
            }

            if (draw) {
                tt.display();
                System.out.println("Match Draw!");
                break;
            }

            if (currentPlayer == tt.player1)
                currentPlayer = tt.player2;
            else
                currentPlayer = tt.player1;
        }

        sc.close();
    }

}