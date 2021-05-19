package com.cropinfodemo1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor

@NoArgsConstructor
public class CropItems {

    private List<CropItem> itemList;

	public List<CropItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<CropItem> itemList) {
		this.itemList = itemList;
	}

	
	}


