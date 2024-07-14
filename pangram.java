import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        Thread thread = new Thread(() -> {
            try {
                step();
                if (isPangram(s1)) {
                    System.out.println("Pangram");
                } else {
                    System.out.println("Not a Pangram");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        s.close();
    }
    public static boolean isPangram(String str) {
        boolean[] arr = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            } else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else {
                continue;
            }
            arr[index] = true;
        }
        for (boolean b : arr) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
    public static void step() throws InterruptedException {
        Thread.sleep(200);
    }
}