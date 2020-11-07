package com.NeuerAndNyako.PeachAccountBook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_type")
public class ItemType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="i_type_id", unique=true, nullable=false)
	private Integer typeId;
	
	@Column(name="c_type_name")
	private String typeName;
	
	@Column(name="c_type_name")
	private Integer exist;
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getExist() {
		return exist;
	}
	public void setExist(Integer exist) {
		this.exist = exist;
	}
	
}
