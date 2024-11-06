public class ThotoFi {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 999; i >= 500; i -= 2) {
            sum += i;
        }
        System.out.println("The sum of odd numbers from 1000 to 500 is: " + sum);
    }
}
