package challenge2;

public class Resultado {
    private int minValue;
    private int maxValue;
    private int numberElements;

    public Resultado(int min, int max, int numberElements) {
        this.minValue = min;
        this.maxValue = max;
        this.numberElements = numberElements;
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