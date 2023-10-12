package flower.store.store;

import flower.store.flower.Flower;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower();
        this.quantity = quantity;
    }

    // public void setQuantity(int quantity) {
    //     this.quantity = quantity < 1 ? 1 : quantity;
    // }
    public void setQuantity() {
    if (quantity < 1) {
        this.quantity = 1;
    } else {
        this.quantity = quantity;
    }
}

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
