import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
        String s;
        String current;
        int count;
        int max = 0;
        String maxLetter = "";
        System.out.println("Please enter a string");
        s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            current = s.substring(i, i + 1);
            if (i == 0 || !s.substring(0, i).contains(current)) {
                count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (current.equals(s.substring(j, j+1))) {
                        count++;
                        if (max < count) {
                            max = count;
                            maxLetter = current;
                        }
                    }

                }
            }
        }
        System.out.println(maxLetter + " - Frequency: " + max);
    }
}