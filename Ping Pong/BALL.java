public class BALL extends KREIS {
    private int deltaX;
    private int deltaY;

    public BALL() {
        super();
        this.setzeFarbe("rosa");
        this.setzeRadius(10);
        this.setzeMittelpunkt(400,300);
        this.deltaX=  1;
        this.deltaY= -1;
    }

    public void bewegen(){
        this.verschiebenUm(this.deltaX, this.deltaY) ;
    }

    public void erhoeheDeltaX(){
        this.deltaY = -1 * this.deltaY;
    }

    public void erhoeheDeltaY(){
        this.deltaX= -1 * this.deltaX;
    }

    public void invertiereDeltaX(){
        this.deltaX= -1 * this.deltaX;
    }

    public void invertiereDeltaY(){  this.deltaY = -1 * this.deltaY;    
    }

    public void setzeNeueStartbedingungen(){
        this.setzeMittelpunkt (400,300);
        this.deltaX = this.deltaX / Math.abs (this.deltaX);
        this.deltaY = this.deltaY / Math.abs (this.deltaY);
    }

    public void verringereDeltaX(){
        this.deltaX = 1 * this.deltaX;
    }

    public void verringereDeltaY(){
        this.deltaY = 1 * this.deltaY;
    }
}