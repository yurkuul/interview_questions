import java.util.Scanner;

/**
 * Recursively reverse a String that traverses in a forward order.
 * 
 * <ul>
 *  <li>recursiveReverse("Test") -> tseT
 * </ul>
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RecursiveReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a phrase or word: ");
        String word = s.nextLine();
        System.out.println(recursiveReverse(word));
    }

    /**
     * Recursively reverse a String that traverses in a forward order.
     * 
     * @param str The String to reverse.
     * @return 'str' in reverse order.
     * @since 0.0.1
     */
    public static String recursiveReverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        return recursiveReverse(str.substring(1))
                 + recursiveReverse(str.substring(0, 1));
    }
}
