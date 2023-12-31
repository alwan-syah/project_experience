package childs;

import parents.Product;

public class Item extends Product {
    private int price;

    public Item() {
        // TODO Auto-generated constructor stub
    }

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    // Implementasi method abstract pada child class supaya menjadi bentuk konkrit
    // dan jelas
    @Override
    public void printInformation() {
        System.out.println("Product Name : " + getName());
        System.out.println("Product Price : " + getPrice());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
