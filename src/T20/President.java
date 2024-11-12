package T20;

public class President {
    public static void main(String[] args) {
        int noOfStds = 5;
        int lengthOfSongs = 9;
        int president = findPresident(noOfStds, lengthOfSongs);
        System.out.println("President is student number: " + president);
    }

    static int findPresident(int n, int k) {
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }

        return result + 1;
    }
}

