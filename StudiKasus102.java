import java.util.Scanner;

public class StudiKasus102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Harga Per Cup: " + hargaPerCup);
        System.out.print("Enter the number of cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Enter the amount of money: ");
        uangBayar = sc.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if(totalHarga >= 100000){
            diskon = totalHarga * 10 / 100;
        }
            totalBayar = totalHarga - diskon;
        System.out.println("Total price: Rp" + totalHarga);
        System.out.println("Discount: Rp" + diskon);
        System.out.println("Total Payment: Rp" + totalBayar);

        if(uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Change: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Not enough money, short by Rp" + kurang);
        }
        sc.close();
    }
}