import java.util.Scanner;

public class Main {

    static String verdict;
    static int inp;

    static void answer (String result) {
        System.out.println("Похоже, "+ inp + " - " + result +  " число.");
    }

    static boolean calc (int vol) {
        return vol%2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Введите ваше число:");
        Scanner myInput = new Scanner(System.in);
        inp = myInput.nextInt();

        if (inp==0){
            System.out.println("Ох, нет! Да у вас же... НОЛЬ!");

        } else {
            if (calc(inp)) {
                verdict = ("четное");
            } else {
                verdict = ("нечетное");
            }

            answer(verdict);
        }
    }

}