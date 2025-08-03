import java.util.Scanner;

class Solution1 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Solution1 obj = new Solution1();
        System.out.println("Output: " + obj.toLowerCase(s));
    }
}
