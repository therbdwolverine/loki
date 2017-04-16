package loki.project.com.loki.src.models;

import java.util.Date;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String description;
    private double taxpercent;
    private double quantity;
    private Money costPrice;
    private Money sellingPrice;
    private Date expiryDate;
    private Date manufacturedDate;;
    private List<String> productGroup;
    private double discount;
    private Agency provider;
    private String imageLocation;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTaxpercent() {
        return taxpercent;
    }

    public void setTaxpercent(double taxpercent) {
        this.taxpercent = taxpercent;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Money getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Money costPrice) {
        this.costPrice = costPrice;
    }

    public Money getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Money sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public List<String> getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(List<String> productGroup) {
        this.productGroup = productGroup;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Agency getProvider() {
        return provider;
    }

    public void setProvider(Agency provider) {
        this.provider = provider;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
