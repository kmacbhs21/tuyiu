public class Board {
    int size = 8;
    String[][] grid = new String[size][size];  //make 8x8 2D array of strings


    //constructor initializes the whole
    // grid with 0's when created
    public Board() {

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "0";

            }
        }

    }

    public void makeMove(int row, int col, String token) {

        grid[row][col] = token;  // for Connect-4 you will need to determine the row value
        // based on the existing values in the grid (where does the token "drop" to)
    }

}
