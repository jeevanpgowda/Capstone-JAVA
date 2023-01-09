package Capstone.FruitBowl;

import java.util.List;

public class Segregator {
    List<Fruit> fruit;

    List<String> fruitBySize;

    public Segregator(List<Fruit> fruit) {
        this.fruit = fruit;
        fruitBySize=fruit.stream().map(i -> i.getSize()).distinct().toList();
    }
    public void fruitBasket(List<Fruit> fruit) {
        System.out.println("--Arranged based on sizes--");
            for (String size : fruitBySize) {
                List<String> fruitSize = fruit.stream()
                        .filter(f -> f.getSize().equalsIgnoreCase(size)).map(f -> f.getFruit()).toList();
                    System.out.printf("Place %s in any one layer of basket%n", fruitSize);
            }
        }
    }