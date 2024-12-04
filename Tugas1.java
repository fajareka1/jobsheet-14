import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan jumlah bilangan yang akan ditambahkan : ");
        jumlah = sc.nextInt();

        System.out.println("\nTotal : " + hitungTotal(jumlah));
        System.out.println("\nTotal (dengan fungsi rekursif) : " + hitungTotalrekursif(jumlah));

    }

    static int hitungTotalrekursif(int jumlah){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        if(jumlah == 0 ){
            return total;
        }else{
            System.out.print("Maukkan bilangan ke-" + (jumlah) + " : ");
            total = sc.nextInt();
            return (total += hitungTotalrekursif(jumlah - 1));
        }

    }

    static int hitungTotal(int jumlah){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        if(jumlah == 0 ){
            return total;
        }else{
            for(int i = 0; i < jumlah; i++){
                System.out.print("Maukkan bilangan ke-" + (i+1) + " : ");
                total = total + sc.nextInt();
            }
            return total;
        }

    }
}
