package com.example.protrack.products;

/**
 * Represents a test record in the system
 */
public class TestRecord {

    private final Integer stepId;
    private final Integer productId;
    private final Integer stepNumber;
    private final String stepDescription;
    private final String stepCheckType;
    private final String stepCheckCriteria;

    /**
     * Constructor initialises the test record with specific attributes
     *
     * @param stepId Unique identifier for step
     * @param productId Identifier for step's product
     * @param stepNumber The number this step is related to its position
     * @param stepDescription Description of step
     * @param stepCheckType Step's Type
     * @param stepCheckCriteria Step's Criteria
     */
    public TestRecord(Integer stepId, Integer productId, Integer stepNumber, String stepDescription, String stepCheckType, String stepCheckCriteria) {
        if (stepId == null || productId == null || stepNumber == null || stepDescription == null || stepCheckType == null || stepCheckCriteria == null) {
            throw new IllegalArgumentException("No fields can be null");
        }
        this.stepId = stepId;
        this.productId = productId;
        this.stepNumber = stepNumber;
        this.stepDescription = stepDescription;
        this.stepCheckType = stepCheckType;
        this.stepCheckCriteria = stepCheckCriteria;
    }



    /**
     * // Getter methods for step id
     *
     * @return step id
     */
    public Integer getStepId() {
        return stepId;
    }

    /**
     * // Getter methods for product id
     *
     * @return product id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Getter methods for step number
     *
     * @return step number
     */
    public Integer getStepNumber() {
        return stepNumber;
    }

    /**
     * Getter methods for step description
     *
     * @return step description
     */
    public String getStepDescription() {
        return stepDescription;
    }

    /**
     * Getter methods for step check type
     *
     * @return step check type
     */
    public String getStepCheckType() {
        return stepCheckType;
    }

    /**
     * Getter methods for step check criteria
     *
     * @return step check criteria
     */
    public String getStepCheckCriteria() {
        return stepCheckCriteria;
    }
}