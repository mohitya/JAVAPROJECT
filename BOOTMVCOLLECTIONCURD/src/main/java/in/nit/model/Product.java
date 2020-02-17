package in.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
private Integer prodId;
private String prodCode;
private Double prodCost;
public Product() {
	super();
}

public Product(Integer prodId, String prodCode, Double prodCost) {
	super();
	this.prodId = prodId;
	this.prodCode = prodCode;
	this.prodCost = prodCost;
}

public Integer getProdId() {
	return prodId;
}
public void setProdId(Integer prodId) {
	this.prodId = prodId;
}
public String getProdCode() {
	return prodCode;
}
public void setProdCode(String prodCode) {
	this.prodCode = prodCode;
}
public Double getProdCost() {
	return prodCost;
}
public void setProdCost(Double prodCost) {
	this.prodCost = prodCost;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
}

}
