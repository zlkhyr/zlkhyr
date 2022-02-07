/**
 * Kelas Junior 
 *
 * @author Zul Akhyar
 * @version 12.11.2021
 */
public class Junior extends Tabungan
{
    private double saldo_awal_minimum = 50000;
    private double saldo_minimum = 10000;
    private double setoran_minimum = 50000;
    private double maks_tarikan_per_hari = 1000000;
    
    /**
     * Konstruktor Junior
     */
    public Junior(String nama, long no_Rekening, double saldo_awal)
    {
        super(nama, no_Rekening);
        super.setSaldo_minimum(saldo_minimum);
        super.setSetoran_minimum(setoran_minimum);
        if(saldo_awal < saldo_awal_minimum){
            System.out.println("Saldo awal minimum untuk junior adalah " + saldo_awal_minimum + "\n");
        }
        else{
            super.setSaldo(saldo_awal);
        }
    }
    
    @Override
    public void TarikUang(double jumlah)
    {
        if(jumlah > maks_tarikan_per_hari){
            System.out.println("Gagal!!..penarikan melebihi minimum yaitu 1 jt");
        }
        else if(jumlah <= maks_tarikan_per_hari){
            super.TarikUang(jumlah); 
        }
    }
}