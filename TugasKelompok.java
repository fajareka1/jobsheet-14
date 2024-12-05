import java.util.Scanner;
public class TugasKelompok {
    static int[][] dataMahasiswa = new int[100][100];
    static int[] nim = new int[100];
    static int[] totalSks = new int[100];
    static String[] nama = new String[100];
    static String[][] arrkode = new String[100][100];
    static String[][] arrmatkul = new String[100][100];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0;
        // Menu
        while (true) {
            menu();
            System.out.print("Pilih menu : ");
            int pilihan = input.nextInt();
    
            if(pilihan == 1){
                tambahData(index);
                index++;
            }else if(pilihan == 2){
                tampilData();
            }else if(pilihan == 3){
                analisisData();
            }else if(pilihan == 4){
                System.out.println("Terimakasih !!!!");
                break;
            }
        }

    }

    static void menu(){
        System.out.println("\n=== Sistem pemantauan KRS Mahasiswa");
        System.out.println("1. Tambah Data KRS");
        System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
        System.out.println("3. Analisis Data KRS");
        System.out.println("4. Keluar");
    }
    static void tambahData(int index){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String lanjut;
        int jmlSks = 0, sksTotal = 0;

        System.out.println("--- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa : ");
        String inpnama = input.nextLine();
        System.out.print("NIM : ");
        int inpnim = input2.nextInt();
        nim[index] = inpnim;
        nama[index] = inpnama;
        while (true) {
            System.out.print("Kode Mata Kuliah : ");
            String kode = input.nextLine();
            System.out.print("Nama Mata Kuliah : ");
            String matkul = input.nextLine();
            System.out.print("Jumlah SKS (1-3) : ");
            int sks = input2.nextInt();
            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid.");
                continue;
            }
            sksTotal += sks;
            if(sksTotal > 24){
                System.out.println("Jumlah SKS tidak boleh lebih dari 24.");
                continue;
            }
            System.out.println("Data mata kuliah berhasil ditambahkan. ");
            System.out.print("Tambah mata kuliah lain (y/n) : ");
            lanjut = input.nextLine();
            arrkode[index][jmlSks] = kode;
            arrmatkul[index][jmlSks] = matkul;
            dataMahasiswa[index][jmlSks] = sks;
            jmlSks++;
            if(lanjut.equalsIgnoreCase("n")){
                System.out.println("Total SKS yang diambil: " + sksTotal);
                break;
            }
        }
        totalSks[index] = sksTotal;
    }



    static void tampilData(){
        int index = 0, search;
        Scanner input = new Scanner(System.in);
        System.out.print("NIM : ");
        search = input.nextInt();
        System.out.println("\nDaftar KRS : ");

        for(int a = 0; a < nim.length; a++){
            if(nim[a] == search){
                index = a;
            }
        }

        System.out.println("NIM\tNAMA\tKODE\tMATKUL\tSKS");
        for(int i = 0; i < dataMahasiswa[0].length; i++){
            if(dataMahasiswa[index][i] != 0){
                System.out.print(nim[index] + "\t" + nama[index] + "\t" + arrkode[index][i]  + "\t" + arrmatkul[index][i] + "\t" +  dataMahasiswa[index][i]);
                System.out.println();
            }
        }


    }


    static void analisisData(){
        int banyak = 0;
        for(int i = 0; i < totalSks.length; i++){
            if(totalSks[i] < 20 && totalSks[i] != 0){
                banyak += 1;
            }
        }

        System.out.println("Banyak Mahasiswa yang Memiliki total SKS kurang dari 20 : " + banyak);
    }
}