package com.example.protrack.productorders;

/**
 * Represents a product order in the system
 */
public class ProductOrder {
    private final int productOrderID;

    private final int productID;

    private final int quantity;

    private final int workOrderID;

    /**
     * Constructor initialises the product order with specific attributes
     *
     * @param productOrderID Unique identifier for product order
     * @param productID Identifier for products in product order
     * @param quantity Quantity of products in product order
     * @param workOrderID Identifier for work order of this product order
     */
    public ProductOrder(int productOrderID, int productID, int quantity, int workOrderID) {
        this.productOrderID = productOrderID;
        this.productID = productID;
        this.quantity = quantity;
        this.workOrderID = workOrderID;
    }

    /**
     * Getter method for product order id
     * @return product order id
     */
    public int getProductOrderID() {
        return productOrderID;
    }

    /**
     * Getter method for product id
     * @return product id
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Getter method for quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Getter method for work order id
     * @return work order id
     */
    public int getWorkOrderID() {
        return workOrderID;
    }

    @Override
    public String toString() {
        return String.valueOf(this.productOrderID);
    }
}
