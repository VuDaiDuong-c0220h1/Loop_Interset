import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double intersetRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay:");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng cho vay:");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất vay (%):");
        intersetRate = sc.nextDouble();
        double totalInterset = 0;
        for (int i =0; i < month; i++){
            totalInterset = money * (intersetRate/100)/12;
            money += totalInterset;
        }
        System.out.println("Tổng tiền gốc và lãi vay là: " + money);

    }
}
