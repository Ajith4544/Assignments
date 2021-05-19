package com.cropinfodemo1.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@EqualsAndHashCode
@NoArgsConstructor
@Document(collection="cropItems")
@AllArgsConstructor
public class CropItem {

    @Id
    private ObjectId _id;
    private String type;
    private String name;
    private Double quantityInKg;
    private Double pricePerKg;
    private String email;
    private String address;

    public CropItem(String type, String name, Double quantity, Double pricePerKg, String email, String address) {
        this.type = type;
        this.name = name;
        this.quantityInKg = quantity;
        this.pricePerKg = pricePerKg;
        this.email = email;
        this.address = address;
    }

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

	public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

}
