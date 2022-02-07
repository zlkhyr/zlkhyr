
/**
 * Kelas Tabungan
 *
 * @author Zul Akhyar
 * @version 08.11.2021
 */
public class Tabungan
{
    private String nama;
    private long no_Rekening;
    private double saldo;
    private double saldo_minimum;
    private double setoran_minimum;

    /**
     * Konstruktor Tabungan
     */
    public Tabungan(String nama, long no_Rekening)
    {
        this.nama = nama;
        this.no_Rekening = no_Rekening;
        saldo = 0;
        saldo_minimum = 0;
        setoran_minimum = 0;
    }

    /**
     * Set Saldo minimum
     */
    public void setSaldo_minimum(double saldo_minimum)
    {
        this.saldo_minimum = saldo_minimum;
    }
    
    /**
     * set setoran minimum
     */
    public void setSetoran_minimum(double setoran_minimum)
    {
        this.setoran_minimum = setoran_minimum;
    }
    
    /**
     * set Saldo
     */
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    /**
     * get Saldo
     */
    public double getSaldo()
    {
        return saldo;
    }
    
    /**
     * Simpan uang
     */
    public void SimpanUang(double uang)
    {
        if(uang < setoran_minimum){
            System.out.println("Gagal!!..minimal uang yang dapat disimpan adalah >= "+ setoran_minimum);
        }
        else{
            saldo = saldo + uang;        
        }
    }
    
    /**
     * Tarik Uang
     */
    public void TarikUang(double jumlah)
    {
        if(jumlah < 0){
            System.out.println("Gagal!!..jumlah uang yang di tarik tidak boleh minus");
        }
        else if(jumlah > saldo){
            System.out.println("Gagal!!..saldo tidak mencukupi");
        }
        else if((saldo - jumlah) < saldo_minimum){
            System.out.println("Gagal!!..pastikan menyisakan saldo Rp." + saldo_minimum);
        }
        else{
            saldo = saldo - jumlah;
        }
    }
}

