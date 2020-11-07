package com.NeuerAndNyako.PeachAccountBook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="all_account_item")
public class AccountItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="i_id", unique=true, nullable=false)
	private Integer itemId;
	
	@Column(name="c_item_name")
	private String itemName;
	
	@Column(name="i_item_type")
	private Integer itemType;
	
	@Column(name="i_item_cash")
	private Long itemCash;
	
	@Column(name="i_income_cash")
	private Integer incomeCash;
	
	@Column(name="c_item_remark")
	private String itemRemark;
	
	@Column(name="d_item_date")
	private Date itemDate;
	
	@Column(name="d_last_modified_date")
	private Date lastModifiedDate;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public Long getItemCash() {
		return itemCash;
	}

	public void setItemCash(Long itemCash) {
		this.itemCash = itemCash;
	}

	public Integer getIncomeCash() {
		return incomeCash;
	}

	public void setIncomeCash(Integer incomeCash) {
		this.incomeCash = incomeCash;
	}

	public String getItemRemark() {
		return itemRemark;
	}

	public void setItemRemark(String itemRemark) {
		this.itemRemark = itemRemark;
	}

	public Date getItemDate() {
		return itemDate;
	}

	public void setItemDate(Date itemDate) {
		this.itemDate = itemDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModified(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
