package nyc.c4q.jvvlives2005;

/**
 * Joshelyn Vivas
 *
 * Divisor Pattern Art:
 *
 * Print a table of size NxN where an entry (i, j) is:

 @ @ character + 1 space character if i divides j or j divides i

 Two empty space characters, otherwise
 *
 * Created by c4q-joshelynvivas on 3/21/15.
 */
public class DivisorPatternArt {

    public static void main(String[] args) {
        int gridSize = 5;
        grid(gridSize);
    }

    //Easier way to produce the grid
    public static void print(String at) {
        System.out.print(at);
    }

    public static String art (int i, int j) {
        if (i % j == 0 || j % i == 0) {          //give "@" if i divides j or j divides i
            return "@ ";
        } else {                                 //else, give 2 spaces
            return "  ";
        }
    }

    public static void grid (int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                print(art(i,j));
            }
            print("\n");
        }
    }
}

