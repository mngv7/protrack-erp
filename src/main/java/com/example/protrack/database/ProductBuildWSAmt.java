package com.example.protrack.database;

/**
 * Represents values in product page table in system
 */
public class ProductBuildWSAmt {
    Integer partId;
    String partName;
    Integer reqAmount;
    Integer quantity;


    /**
     * Constructor initialises the table row with specific attributes
     *
     * @param partId part id
     * @param partName part name
     * @param reqAmount amount of required parts
     * @param quantity amount of parts in workstation
     */
    public ProductBuildWSAmt(int partId, String partName, int reqAmount, int quantity) {
        this.partId = partId;
        this.partName = partName;
        this.reqAmount = reqAmount;
        this.quantity = quantity;
    }

    /**
     * Getter method for part id
     * @return part id
     */
    public Integer getPartId() {
        return partId;
    }

    /**
     * Getter method for part name
     * @return part name
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Getter method for required amount
     * @return required amount
     */
    public Integer getReqAmount() {
        return reqAmount;
    }

    /**
     * Getter method for quantity
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity with new value
     * @param quantity new quantity value
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
