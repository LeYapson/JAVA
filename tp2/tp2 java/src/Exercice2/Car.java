package Exercice2;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void carteGrise() {
        System.out.printf("marque de la voiture : %s. modele de la voiture : %s. année de construction : %d", getBrand(),getModel(),getYear());
    }

    public static void main(String[] args) {
        Car myCar = new Car("RENAULT","Captur 2",2019);
        myCar.carteGrise();
    }
}
