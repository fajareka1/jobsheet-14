import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung :");
        bilangan = sc.nextInt();
        System.out.print("Pangkat :");
        pangkat = sc.nextInt();


        System.out.print("\nDeret perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }

    static int hitungPangkat(int x, int y){
        if(y == 0){
            System.out.print("1");
            return 1;
        }else{
            System.out.print(x + " x ");
            return (x * hitungPangkat(x, (y - 1)));
        }
    }
}
