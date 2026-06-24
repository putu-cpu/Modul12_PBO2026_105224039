import java.util.ArrayList;
import java.util.List;
//S
public class KeretaRepository {
    private final List<KeretaApi> daftarKereta = new ArrayList<>();

    public KeretaRepository() {
        daftarKereta.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public List<KeretaApi> getAllKereta() {
        return daftarKereta;
    }

    public KeretaApi findByKode(String kode) {
        for (KeretaApi kereta : daftarKereta) {
            if (kereta.getKode().equalsIgnoreCase(kode)) {
                return kereta;
            }
        }
        return null;
    }
}
