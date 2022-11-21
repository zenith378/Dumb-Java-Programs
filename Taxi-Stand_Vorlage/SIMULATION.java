public class SIMULATION extends SPIEL {

    private int max_anzahl;
    private TAXI [] taxis;
    
     // Konstruktor fuer Objekte der Klasse SIMULATION//
    public SIMULATION() {
        super();
        this.hintergrundgrafikSetzen("hintergrund.png");
        this.max_anzahl = 5;
        this.taxis = new TAXI [max_anzahl];
        
        this.taxis[0] = new TAXI("Eva" , 80+0*160 , 300);
        this.taxis[1] = new TAXI("Tom" , 80+1*160 , 300);
        this.taxis[2] = new TAXI("Mia" , 80+2*160 , 300);
        this.taxis[3] = new TAXI("Jan" , 80+3*160 , 300);
        this.taxis[4] = new TAXI("Tim" , 80+4*160 , 300);
    }
    
    @Override
    public void tasteReagieren(int code)
    {
        System.out.println (code);
        
        if (code==18) {
            this.taxis[0].wegfahren();
            this.taxis[1].aufruecken();
            this.taxis[2].aufruecken();
            this.taxis[3].aufruecken();
            this.taxis[4].aufruecken();
            
            this.taxis[0].einfahren();
        }
    }
}
