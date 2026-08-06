package challenge2;

public class Resultado {
    private int minValue;
    private int maxValue;
    private int numberElements;
    private boolean multiplo;
    private boolean divisor;
    private boolean even;
    private boolean odd;

    public Resultado(int min, int max, int numberElements,boolean multiplo,boolean divisor, boolean even, boolean odd) {
        this.minValue = min;
        this.maxValue = max;
        this.numberElements = numberElements;
        this.multiplo = multiplo;
        this.divisor = divisor;
        this.even = even;
        this.odd = odd;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getNumberElements() {
        return numberElements;
    }
}
