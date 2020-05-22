import java.lang.*;

public class Hora {
    private int h;
    private int m;
    private int s;

    public Hora () {
        this.h = 00;
        this.m = 00;
        this.s = 00;
    }

    public Hora (int h, int m, int s) {
        this.h = checkHora(h);
        this.m = checkMin(m);
        this.s = checkSec(s);
    }

    public String toString() {
        return this.h+":"+this.m+":"+this.s;
    }

    // Métodos para comprobar la hora, minuto y segundo.
    private int checkSec (int s) {
        if (s < 0 || s > 59)
            return 00;
        else return s;
    }

    private int checkMin (int m) {
        if (m < 0 || m > 59)
            return 00;
        else return m;
    }

    private int checkHora (int h) {
        if (h < 0 || h > 23)
            return 00;
        else return h;
    }

    public String printHora () {
        return this.h + ":" + this.m + ":" + this.s;
    }

    public String printHoraAM_PM () {
        if (this.h < 12 && this.h != 0)
            return String.format("%02d:%02d:%02d AM", this.h, this.m, this.s);
        else if (this.h > 12)
            return String.format("%02d:%02d:%02d PM", (this.h-12), this.m, this.s);
        else 
            return String.format("%02d:%02d:%02d AM", (this.h-12), this.m, this.s);
    }

    public void setReloj (int h, int m) {
        this.h = checkHora(h);
        this.m = checkMin(m);
        this.s = 00;
    }

    public void setReloj (int h, int m, int s) {
        this.h = checkHora(h);
        this.m = checkMin(m);
        this.s = checkSec(s);
    }

}