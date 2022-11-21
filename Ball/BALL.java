class BALL {
    int radius;
    String farbe;

    BALL() {
        this.radius = 7;
        this.farbe = "rot";
    }

    int nenneRadius() {
        return this.radius;
    }

    String nenneFarbe() {
        return this.farbe;
    }

    void setzeFarbe(String fNeu) {
        this.farbe = fNeu;
    }

    void setzeRadius(int rNeu) {
        this.radius = rNeu;
    }
}