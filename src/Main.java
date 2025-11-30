//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            for (int o = 0; o < 10; o++) {
                System.out.println(o);
            }
            for (int o = 10; o > 0; o--) {
                System.out.println(o);
            }
            for (int o = 0; o < 17; o = o + 2) {
                System.out.println(o);
            }
            for (int o = 10; o > -10; o--) {
                System.out.println(o);
            }
            for (int o = 1904; o < 2096; o = o + 4) {
                System.out.println("Високосный год " + o);
            }
            for (int o = 7; o <= 98; o = o + 7) {
                System.out.println(o);
            }
            for (int o = 1; o <= 512; o = o * 2) {
                System.out.println(o);
            }
            int salary = 29000;
            int total = 0;
            for (int o = 1; o < 12; o++) {
                total = total + salary;
                System.out.println("Месяц " + o + " сумма накоплений ровна  " + total + " рублей");
            }
            int cash = 29000;
            double total1 = 0;
            double annualInterestRate = 0.12;
            double monthlyInterestRate = annualInterestRate / 12;
            for (int o=1; o <=12; o++){
                total1 += cash;
                total1+= total1 * monthlyInterestRate;
                System.out.println("Месяц " + o + " Итого " + Math.round(total1) + "рублей");
            }

            for (int o = 1; o <= 10; o++) {
                int result = 2 * o;
                System.out.println("2 * " + o + " = " + result);
            }
        }
    }
}



