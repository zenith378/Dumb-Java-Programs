
public class PINGPONG extends SPIEL {

    private RECHTECK nogo;
    private BALL ball;
    private SCHLAEGER SpielerL;
    private SCHLAEGER SpielerR;
    private RECHTECK RandO;
    private RECHTECK RandU;
    private RECHTECK RandL;
    private RECHTECK RandR;
    private RECHTECK Hintergrund;
    private int punkteL;
    private int punkteR;

    public PINGPONG () {
        super ();
        this.punkteL = 0;
        this.punkteR = 0;
        this.tickerIntervallSetzen(10);
/*
        this.Hintergrund = new RECHTECK ();
        this.Hintergrund.setzeGroesse (800,600);
        this.Hintergrund.setzeMittelpunkt (400,300);
        this.Hintergrund.setzeFarbe ("schwarz"); */

        this.nogo = new RECHTECK ();
        this.nogo.setzeFarbe ("schwarz");
        this.nogo.setzeGroesse (4 , 590);
        this.nogo.setzeMittelpunkt (400,300);

        this.ball = new BALL();
        this.ball.setzeFarbe ("rot");

        this.SpielerL = new SCHLAEGER (10,300);
        this.SpielerR = new SCHLAEGER (790,300);

        this.RandO = new RECHTECK ();
        this.RandO.setzeGroesse (800, 4);
        this.RandO.setzeMittelpunkt (400, 2);
        this.RandO.setzeFarbe ("schwarz");

        this.RandU = new RECHTECK ();
        this.RandU.setzeGroesse (800, 4);
        this.RandU.setzeMittelpunkt (400, 598);
        this.RandU.setzeFarbe ("schwarz");

        this.RandL = new RECHTECK ();
        this.RandL.setzeGroesse (4,800);
        this.RandL.setzeMittelpunkt (2,300 );
        this.RandL.setzeFarbe ("schwarz");

        this.RandR = new RECHTECK ();
        this.RandR.setzeGroesse (4,800);
        this.RandR.setzeMittelpunkt (798,300 );
        this.RandR.setzeFarbe ("schwarz");

    }

    @ Override
    public void tick() {

        this.ball.bewegen();
        this.SpielerL.bewegen();
        this.SpielerR.bewegen();

        if (this.SpielerL.schneidet(this.RandO)) {
            this.SpielerL.stopp("oben");
        }
        else if (this.SpielerL.schneidet(this.RandU)) {
            this.SpielerL.stopp("unten");
        }
        //        else if (this.SpielerL.schneidet(this.RandL)) {
        //          this.SpielerL.stopp("links");
        //  }
        if (this.SpielerR.schneidet(this.RandO)) {
            this.SpielerR.stopp("oben");
        }
        else if (this.SpielerR.schneidet(this.RandU)) {
            this.SpielerR.stopp("unten");
        }
        // Reaktion auf oberen und unteren Rand
        if (this.ball.schneidet(this.RandO)) {
            this.ball.invertiereDeltaY();
        }
        else if (this.ball.schneidet(this.RandU)){
            this.ball.invertiereDeltaY();
        }
        else if (this.ball.schneidet(this.SpielerL)){
            this.ball.invertiereDeltaX();
            this.ball.bewegen();
            //this.ball.bewegen();
        }
        else if (this.ball.schneidet(this.SpielerR)){
            this.ball.invertiereDeltaX();
            this.ball.bewegen();
            //this.ball.bewegen();
        }

        if (this.ball.schneidet(this.RandL)) {
            this.tickerStoppen();
            this.punkteR=punkteR +1;
            this.punkteRechtsSetzen(this.punkteR);
        }
        else if (this.ball.schneidet(this.RandR)) {
            this.tickerStoppen();
            this.punkteL=punkteL+1;
            this.punkteLinksSetzen(this.punkteL);
        }

        }

        public void tasteReagieren (int code) {
            if  (code == 26)   {this.SpielerR.verringereDeltaY();}
            else   if  (code == 28)   {this.SpielerR.erhoeheDeltaY(); }
            else   if  (code == 22)   {this.SpielerL.verringereDeltaY();}
            else   if  (code == 18)   {this.SpielerL.erhoeheDeltaY ();}
            else   if  (code == 13)   {this.tickerStarten (10);
                this.ball.setzeNeueStartbedingungen();
                // this.SpielerL.setzeNeueStartbedingungen ("links");
                // this.SpielerR.setzeNeueStartbedingungen ("rechts");}
                //else   if  (code == 27)   {this.spielerR.setzeDeltaX (3);}                        

            }

        }
    }