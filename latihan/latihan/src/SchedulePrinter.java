import java.util.List; 
//S
public class SchedulePrinter {
    public void printJadwal(List<KeretaApi> daftarKereta) {
        System.out.println("\n===== JADWAL KERETA =====");
        for (KeretaApi kereta : daftarKereta) {
            System.out.println(kereta);
        }
    }
}