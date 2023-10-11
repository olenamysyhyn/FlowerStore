package flower.store.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }
}