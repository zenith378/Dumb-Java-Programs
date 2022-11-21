class SMARTOFONOFONO {
    int handynummer;
    String speicherkapazitaet;
    String betriebssystem;

    SMARTOFONOFONO() {
        this.handynummer = 666;
        this.speicherkapazitaet = "45ßGB";
        this.betriebssystem = "Linux";

    }
    
    int nenneHandynummer() {
        return this.handynummer;
    }
    
    String nenneSpeichekapazitaet() {
        return this.speicherkapazitaet;
    }
    
    String nenneBetriebssystem () {
        return this.betriebssystem;
    }
    
    void setzeSpeichekapazitaet(String sNeu) {
        this.speicherkapazitaet = sNeu;
    }
}