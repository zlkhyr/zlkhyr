import java.util.Scanner;
/**
 * Kelas Test Tabungan untuk mengecek semua kemungakinan kondisi yang akan dihadapi
 *
 * @author Zul Akhyar
 * @version 12.11.2021
 */
public class TestTabungan
{
    static String nama;
    static long rek;
    static double saldo;
    
    /**
     * Method menampilkan pilihan tabungan
     */
    public static void pilih()
    {
        System.out.println("+--Pilih jenis tabungan--+");
        System.out.printf("| 1. Simpanan\t\t |\n");
        System.out.printf("| 2. Junior \t\t |\n");
        System.out.println("+------------------------+");
        
    }
    
    /**
     * Method menampilkan menu
     */
    public static void menu()
    {
        System.out.println("+-----Menu-----+");
        System.out.println("|1. Simpan uang|");
        System.out.println("|2. Tarik uang |");
        System.out.println("|3. Cek saldo  |");
        System.out.println("|4. keluar     |");
        System.out.println("+--------------+");
    }
    
    /**
     * Method meminta data user
     */
    public static void data()
    {
        System.out.println("-----Input Data-----");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Masukkan nama        : ");
        nama = scan.nextLine();
        System.out.printf("Masukkan no rekening : ");
        rek = scan.nextLong();
        System.out.printf("Masukkan saldo awal  : ");
        saldo = scan.nextDouble();
        System.out.println();
    }
    
    /**
     * Method main 
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int pilihan;
        do{
            pilih();
            System.out.printf("Masukkan pilihan : ");
            pilihan = scan.nextInt();
            System.out.println();
        }while(pilihan < 1 || pilihan > 2);
        
        int pilihan2;
        if(pilihan == 1)
        {
            Simpanan s1;
            do{
                    data();
                    s1 = new Simpanan(nama, rek, saldo);
                }while(saldo < 500000);
                
            do{
                menu();
                System.out.printf("Masukkan pilihan : ");
                pilihan2 = scan.nextInt();
                System.out.println();
                
                if(pilihan2 == 1){
                    System.out.printf("Jumlah uang yang akan di simpan : ");
                    double jumlah = scan.nextDouble();
                    s1.SimpanUang(jumlah);
                    System.out.println();
                }else if(pilihan2 == 2){
                    System.out.printf("Jumlah uang yang akan di tarik : ");
                    double jumlah = scan.nextDouble();
                    s1.TarikUang(jumlah);
                    System.out.println();
                }else if(pilihan2 == 3){
                    System.out.println("Saldo : " + s1.getSaldo() + "\n");
                }else if(pilihan2 == 4){
                    break;
                }else{
                    System.out.println("Input salah!!");
                }
            }while(pilihan2 != 4);
        }
        else if(pilihan == 2)
        {
            Junior j1;
            do{
                    data();
                    j1 = new Junior(nama, rek, saldo);
                }while(saldo < 50000);
                
            do{
                menu();
                System.out.printf("Masukkan pilihan : ");
                pilihan2 = scan.nextInt();
                System.out.println();
                
                if(pilihan2 == 1){
                    System.out.printf("Jumlah uang yang akan di simpan : ");
                    double jumlah = scan.nextDouble();
                    j1.SimpanUang(jumlah);
                    System.out.println();
                }else if(pilihan2 == 2){
                    System.out.printf("Jumlah uang yang akan di tarik : ");
                    double jumlah = scan.nextDouble();
                    j1.TarikUang(jumlah);
                    System.out.println();
                }else if(pilihan2 == 3){
                    System.out.println("Saldo : " + j1.getSaldo() + "\n");
                }else if(pilihan2 == 4){
                    break;
                }else{
                    System.out.println("Input salah!!");
                }
            }while(pilihan2 != 4);
        }
    }
}