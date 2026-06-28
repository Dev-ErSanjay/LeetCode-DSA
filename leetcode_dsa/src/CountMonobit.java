public class CountMonobit {

    public static int countMonobit(int n) {

        int count = 1;
        int currentMonobit = 1;

        while (currentMonobit <= n) {
            count++;
            currentMonobit = (currentMonobit << 1) | 1;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countMonobit(4));
    }

}
