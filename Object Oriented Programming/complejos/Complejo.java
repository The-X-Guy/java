public class Complejo {
    private float real;
    private float imag;

    public Complejo (float a, float b) {
       this.real = a;
       this.imag = b;
    }

    public Complejo () {
        this.real = 0;
        this.imag = 0;
    }

    public static float[] getRealMax(Complejo[] numbers){
        float maxValue = numbers[0];
        float position = 0;
        for(int i=1;i < numbers.length;i++){
            if(numbers[i].real > maxValue){
                maxValue = numbers[i].real;
                position = i;
            }
        
        }
        float[] salida = {maxValue, position};
        return salida;
    }
      

    public Complejo sumar(Complejo complejo) {
        return new Complejo(this.real + complejo.real, this.imag + complejo.imag);
    }

    public Complejo restar(Complejo complejo) {
        return new Complejo(this.real - complejo.real, this.imag - complejo.imag);
    } 

    public float getReal () {
        return this.real;
    }

    public float getImag () {
        return this.imag;
    }
    // public Complejo multiplicar (Complejo complejo) {
    //     return 
    // }

    public String toString () {
        return "("+this.real+","+this.imag+")";
    }
}