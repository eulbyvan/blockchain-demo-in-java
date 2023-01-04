import java.util.Arrays;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 05/01/2023
 */

public class Main {
    /**
     * Hash = digital signature
     * Each block will have:
            List of transactions
            Previous hash

            Hash
     */
    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c"};
        String[] list2 = {"a", "b", "c"};

        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
    }
}
