package com.farmermanagementdemo1.cropsData;

import lombok.*;



@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RequestItem {
    private String type;
    private String name;
    private Double quantityInKg;
    private Double pricePerKg;
    private String email;
    private String address;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getQuantityInKg() {
		return quantityInKg;
	}
	public void setQuantityInKg(Double quantityInKg) {
		this.quantityInKg = quantityInKg;
	}
	public Double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(Double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
