import ea.edu.DreieckE;

/**
 * Diese Klasse stellt ein einfaches Dreieck dar.
 */
public class DREIECK {
    
    /**
     * Das Symbol, dass dieses Dreieck darstellt.
     */
    private DreieckE symbol;
    
    /**
     * Die Farbe dieses Dreiecks
     */
    private String farbe;
    
    /**
     * Gibt an, ob dieses Dreieck sichtbar ist.
     */
    private boolean sichtbar;
    
    /**
     * x-Koordinate des Eckpunkts A
     */
    private int A_x;
    
    /**
     * y-Koordinate des Eckpunkts A
     */
    private int A_y;
    
    /**
     * x-Koordinate des Eckpunkts B
     */
    private int B_x;
    
    /**
     * y-Koordinate des Eckpunkts B
     */
    private int B_y;
    
    /**
     * x-Koordinate des Eckpunkts C
     */
    private int C_x;
    
    /**
     * y-Koordinate des Eckpunkts C
     */
    private int C_y;
    
     /**
     * x-Koordinate des Mittelpunkts des umschliessenden Rechtecks
     */
    private int M_x;
    
    /**
     * y-Koordinate des Mittelpunkts des umschliessenden Rechtecks
     */
    private int M_y;
    
    
    
    /**
     * Konstruktor der Klasse <code>DREIECK</code>. Erstellt ein neues Dreieck.
     */
    public DREIECK() {
        this.sichtbar = true;
        this.farbe = "Gruen";
        this.A_x = 100;
        this.A_y = 100;
        this.B_x = 200;
        this.B_y = 100;
        this.C_x = 150;
        this.C_y = 50;
        this.M_x = 150;
        this.M_y = 50;
        this.symbol = new DreieckE();
        this.symbol.farbeSetzen(this.farbe);
        this.symbol.punkteSetzen(this.A_x, this.A_y, this.B_x, this.B_y, this.C_x, this.C_y);
        this.symbol.mittelpunktSetzen(this.M_x,this.M_y);
    }
    
    
    
    /**
     * Setzt die Ecken dieses Dreiecks (A, B, C) neu.
     * @param   a_x Die X-Koordinate des Punktes A
     * @param   a_y Die Y-Koordinate des Punktes A
     * @param   b_x Die X-Koordinate des Punktes B
     * @param   b_y Die Y-Koordinate des Punktes B
     * @param   c_x Die X-Koordinate des Punktes C
     * @param   c_y Die Y-Koordinate des Punktes C
     */
    public void setzeEcken(int a_x, int a_y, int b_x, int b_y, int c_x, int c_y) {
        this.A_x = a_x;
        this.A_y = a_y;
        this.B_x = b_x;
        this.B_y = b_y;
        this.C_x = c_x;
        this.C_y = c_y;
        this.M_x = ( Math.min(Math.min(a_x,b_x),c_x) + Math.max(Math.max(a_x,b_x),c_x) ) /2 ;
        this.M_y = ( Math.min(Math.min(a_y,b_y),c_y) + Math.max(Math.max(a_y,b_y),c_y) ) /2 ;
        symbol.punkteSetzen(a_x, a_y, b_x, b_y, c_x, c_y);
    }
    
    /**
     * Setzt die Farbe dieses Dreiecks neu.
     * @param   farbeNeu    Diese Farbe erhaelt das Dreieck (z.B. "Rot")
     */
    public void setzeFarbe(String farbeNeu) {
        this.farbe = farbeNeu;
        this.symbol.farbeSetzen(farbe);
    }
    
    /**
     * Setzt den Mittelpunkt dieses Dreieck neu.<br />
     * <b>ACHTUNG!</b><br />
     * Dies ist <i>nicht</i> der geometrische Mittelpunkt. Denkt man sich ein Rechteck, 
     * das man "genau ueber das Dreieck" spannt, sodass es dieses gerade von allen Seiten umschliesst, 
     * so ist der Mittelpunkt <b>dieses Rechtecks</b> der, der hier neu gesetzt wird.
     * @param   m_x Die X-Koordinate des neuen Mittelpunktes
     * @param   m_y Die Y-Koordinate des neuen Mittelpunktes
     */
    public void setzeMittelpunkt(int m_x, int m_y) {
        int deltaX = m_x - this.M_x;
        int deltaY = m_y - this.M_y;
        this.A_x = this.A_x + deltaX;
        this.A_y = this.A_y + deltaY;
        this.B_x = this.B_x + deltaX;
        this.B_y = this.B_y + deltaY;
        this.C_x = this.C_x + deltaX;
        this.C_y = this.C_y + deltaY;
        this.M_x = m_x;
        this.M_y = m_y;
        this.symbol.mittelpunktSetzen(m_x, m_y);
    }
    
    /**
     * Setzt, ob dieses Dreieck sichtbar sein soll.
     * @param   sichtbarNeu Ist dieser Wert <code>true</code>, ist nach dem Aufruf dieser Methode dieses Dreieck 
     * sichtbar. Ist dieser Wert <code>false</code>, so ist nach dem Aufruf dieser Methode dieses Dreieck unsichtbar.
     */
    public void setzeSichtbar(boolean sichtbarNeu) {
        this.sichtbar = sichtbarNeu;
        this.symbol.sichtbarSetzen(sichtbarNeu);
    }
    
    /**
     * Verschiebt dieses Dreieck um eine Verschiebung - angegeben durch ein "Delta X" und "Delta Y".
     * @param   deltaX  Der X Anteil dieser Verschiebung. Positive Werte verschieben nach rechts, negative nach links.
     * @param   deltaY  Der Y Anteil dieser Verschiebung. Positive Werte verschieben nach unten, negative nach oben.
     */
    public void verschiebenUm(int deltaX, int deltaY) {
        this.A_x = this.A_x + deltaX;
        this.A_y = this.A_y + deltaY;
        this.B_x = this.B_x + deltaX;
        this.B_y = this.B_y + deltaY;
        this.C_x = this.C_x + deltaX;
        this.C_y = this.C_y + deltaY;
        this.M_x = this.M_x + deltaX;
        this.M_y = this.M_y + deltaY;
        this.symbol.verschieben(deltaX, deltaY);
    }
    
    /**
     * Gibt das Symbol als grafisches Objekt aus.<br />
     * Diese Methode braucht man nicht nutzen.
     * @return  Das Symbol dieses Rechtecks. Dies ist ein echtes, grafisches Objekt.
     */
    public DreieckE symbol() {
        return this.symbol;
    }
    
    /**
     * Diese Methode gibt die x-Koordinate des Mittelpunkts dieses Dreiecks zurueck
     * @return  Die aktuelle x-Koordinate des Mittelpunktes dieses Dreiecks
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
     * Diese Methode prueft dieses Dreieck und einen weiteren Kreis auf Kollision.
     * @param   k   Der Kreis, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Dreieck geprueft werden soll.
     * @return  <code>true</code>, wenn sich Dreieck und Kreis ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(KREIS k) {
        return symbol.schneidet(k.symbol());
    }
    
    /**
     * Diese Methode prueft dieses Dreieck und ein Rechteck auf Kollision.
     * @param   r   Das Rechteck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Dreieck geprueft werden soll.
     * @return  <code>true</code>, wenn sich Dreieck und Rechteck ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(RECHTECK r) {
        return r.schneidet(this);
    }
    
    /**
     * Diese Methode prueft dieses Dreieck und ein anderes Dreieck auf Kollision.
     * @param   d   Das Dreieck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Dreieck geprueft werden soll.
     * @return  <code>true</code>, wenn sich beide Dreiecke ueberlagern - also schneiden - sonst <code>false</code>.
     */
    public boolean schneidet(DREIECK d) {
        return symbol.schneidet(d.symbol());
    }
    
    
    
    //----------------------------------------------------------------------------------
    // Methoden zur  B E R E C H N U N G   D E S   A B S T A N D S  zu anderen Objekten
    //----------------------------------------------------------------------------------
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreiecks vom Mittelpunkt 
     * eines anderen Kreises in x-Richtung entfernt ist.
     * @param   k   Der andere Kreis
     * @return  Abstand (in Pixeln) dieses Dreiecks vom anderen Kreis in x-Richtung (>0, wenn dieses Dreieck rechts des anderen Kreises liegt)
     */
    public int berechneAbstandX(KREIS k)
    {
        return this.M_x - k.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreiecks vom Mittelpunkt 
     * eines anderen Rechtecks in x-Richtung entfernt ist.
     * @param   r   Das andere Rechteck
     * @return  Abstand (in Pixeln) dieses Dreiecks zum anderen Rechteck in x-Richtung (>0, wenn dieses Dreieck rechts des anderen Rechtecks liegt)
     */
    public int berechneAbstandX(RECHTECK r)
    {
        return this.M_x - r.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreiecks vom Mittelpunkt 
     * eines anderen Dreiecks in x-Richtung entfernt ist.
     * @param   d   Das andere Dreieck
     * @return  Abstand (in Pixeln) der beiden Dreiecke in x-Richtung (>0, wenn dieses Dreieck rechts des anderen Dreiecks liegt)
     */
    public int berechneAbstandX(DREIECK d)
    {
        return this.M_x - d.nenneM_x();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreiecks vom Mittelpunkt 
     * eines anderen Kreises in y-Richtung entfernt ist.
     * @param   k   Der andere Kreis
     * @return  Abstand (in Pixeln) dieses Dreiecks vom anderen Kreis in y-Richtung (>0, wenn dieses Dreieck unter dem anderen Kreis liegt)
     */
    public int berechneAbstandY(KREIS k)
    {
        return this.M_y - k.nenneM_y();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreieck vom Mittelpunkt 
     * eines anderen Rechtecks in y-Richtung entfernt ist.
     * @param   r   Das andere Rechteck
     * @return  Abstand (in Pixeln) dieses Dreiecks vom anderen Rechteck in y-Richtung (>0, wenn dieses Dreiecks unter dem anderen Rechteck liegt)
     */
    public int berechneAbstandY(RECHTECK r)
    {
        return this.M_y - r.nenneM_y();
    }
    
    /**
     * Diese Methode prueft, wie weit der Mittelpunkt dieses Dreiecks vom Mittelpunkt 
     * eines anderen Dreiecks in y-Richtung entfernt ist.
     * @param   d   Das andere Dreieck
     * @return  Abstand (in Pixeln) der beiden Dreiecke in y-Richtung (>0, wenn dieses Dreieck unter dem anderen Dreieck liegt)
     */
    public int berechneAbstandY(DREIECK d)
    {
        return this.M_y - d.nenneM_y();
    }
    
}