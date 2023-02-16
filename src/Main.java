public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int addent = 1100;

        int bonus = 0;
        if (addent > 1000) {
            bonus = addent / 100;
        }

        int finalAccount = initialAccount + addent + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}