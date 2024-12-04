public class Rekursif04 {
    public static void main(String[] args) {
        System.out.println(factorialrekursif(5));
        System.out.println(factorialIteratif(5));
        
    }

    static int factorialrekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialrekursif( n - 1));
        }
    }

    static int factorialIteratif(int n){
        int faktor = 1;
        for (int i = 0; i >= 1; i--){
            faktor = faktor * i;
        }
        return faktor;
    }
}