package com.aniket.java.exercise;

class CartItem {
    private String itemCode;
    private int quantity;

    public CartItem(String itemCode, int quantity) {
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ShoppingCart {
    private CartItem items[];
    private int size;
    private int itemsCount;

    private static final int DEFAULT_SIZE = 10;

    public ShoppingCart() {
        initializeCart(DEFAULT_SIZE);
    }

    public ShoppingCart(int size) {
        initializeCart(size);
    }

    //for security reasons.
    private void initializeCart(int size) {
        this.items = new CartItem[size];
        this.size = size;
    }

    public void addToCart(CartItem item) {
        if (itemsCount < size)
            items[itemsCount++] = item;
    }

    public void order() {
        System.out.println("Item in the cart :");
        for (int i = 0; i < itemsCount; i++) {
            System.out.printf("%s \t %d\n", items[i].getItemCode(), items[i].getQuantity());
        }
    }

}

public class ExerciseProblem1 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new CartItem("Pen", 3));
        cart.addToCart(new CartItem("Pencil", 2));
        cart.addToCart(new CartItem("Eraser", 1));
        cart.addToCart(new CartItem("Java Reference", 1));
        cart.addToCart(new CartItem("NoteBook", 6));

        cart.order();
    }
}
