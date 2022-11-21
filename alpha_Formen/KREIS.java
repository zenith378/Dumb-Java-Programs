import ea.edu.KreisE;

/**
 * Diese Klasse stellt einen einfachen Kreis dar.
 */
public class KREIS {
    
    /**
     * Das Symbol, das diesen Kreis darstellt.
     */
     private KreisE symbol;
     
    /**
     * Die Farbe dieses Kreises
     */
    private String farbe;
    
    /**
     * Gibt an, ob dieser Kreis sichtbar ist.
     */
    private boolean sichtbar;
    
    /**
     * Radius dieses Kreises
     */
    private int radius;
    
    /**
     * x-Koordinate des Mittelpunkts
     */
    protected int M_x;
    
    /**
     * y-Koordinate des Mittelpunkts
     */
    protected int M_y;
    
    
    
    /**
     * Konstruktor der Klasse <code>KREIS</code>. Erstellt einen neuen Kreis.
     */
    public KREIS() {
        this.sichtbar = true;
        this.farbe = "Blau";
        this.radius = 50;
        this.M_x = 350;
        this.M_y = 250;
        this.symbol = new KreisE();
        this.symbol.farbeSetzen(this.farbe);
        this.symbol.radiusSetzen(this.radius);
        this.symbol.mittelpunktSetzen(this.M_x, this.M_y);
    }
    
    
    
     /**
     * Setzt die Farbe dieses Kreises neu.
     * @param   farbeNeu    Diese Farbe erhaelt der Kreis (z.B. "Rot")
     */
    public void setzeFarbe(String farbeNeu) {
        this.farbe = farbeNeu;
        this.symbol.farbeSetzen(farbe);
    }
    
    /**
     * Setzt den Mittelpunkt dieses Kreises neu.
     * @param m_x   Die X-Koordinate des Mittelpunktes.
     * @param m_y   Die Y-Koordinate des Mittelpunktes.
     */
    public void setzeMittelpunkt(int m_x, int m_y) {
        this.M_x = m_x;
        this.M_y = m_y;
        this.symbol.mittelpunktSetzen(m_x, m_y);
    }
    
    /**
     * Setzt den Radius dieses Kreises neu.
     * @param   radius  Der neue Radius (in Pixel)
     */
    public void setzeRadius(int radius) {
        this.radius = radius;
        this.symbol.radiusSetzen(radius);
    }
    
    /**
     * Setzt, ob dieser Kreis sichtbar sein soll.
     * @param   sichtbarNeu Ist dieser Wert <code>true</code>, ist nach dem Aufruf dieser Methode dieser Kreis 
     * sichtbar. Ist dieser Wert <code>false</code>, so ist nach dem Aufruf dieser Methode dieser Kreis unsichtbar.
     */
    public void setzeSichtbar(boolean sichtbarNeu) {
        this.sichtbar = sichtbarNeu;
        this.symbol.sichtbarSetzen(sichtbarNeu);
    }
    
    /**
     * Verschiebt diesen Kreis um eine Verschiebung - angegeben durch ein "Delta X" und "Delta Y".
     * @param   deltaX  Der X Anteil dieser Verschiebung. Positive Werte verschieben nach rechts, negative nach links.
     * @param   deltaY  Der Y Anteil dieser Verschiebung. Positive Werte verschieben nach unten, negative nach oben.
     */
    public void verschiebenUm(int deltaX, int deltaY) {
        this.M_x = this.M_x + deltaX;
        this.M_y = this.M_y + deltaY;
        this.symbol.verschieben(deltaX, deltaY);
    }
    
    /**
     * Gibt das Symbol dieses Kreises als grafisches Objekt aus.
     * @return  Das Symbol dieses Kreises als grafisches Objekt.
     */
    public KreisE symbol() {
        return this.symbol;
    }
    
    /**
     * Diese Methode gibt die x-Koordinate des Mittelpunkts dieses Kreises zurueck
     * @return  Die aktuelle x-Koordinate des Mittelpunktes dieses Kreises
     */
    public int nenneM_x()
    {
        return this.M_x;
    }
    
    /**
     * Diese Methode gibt die y-Koordinate des Mittelpunkts dieses Kreises zurueck
     * @return  Die aktuelle y-Koordinate des Mittelpunktes dieses Kreises
     */
    public int nenneM_y()
    {
        return this.M_y;
    }
    
    
    
    //--------------------------------------------------------------------
    // Methoden fuer  K O L L I S I O N S T E S T S  mit anderen Objekten
    //--------------------------------------------------------------------
    
    /**
     * Diese Methode prueft diesen Kreis und einen weiteren Kreis auf Kollision.
     * @param   k   Der Kreis, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Kreises geprueft werden soll.
     * @return  <code>true</code>, wenn sich beide Kreise ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(KREIS k) {
        return symbol.schneidet(k.symbol());
    }
    
    /**
     * Diese Methode prueft diesen Kreis und ein Rechteck auf Kollision.
     * @param   r   Das Rechteck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Kreis geprueft werden soll.
     * @return  <code>true</code>, wenn sich Kreis und Rechteck ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(RECHTECK r) {
        return r.schneidet(this);
    }
    
    /**
     * Diese Methode prueft dieser Kreis und ein Dreieck auf Kollision.
     * @param   d   Das Dreieck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Kreises geprueft werden soll.
     * @return  <code>true</code>, wenn sich Dreieck und Kreis ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(DREIECK d) {
        return symbol.schneidet(d.symbol());
    }
    
    
    
    //----------------------------------------------------------------------------------
    // Methoden zur  B E R E C H N U N G   D E S   A B S T A N D S  zu anderen Objekten
    //----------------------------------------------------------------------------------
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Kreises in x-Richtung entfernt ist.
     * @param   k   Der andere Kreis
     * @return  Abstand (in Pixeln) der beiden Kreise in x-Richtung (>0, wenn dieser Kreis rechts des anderen Kreises liegt)
     */
    public int berechneAbstandX(KREIS k)
    {
        return this.M_x - k.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Rechtecks in x-Richtung entfernt ist.
     * @param   r   Das andere Rechteck
     * @return  Abstand (in Pixeln) dieses Kreises zum anderen Rechteck in x-Richtung (>0, wenn dieser Kreis rechts des anderen Rechtecks liegt)
     */
    public int berechneAbstandX(RECHTECK r)
    {
        return this.M_x - r.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Dreiecks in x-Richtung entfernt ist.
     * @param   d   Das andere Dreieck
     * @return  Abstand (in Pixeln) dieses Kreises zum anderen Dreieck in x-Richtung (>0, wenn dieser Kreis rechts des anderen Dreiecks liegt)
     */
    public int berechneAbstandX(DREIECK d)
    {
        return this.M_x - d.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Kreises in y-Richtung entfernt ist.
     * @param   k   Der andere Kreis
     * @return  Abstand (in Pixeln) der beiden Kreise in y-Richtung (>0, wenn dieser Kreis unter dem anderen Kreis liegt)
     */
    public int berechneAbstandY(KREIS k)
    {
        return this.M_y - k.nenneM_y();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Rechtecks in y-Richtung entfernt ist.
     * @param   r   Das andere Rechteck
     * @return  Abstand (in Pixeln) dieses Kreises vom anderen Rechteck in y-Richtung (>0, wenn dieser Kreis unter dem anderen Rechteck liegt)
     */
    public int berechneAbstandY(RECHTECK r)
    {
        return this.M_y - r.nenneM_y();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Kreises vom Mittelpunkt 
     * eines anderen Dreiecks in y-Richtung entfernt ist.
     * @param   d   Das andere Dreieck
     * @return  Abstand (in Pixeln) dieses Kreises vom anderen Dreieck in y-Richtung (>0, wenn dieser Kreis unter dem anderen Dreieck liegt)
     */
    public int berechneAbstandY(DREIECK d)
    {
        return this.M_y - d.nenneM_y();
    }
        
}