
public class Encryption {
    public static void main(String[] args) {
        String text = "if man was meant to stay on the ground god would have given us roots";
        encrypt(text);
    }

    public static void encrypt(String text) {
        // Remove spaces from the text
        String formattedText = text.replaceAll("\\s", "");


        // Calculate the number of rows and columns for the grid
        int length = formattedText.length();
        int rows = (int) Math.floor(Math.sqrt(length));
        int columns = (int) Math.ceil(Math.sqrt(length));

        // Initialize the grid
        char[][] grid = new char[rows][columns];

         //Fill the grid with characters from the formatted text
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < length) {
                    grid[i][j] = formattedText.charAt(index);
                    index++;
                }
            }
        }

        // Print the encrypted text
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 0)
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }


    }
}

