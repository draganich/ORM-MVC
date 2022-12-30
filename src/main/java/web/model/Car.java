package web.model;

public class Car {
    private int maxSpeed;
    private int price;
    private String model;

    public Car(int maxSpeed, int price, String model) {
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
