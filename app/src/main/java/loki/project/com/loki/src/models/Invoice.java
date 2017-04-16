package loki.project.com.loki.src.models;

import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceNo;
    private String to;
    private Agency agency;
    private Date invoiceDate;
    private List<Product> products;
}
