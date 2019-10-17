package if1.pkg10118006.latihan36.objectoriented.targetsaldotabungan;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class IF110118006Latihan36ObjectOrientedTargetSaldoTabungan {

    public static void main(String[] args) {
        
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);

    }
    
}
