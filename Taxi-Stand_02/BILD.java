import ea.edu.*;


/**
 * Klasse BILD um png-, jpg- und gif-Grafiken in der EDU-Variante darstellen zu koennen.
 * 
 * @author      michl andonie
 * @version     2013-09-08
 */
public class BILD
extends BildE 
{ 
    private String name;
    
    
    /**
     * BILD Konstruktor
     *
     * @param   x       x-Koordinate der linken oberen Ecke des Bildes im Fenster
     * @param   y       y-Koordinate der linken oberen Ecke des Bildes im Fenster
     * @param   name    Name der Bilddatei, z.B. bild.png (Bild-Datei muss im Projekt-Ordner liegen)
     */
    public BILD(int x, int y, String name) {
        super(x, y, name);
        this.name = name;
    }
    
    
}
