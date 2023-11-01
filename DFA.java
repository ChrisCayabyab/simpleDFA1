import java.util.Scanner;

public class DFA
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean rerun=true;
        while (rerun) {
            String state = "q0";
            System.out.print("Enter String: ");
            String input = sc.nextLine();

            for (int x = 0; x < input.length(); x++) {
                if (state.equals("q0") && input.charAt(x) == '0') {

                    state = "q1";
                } else if (state.equals("q0") && input.charAt(x) == '1') {

                    state = "q0";
                } else if (state.equals("q1") && input.charAt(x) == '0') {

                    state = "q1";
                } else if (state.equals("q1") && input.charAt(x) == '1') {

                    state = "q2";
                } else if (state.equals("q2") && input.charAt(x) == '0') {

                    state = "q1";
                } else if (state.equals("q2") && input.charAt(x) == '1') {

                    state = "q0";
                } else {
                    System.out.println("Invalid input.. Exiting automaton");
                }

            }
            if (state.equals("q2")) {
                System.out.println("String accepted");
            } else {
                System.out.println("String not accepted");
            }
            System.out.print("\nTry another one?[y][n]: ");
            String again=sc.nextLine();
            if(again.equalsIgnoreCase("n"))
            {
                rerun=false;
                System.out.println("\nBy Chris Daniel B. Cayabyab");
            }
        }
    }
}