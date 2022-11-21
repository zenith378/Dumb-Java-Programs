
class AUTO {
    int tankvolumen;
    int tankinhalt;
    int gefahreneKilometer;
    
    AUTO () {
        this.tankvolumen = 50;
        this.tankinhalt = 30;
        this.gefahreneKilometer = 350;
    }
    
    int nenneTankvolumen() {
        return this.tankvolumen;
    }
    
    int nenneTankinhalt() {
        return this.tankinhalt;
    }
    
    int nenneGefahreneKilometer() {
        return this.gefahreneKilometer;
    }
    
    
    double verbrauchBerechnen() {
        double verbrauch =(tankvolumen-tankinhalt)/(gefahreneKilometer/100);
        return verbrauch;
    }
    
}