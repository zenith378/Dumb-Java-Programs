
/**

 * @author (Zenith) 
 */
public class SCHEASDUFÜASOÄDGHF extends PERSON{
    private int jahrgangsstufe;
    private char klassenkuerzel;
    public SCHEASDUFÜASOÄDGHF(){
        super();
    }
    public void setzeJahrgangsstufe(int neueJahrgangsstufe){
        this.jahrgangsstufe = neueJahrgangsstufe;
    }
    public void setzeKlassenkuerzel(char neuesKlassenkuerzel){
        this.klassenkuerzel = neuesKlassenkuerzel;
    }
    public int nenneJahrgangsstufe() {
        return this.jahrgangsstufe;
    }
    public int nenneKlassenkuerzel() {
        return this.klassenkuerzel;
    }
}