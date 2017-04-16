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


}
