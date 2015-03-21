package nyc.c4q.jvvlives2005;

/**A Pretty Title

 Write a program that calls a method printTitle that prints a phrase as a title by,

 converting it to title capitalization
 underlining each word, i.e. underlying all characters except spaces
 For example,

 printTitle("a tale of two cities", '*')
 produces

 A Tale of Two Cities
 * **** ** *** ******
 *
 * Created by c4q-joshelynvivas on 3/21/15.
 */
import java.util.Scanner;
public class APrettyTitle {
    public static String capitalizeString(String string) { // Capitalizing the first letter
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static String underline(String title, char symbol) {  //How to make the underlines
        String underline = "\n";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ')
                underline += ' ';
            else
                underline += symbol;
        }
        return title + underline;
    }
    public static String printTitle(String title, char symbol) {    // Gives capitalized letter and underline

        return underline(capitalizeString(title), symbol);
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String title;

        System.out.println("Provide me a title.");
        title = input.nextLine();
        System.out.println(printTitle(title, '*'));


    }
}
