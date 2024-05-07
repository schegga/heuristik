public class Auftrag {
    private int id;
    private static int nextId = 0;
    private Auftragsstatus status;

    public Auftrag() {
        this.id = nextId++;
        this.status = Auftragsstatus.amZentrallager; // Startstatus des Auftrags
    }

    public int getId() {
        return id;
    }

    public Auftragsstatus getStatus() {
        return status;
    }

    public void setStatus(Auftragsstatus status) {
        this.status = status;
    }

    // Weitere Methoden können hier hinzugefügt werden, abhängig von den spezifischen Anforderungen des Systems.
}

