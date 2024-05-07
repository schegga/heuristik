import java.util.Date;

public class Bestellung {
    private int gewicht;
    private Bestellungsstatus status;
    private Date bestelldatum;
    private boolean verladet;
    private boolean istImport;
    private static int nextId = 0;
    private int id;

    public Bestellung(int gewicht) {
        this.gewicht = gewicht;
        this.status = Bestellungsstatus.aufgegeben; // Annahme, dass eine neue Bestellung immer den Status 'aufgegeben' hat
        this.bestelldatum = new Date(); // Das aktuelle Datum als Bestelldatum
        this.verladet = false;
        this.istImport = false;
        this.id = nextId++;
    }

    // Getter und Setter
    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public Bestellungsstatus getStatus() {
        return status;
    }

    public void setStatus(Bestellungsstatus status) {
        this.status = status;
    }

    public Date getBestelldatum() {
        return bestelldatum;
    }

    public void setBestelldatum(Date bestelldatum) {
        this.bestelldatum = bestelldatum;
    }

    public boolean isVerladet() {
        return verladet;
    }

    public void setVerladet(boolean verladet) {
        this.verladet = verladet;
    }

    public boolean isIstImport() {
        return istImport;
    }

    public void setIstImport(boolean istImport) {
        this.istImport = istImport;
    }

    public int getId() {
        return id;
    }
}

enum Bestellungsstatus {
    aufgegeben,
    inZustellung,
    zugestellt
}
