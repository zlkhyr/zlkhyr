
/**
 * Kelas Simpanan
 *
 * @author Zul Akhyar
 * @version 12.11.2021
 */
public class Simpanan extends Tabungan
{
    private double saldo_awal_minimum = 500000;
    private double saldo_minimum = 10000;
    private double setoran_minimum = 50000;
    
    /**
     * Konstruktor Simpanan
     */
    public Simpanan(String nama, long no_Rekening, double saldo_awal)
    {
        super(nama, no_Rekening);
        super.setSaldo_minimum(saldo_minimum);
        super.setSetoran_minimum(setoran_minimum);   
        if(saldo_awal < saldo_awal_minimum){
            System.out.println("Saldo awal minimum untuk simpanan adalah 500.000" + "\n");
        }
        else if(saldo_awal >= saldo_awal_minimum){
            super.setSaldo(saldo_awal);
        }
    }
    
    
}
