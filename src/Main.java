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
            for (int o = 0; o < 10; o = o + 2) {
                System.out.println(o);
            }
            for (int o = 10; o > 1; o = o - 2) {
                System.out.println(o);
            }
            for (int o = 0; o < 17; o = o + 2) {
                System.out.println(o);
            }
            for (int o = 10; o > -10; o = o - 2) {
                System.out.println(o);
            }
            for (int o = 1904; o < 2096; o = o + 4) {
                System.out.println("Високосный год" + o);
            }
            for (int o = 7; o < 105; o = o + 7) {
                System.out.println(o);
            }
            for (int o = 1; o < 1024; o = o * 2) {
                System.out.println(o);
            }
            int salary = 29000;
            int total = 0;
            for (int o = 0; o < 12; o++) {
                total = total + salary;
                System.out.println(total);
            }
            int salary1 = 29000;
            int total1 = 0;
            for (int o = 0; o < 12; o++) {
                total1 = total1 + total1/ 100;
                total1 = total1 + salary1;
                System.out.println("Месяц "  + o +  " Итого " +  total1);
            }
            System.out.println(total1);

            for (int o = 1; o <= 10; o ++){
                int result = 2 * o;
                System.out.println("2 * " + o + " = " + result);
            }
        }
    }
}


