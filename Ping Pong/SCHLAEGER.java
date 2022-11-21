
public class SCHLAEGER extends RECHTECK {
    private int deltaX;
    private int deltaY;

    public SCHLAEGER(int x ,int y) {
        super();
        this.setzeFarbe ("blau");
        this.setzeGroesse (10,80);
        this.setzeMittelpunkt (x , y) ;
        this.deltaX =  0;
        this.deltaY = -1;
    }

    public void bewegen(){
        this.verschiebenUm (this.deltaX, this.deltaY);
    }

    public void verringereDeltaY () {
        this.deltaY = this.deltaY - 1;  
    }

    public void erhoeheDeltaY () {
        this.deltaY = this.deltaY + 1;    
    }

    public int setzeDeltaX (int deltaXneu) {
        deltaXneu = this.deltaX;
        return this.deltaX;
    }

    public int setzeDeltaY (int deltaYneu) {
        deltaYneu = this.deltaY; 
        return this.deltaY;
    }

    public void stopp(String wo ) {
        if (wo == "oben" ) {
            this.setzeMittelpunkt (this.M_x,45);
            this.deltaY =0;
        }
        else if (wo == "unten") {
            this.setzeMittelpunkt (this.M_x,555);
            this.deltaY =0;           
        }
        else if (wo == "links") {
            this.setzeMittelpunkt (10,this.M_y);
            this.deltaX =0;           
        }
        else if (wo == "rechts") {
            this.setzeMittelpunkt (790,this.M_y);
            this.deltaX =0;           
        } 
    }
    
    
}
