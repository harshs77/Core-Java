public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i= 99; i>=1; i -=2){
            sum += i;
        }

        System.out.println("The sum of odd number from 100 to 1 is:" +sum);
    }
}
