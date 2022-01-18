package FindMaximum;

/**
 * Given 3 int paremeters in the method findMaximum, implement the method to find the maximum value of the 3 without doing the following:
 * <ul>
 *  <li>declating a variable(s)
 *  <li>utilizing more than 2 if statements
 *  <li>utilizing more than 1 return 
 *  <li>utilizing methods from other classes or packages
 * </ul>
 * Below is an example of an inefficient answer:
 * if (a > b) {
 *      if (a > c) {
 *          return a;
 *      } else {
 *          return c;
 *      }
 * } else {
 *      if (b > c) {
 *          return b;
 *      } else {
 *          return c;
 *      }
 * }
 * <ul>
 *  <li>findMaximum(1, 2, 3) → 3
 *  <li>findMaximum(6, 4, 5) → 6
 *  <li>findMaximum(7, 9, 8) → 9
 *  <li>findMaximum(10, 10, 10) → 10
 * </ul>
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class FindMaximumIteration2 {
    public static void main(String[] args) {
        if(args.length > 1){
            /*
                We will work with this in iteration 3
            */
        }else{
            /*
                Let's ask the user to enter some numbers here.
            */

            if(true /* If the user gives us numbers */ ){

            }else{
                /* Demo output if user doesn't enter any numbers */

                System.out.println("Maximum of 1, 2, 3 is " + findMaximum(1, 2, 3));
                System.out.println("Maximum of 6, 4, 5 is " + findMaximum(6, 4, 5));
                System.out.println("Maximum of 7, 9, 8 is " + findMaximum(7, 9, 8));
                System.out.println("Maximum of 10, 10, 10 is " + findMaximum(10, 10, 10));
            }
        }
    }

    /**
     * Given 3 int paremeters in the method findMaximum, find the maximum value of the 3.
     * 
     * @param a integer value inputted to be compared with b and c
     * @param b integer value inputted to be compared with a and c
     * @param c integer value inputted to be compared with a and b
     * @return int value that is the maximum of the three parameters
     * @since 0.0.1
     */
    public static int findMaximum(int a, int b, int c) {
        if (a > b) {
            b = a;
        }
        if (c > b) {
            b = c;
        }
        return b;
    }
}
