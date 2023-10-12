package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.store.flower.Flower;
import flower.store.flower.FlowerType;
import flower.store.store.FlowerBucket;
import flower.store.store.FlowerPack;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(price);
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(0, flowerBucket.getPrice());
        Assertions.assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}
