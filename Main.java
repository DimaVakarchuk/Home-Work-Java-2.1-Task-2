public class Main {
    public static void main(String[] args) {
        int openingBalance = 500;
        int newBalance = 1001;
        int finalBonus = 0;
        if (newBalance > 1000) {
            finalBonus = newBalance / 100;
        }
        System.out.println("Общий балланс с учетом бонусов: " + (openingBalance + newBalance + finalBonus));
        System.out.println("Начисленный бонус: " + finalBonus);
    }

}
