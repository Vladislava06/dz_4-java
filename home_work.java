import java.util.*;


public class home_work {
        public static void main(String[] args) {
            ArrayList<String> lines = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Введите строку (print, revert, или exit для выхода): ");
                String user_input = scanner.nextLine();

                if (user_input.equals("print")) {
                    Collections.reverse(lines);
                    System.out.println(lines);
                    Collections.reverse(lines);
                } else if (user_input.equals("revert")) {
                    if (lines.size() > 0) {
                        lines.remove(lines.size() - 1);
                    }
                } else if (user_input.equals("exit")) {
                    break;
                } else {
                    lines.add(user_input);
                }
            }

            scanner.close();
        }



}

