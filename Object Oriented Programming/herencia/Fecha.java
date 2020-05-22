class Fecha{
    protected int day;
    protected int month;
    protected int year;

    Fecha(int day,int month,int year){
        this.day=comprobardia(day);
        this.month=comprobarmes(month);
        this.year=year;
    }

    //getters & setters

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void setDay(int day){
        this.day=comprobardia(day);
    }

    public void setMonth(int month){
        this.day=comprobarmes(month);
    }

    public void setYear(int year){
        this.year=year;
    }

    private int comprobardia(int day){
        if(day>0 && day <=31){
            return day;
        }else{
            return 1;
        }

    }
    private int comprobarmes(int month){
        if(month>0 && month <=12){
            return month;
        }else{
            return 1;
        }
    }

    public String toString(){
        /*%d un entero*/
        return String.format("%2d/%2d/%4d",day,month,year);
    }
}