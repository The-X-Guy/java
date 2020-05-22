class Fecha {
    private int dia;
    private int mes;
    private int anno;

    public String Fecha (int dia, int fecha, int anno) {
        
    }

    private int ComprobarMes (int mes) {
        int[] mes_impar = {1, 3, 5, 7, 9, 11};
        int[] mes_par = {4, 6, 8, 10, 12};
        if (mes_impar.contains(mes))
            return 31;
        else if (mes_par.contains(mes))
            return 30;
        else if (mes == 2)
            return 28; 
        else return -1;
    }

    private ComprobarDia (dia) {
        
    }
}