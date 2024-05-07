import java.util.ArrayList;
import java.util.List;

public class Kontrollzentrum {
    private List<Auftrag> auftraege;

    public Kontrollzentrum() {
        this.auftraege = new ArrayList<>();
    }

    public void auftragErstellen(Auftrag auftrag) {
        auftraege.add(auftrag);
    }

    public void auftragAufgeben(Auftrag auftrag, Lager lager) {
        lager.kwBeladen(auftrag);
        auftrag.setStatus(Auftragsstatus.AuftragEingegangen);
    }

    public void auftragLoeschen(Auftrag auftrag) {
        auftraege.remove(auftrag);
    }

    public List<Auftrag> getAuftraege() {
        return auftraege;
    }
}
