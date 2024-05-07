import java.util.ArrayList;
import java.util.List;

public class Lager {
    private List<LKW> lkws;
    private List<Auftrag> auftraege;

    public Lager() {
        this.lkws = new ArrayList<>();
        this.auftraege = new ArrayList<>();
    }

    public void kwBeladen(Auftrag auftrag) {
        // Hier könnte Logik implementiert werden, die einen verfügbaren LKW sucht und den Auftrag zuweist.
        for (LKW lkw : lkws) {
            if (lkw.getStatus() == LKWStatus.istBeladen) {
                continue;
            }
            lkw.ausliefern(); // Angenommen, diese Methode aktualisiert den Status des LKW.
            auftraege.add(auftrag);
            break;
        }
    }

    public void kwVerfuegbar() {
        // Hier könnte eine Methode implementiert werden, die die Verfügbarkeit der LKW verwaltet.
        for (LKW lkw : lkws) {
            if (lkw.getStatus() == LKWStatus.amZentrallager) {
                lkw.setStatus(LKWStatus.wirdBeladen);
            }
        }
    }

    public List<LKW> getLkws() {
        return lkws;
    }

    public List<Auftrag> getAuftraege() {
        return auftraege;
    }

    // Methoden zum Hinzufügen oder Entfernen von LKWs und Aufträgen könnten hier hinzugefügt werden.
}
