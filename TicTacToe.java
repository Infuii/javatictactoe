import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        int count = 0;
        board(board);
        checkWinner(board);
        while(count < 5) {
            turn(board, count);
            checkWinner(board);
            count++;
            System.out.println(count);
        }
    }
    static void checkWinner(String[] board) {
        for(int i = 0; i < 8; i++) {
            switch(i) {
                case 1:
                    if(board[0] == "X" && board[1] == "X" && board[2] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[0] == "O" && board[1] == "O" && board[2] == "O") {
                        System.out.println("O WINS");
                    }
                case 2:
                    if(board[3] == "X" && board[4] == "X" && board[5] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[3] == "O" && board[4] == "O" && board[5] == "O") {
                        System.out.println("O WINS");
                    }
                    break;
                case 3:
                    if(board[6] == "X" && board[7] == "X" && board[8] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[6] == "O" && board[7] == "O" && board[8] == "O") {
                        System.out.println("O WINS");
                    }
                case 4:
                    if(board[0] == "X" && board[3] == "X" && board[6] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[0] == "O" && board[3] == "O" && board[6] == "O") {
                        System.out.println("O WINS");
                    }
                case 5:
                    if(board[1] == "X" && board[4] == "X" && board[7] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[1] == "O" && board[4] == "O" && board[7] == "O") {
                        System.out.println("O WINS");
                    }
                case 6:
                    if(board[2] == "X" && board[5] == "X" && board[8] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[2] == "O" && board[5] == "O" && board[8] == "O") {
                        System.out.println("O WINS");
                    }
                case 7:
                    if(board[0] == "X" && board[4] == "X" && board[8] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[0] == "O" && board[4] == "O" && board[8] == "O") {
                        System.out.println("O WINS");
                    }
                case 8:
                    if(board[2] == "X" && board[4] == "X" && board[6] == "X") {
                        System.out.println("X WINS");
                    }
                    else if(board[2] == "O" && board[4] == "O" && board[6] == "O") {
                        System.out.println("O WINS");
                    }
                case 9:
                    System.out.println("TIE GAME");
                break;
            }
        }
        
    }
        public static void turn(String[] board, int count) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 9 to play: (YOU ARE X)");

            //take user input
            int position = scanner.nextInt();
            // make an int variable with a random number between 1 and 9
            int computerPosition = (int) (Math.random() * 9) + 1;
            // while the computer position is the same as the user position or the computer position is already taken, generate a new random number 
                
            while (computerPosition == position || board[position - 1] == "X" || board[position - 1] == "O") {
                computerPosition = (int) (Math.random() * 9) + 1;
                if(computerPosition == position || board[position - 1] == "X" || board[position - 1] == "O") {
                    computerPosition = (int) (Math.random() * 9) + 1;
                }
            }
            

            System.out.println("Computer chose position " + computerPosition);
            System.out.println("You chose position " + position);

            board[position - 1] = "X";
            board[computerPosition - 1] = "O";

            System.out.println("\n CURRENT BOARD: \n");
            count++;
            board(board);
            if(count == 9) {
                System.out.println("TIE GAME");
                scanner.close();
            }
           
        }
    public static void board(String[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
}
