package com.example.protrack.database;

/**
 * Represents row in workstation table in system
 */
public class WorkstationPartDBTable {
    private final Integer partID;
    private final String partName;
    private final Integer quantity;

    /**
     * Constructor initialises the table row with specific attributes
     * @param partID
     * @param partName
     * @param quantity
     */
    public WorkstationPartDBTable(Integer partID, String partName, Integer quantity) {
        this.partID = partID;
        this.partName = partName;
        this.quantity = quantity;
    }

    /**
     * Getter method for part id
     * @return part id
     */
    public Integer getPartID() {
        return partID;
    }

    /**
     * Getter method for part name
     * @return part name
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Getter method for quantity
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }
}
