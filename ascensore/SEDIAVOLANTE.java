class SEDIAVOLANTE {
    int etage;
    boolean aktiviert;
    String kennung;
    double belastung;
    
    SEDIAVOLANTE (){
        this.etage = 0;
        this.aktiviert = true;
        this.kennung = "Zenith";
        this.belastung = 7.0;
    }
    
    SEDIAVOLANTE (int etageNeu, boolean aktiviert) {
        this.etage = etageNeu;
        this.aktiviert = aktiviert;
        this.kennung = "Zenith";
        this.belastung = 7.0;
    }
    
    void setzeKennung (String kNeu) {
        this.kennung = kNeu;
    }
    
    void setzeEtage (int eNeu) {
        this.etage = eNeu;
    }
    
    String nenneKennung () {
        return this.kennung;
    }
    
    int nenneEtage () {
        return this.etage;
    }
    
    
        
}