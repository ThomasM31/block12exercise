package exercises.ex2arrays;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Arrays {

    public static final Scanner input = new Scanner(in);

    /* The input functions */
    public static int[] getArrayOfIntsFromUser() {
        Scanner input = new Scanner(in);
        String input_as_string = input.nextLine();

        String[] the_int_strs = input_as_string.split(" ");
        int[] the_ints = new int[5];

        for (int i = 0; i < the_int_strs.length; i++) {
            int n = Integer.parseInt(the_int_strs[i]);
            the_ints[i] = n;
        }
        return the_ints;
    }

    public static int getValueFromUser() {
        Scanner value = new Scanner(in);
        int val = value.nextInt();
        out.println("Input a value to find > ");

        return val;
    }

    /* The output functions */
    public static void printIndexToUser(int the_index, int the_value) {
        out.println("Value " + the_value + " is at index " + the_index);
    }

    public static void printNotFoundToUser(int the_value) {
        out.println("Value " + the_value + "was not found");
    }

    public static void printResultToUser(int the_index, int the_value) {
        // TODO vaaaaaaaa?? kolla mot None??
        if (the_index == 0) {
            printNotFoundToUser(the_value);
        }
        else {
            printIndexToUser(the_index,the_value);
        }
    }

    /* The Algorithm */
    public static int findIndexOfValue(int[] a_list, int a_value) {
        int size = a_list.length;

        for (int i = 0; i < size; i++) {
            int indexValue = a_list[i];
            if (a_value == indexValue) {
                return i;
            }
        }
        return 0;
    }

    /* The top-level behavior */
    public static void listBasicsProgram() {
        // INPUT
        int[] theList = getArrayOfIntsFromUser();
        int theValue = getValueFromUser();
        // PROCESS
        int theIndex = findIndexOfValue(theList, theValue);
        // OUTPUT
        printResultToUser(theIndex, theValue);
    }


    /* Required way to make module executable */
    public static void main(String[] args) {

        listBasicsProgram();
    }
}
