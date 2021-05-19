package com.cropinfodemo1.request;

import lombok.*;

import org.springframework.data.mongodb.core.mapping.Document;


@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRequest {

    private Double quantityInKg;
    private Double pricePerKg;
    private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
