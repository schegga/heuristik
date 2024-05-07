public class LKW {
    private int kapazitaet;
    private LKWStatus status;

    public LKW(int kapazitaet) {
        this.kapazitaet = kapazitaet;
        this.status = LKWStatus.amZentrallager; // Anfangsstatus des LKW
    }

    public void ausliefern() {
        // Diese Methode könnte Logik enthalten, die den Prozess der Lieferung startet.
        // Zum Beispiel könnte der Status auf 'fahrenZurLiegenschaft' gesetzt werden.
        this.status = LKWStatus.fahrenZurLiegenschaft;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public LKWStatus getStatus() {
        return status;
    }

    public void setStatus(LKWStatus status) {
        this.status = status;
    }
}

enum LKWStatus {
    amZentrallager,
    AuftragEingegangen,
    wirdBeladen,
    istBeladen,
    fahrenZurLiegenschaft,
    entladen,
    abgemacht,
    fahrenZumZentrallager
}
