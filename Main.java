public class Main {
    public static void main(String[] args) {
        boolean positiveBalance = true;
        int openingBalance = 500;
        int newBalance = 2500;
        int bonus = 2500 / 100;
        if (newBalance > 1000) {
            bonus = newBalance / 100;
        }

        System.out.println("Общий балланс с учетом бонусов: " + (openingBalance + newBalance + bonus));
        System.out.println("Начисленный бонус: " + bonus);
    }
}