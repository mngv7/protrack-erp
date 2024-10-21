package com.example.protrack.productbuild;

/**
 * Represents a product build in the system
 */
public class ProductBuild {
    private final Integer buildId;
    private final Integer productOrderId;
    private float buildCompletion;
    private final Integer productId;

    /**
     * Constructor initialises the product build with specific attributes.
     * @param buildId Unique identifier for product builds
     * @param productOrderId Identifier for build's product order
     * @param buildCompletion Percentage towards this build being completed
     * @param productId The product of this build
     */
    public ProductBuild(Integer buildId, Integer productOrderId, float buildCompletion, Integer productId) {
        this.buildId = buildId;
        this.productOrderId = productOrderId;
        this.buildCompletion = buildCompletion;
        this.productId = productId;
    }

    /**
     * Getter method for build id
     * @return build id
     */
    public Integer getBuildId() {
        return buildId;
    }

    /**
     * Getter method for product order id
     * @return product order id
     */
    public Integer getProductOrderId() {
        return productOrderId;
    }

    /**
     * Getter method for build completion
     * @return build completion
     */
    public float getBuildCompletion() {
        return buildCompletion;
    }

    /**
     * Sets build completion with new value
     * @param buildCompletion Value being set
     */
    public void setBuildCompletion(Float buildCompletion) {
        this.buildCompletion = buildCompletion;
    }

    /**
     * Getter method for product id
     * @return product id
     */
    public Integer getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return this.productOrderId.toString();
    }
}
