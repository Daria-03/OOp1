import java.math.BigDecimal;
public class Hot extends Drink {
    private int temp;

    public Hot(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}