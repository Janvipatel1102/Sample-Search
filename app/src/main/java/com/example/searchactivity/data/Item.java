package com.example.searchactivity.data;

public class Item {

    String name ,itemImage;
    Integer price;

    public Item() {
    }

    public Item(String name, String itemImage, Integer price) {
        this.name = name;
        this.itemImage = itemImage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
