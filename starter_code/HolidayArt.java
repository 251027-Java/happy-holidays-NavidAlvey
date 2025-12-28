import java.util.Random;

/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;

        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }
        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {

        Random rand = new Random(); // create once
    
        // 1. Print the star on top (centered)
        System.out.print(" ".repeat(height));
        System.out.println("*");

        // 2. Loop through each level of branches
        for (int level = 1; level <= height; level++) {
    
            int spaces = height - level;
            int stars = 2 * level + 1;
    
            System.out.print(" ".repeat(spaces));
    
            // Rnadom orniments
            for (int j = 0; j < stars; j++) {
                if (rand.nextInt(4) == 0) {
                    System.out.print(rand.nextBoolean() ? "o" : "O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    
        // 3. Print the trunk (centered)
        System.out.print(" ".repeat(height - 1));
        System.out.println("|||");
    }
}
