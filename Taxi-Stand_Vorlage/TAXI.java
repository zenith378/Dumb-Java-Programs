import ea.*;

/**
 * Beschreiben Sie hier die Klasse TAXI.
 * 
 * @author      mike ganshorn
 * @version     2013-09-08
 */
public class TAXI
{
    private BILD bild;
    
    
    
    /**
     * Konstruktor fuer Objekte der Klasse TAXI
     */
    public TAXI()
    {
        this.bild = new BILD(0,0,"taxi.png");
    }
    
    
    
    /**
     * Konstruktor fuer Objekte der Klasse TAXI
     * 
     * @param   name   Name des Taxifahrers ("Eva", "Jan", "Mia", "Tim", "Tom")
     */
    public TAXI(String name)
    {
        if ( name.equalsIgnoreCase("eva") ) {
            this.bild = new BILD(0,0,"taxi_Eva.png");
        }
        else if ( name.equalsIgnoreCase("jan") ) {
            this.bild = new BILD(0,0,"taxi_Jan.png");
        }
        else if ( name.equalsIgnoreCase("mia") ) {
            this.bild = new BILD(0,0,"taxi_Mia.png");
        }
        else if ( name.equalsIgnoreCase("tim") ) {
            this.bild = new BILD(0,0,"taxi_Tim.png");
        }
        else if ( name.equalsIgnoreCase("tom") ) {
            this.bild = new BILD(0,0,"taxi_Tom.png");
        }
        else {
            this.bild = new BILD(0,0,"taxi.png");
        }
    }
    
    
    
    /**
     * Konstruktor fuer Objekte der Klasse TAXI
     * 
     * @param   name    Name des Taxifahrers ("Eva", "Jan", "Mia", "Tim", "Tom")
     * @param   x       x-Koordinate des Mittelpunkts der Grafik
     * @param   y       y-Koordinate des Mittelpunkts der Grafik
     */
    public TAXI(String name, int x, int y)
    {
        if ( name.equalsIgnoreCase("eva") ) {
            this.bild = new BILD(x-71,y-50,"taxi_Eva.png");
        }
        else if ( name.equalsIgnoreCase("jan") ) {
            this.bild = new BILD(x-71,y-50,"taxi_Jan.png");
        }
        else if ( name.equalsIgnoreCase("mia") ) {
            this.bild = new BILD(x-71,y-50,"taxi_Mia.png");
        }
        else if ( name.equalsIgnoreCase("tim") ) {
            this.bild = new BILD(x-71,y-50,"taxi_Tim.png");
        }
        else if ( name.equalsIgnoreCase("tom") ) {
            this.bild = new BILD(x-71,y-50,"taxi_Tom.png");
        }
        else {
            this.bild = new BILD(x-71,y-50,"taxi.png");
        }
    }
    
    
    
    /**
     * Konstruktor fuer Objekte der Klasse TAXI
     * 
     * @param   nummer  Nummer des Taxifahrers (0="Eva", 1="Jan", 2="Mia", 3="Tim", 4="Tom")
     * @param   x       x-Koordinate des Mittelpunkts der Grafik
     * @param   y       y-Koordinate des Mittelpunkts der Grafik
     */
    public TAXI(int nummer, int x, int y)
    {
        if ( nummer == 0 ) {
            this.bild = new BILD(x-71,y-50,"taxi_Eva.png");
        }
        else if ( nummer == 1 ) {
            this.bild = new BILD(x-71,y-50,"taxi_Jan.png");
        }
        else if ( nummer == 2 ) {
            this.bild = new BILD(x-71,y-50,"taxi_Mia.png");
        }
        else if ( nummer == 3 ) {
            this.bild = new BILD(x-71,y-50,"taxi_Tim.png");
        }
        else if ( nummer == 4 ) {
            this.bild = new BILD(x-71,y-50,"taxi_Tom.png");
        }
        else {
            this.bild = new BILD(x-71,y-50,"taxi.png");
        }
    }
    
    
    
    /**
     * Laesst das Taxi in eine beliebige Richtung fahren
     *
     * @param   x   Anzahl der Pixel in x-Richtung
     * @param   y   Anzahl der Pixel in x-Richtung
     */
    public void verschiebenUm(int x , int y)
    {
        this.bild.bewegen(x , y);
    }
    
    
    
    /**
     * Dreht das Taxi ausgehend vom aktuellen Drehwinkel 
     * um einen bestimmten Winkel.
     *
     * @param   winkel  Der Winkel, um den das Taxi gedreht werden soll
     */
    public void drehen(double winkel)
    {
        this.bild.drehenRelativ(winkel);
    }
    
    
    
    /**
     * Prueft, ob das eine Taxi ein anderes Taxi schneidet.
     *
     * @param t Ein Parameter
     * @return Der Rückgabewert
     */
    public boolean schneidet(TAXI t)
    {
        return this.bild.schneidet( t.referenzAufBild() );
    }
    
    
    
    /**
     * Gibt eine Referenz auf das Bild des Taxis. 
     * Bilder verfuegen ueber eine Methode zum Kollisionstest. 
     * Diese Methode wird nur intern von 'schneidet(...)' benoetigt, 
     * muss aber dennoch public sein. 
     * Es gibt keinen Sinn, diese Methode direkt aufzurufen!
     * 
     * @return  Referenz auf das Bild des Taxis
     *
     */
    public BILD referenzAufBild()
    {
        return this.bild;
    }
    
    
    
    /**
     * Das Auto wartet einige Millisekunden, bis die naechste Methode ausgefuehrt wird
     *
     * @param   ms  Wartedauer in Millisekunden
     */
    public void warte(int ms) {
        try {
                Thread.sleep(ms);
        }
        catch (InterruptedException e) {
        }
    }
    
    
    
    /**
     * Das Auto rueckt nach links auf. 
     * Dabei faehrt es 160 Pixel nach links.
     *
     */
    public void aufruecken() {
        for (int z=1 ; z <= 160 ; z++) {
            this.warte(15);
            this.bild.bewegen(-1, 0);
        }
    }
    
    
    
    /**
     * Das Auto faehrt nach links aus dem Fenster.
     *
     */
    public void wegfahren() {
        for (int z=1 ; z <= 700 ; z++) {
            this.warte(5);
            this.bild.bewegen(-1, 0);
        }
        this.bild.sichtbarSetzen(false);
    }
    
    
    
    /**
     * Das Auto faehrt von rechts ins Fenster ein
     *
     */
    public void einfahren() {
        this.bild.sichtbarSetzen(true);
        int y = (int) this.bild.mittelPunkt().y();
        this.bild.mittelpunktSetzen(911,y);
        for (int z=1 ; z <= 180 ; z++) {
            this.warte(15);
            this.bild.bewegen(-1, 0);
        }
    }

    
}
