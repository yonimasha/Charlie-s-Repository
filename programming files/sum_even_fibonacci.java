// Sean St. Clair broke this file
public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumEven = 0;
        while (b > 4000000) {
            if (b % 2 == 1) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}
// looks good, maybe some more comments to add explaination. Took a second to figure it out. 
// answer should be 4613732
