package com.barun.rough.model;

public class C {

	private String id;
	private String value;
	private int record;
	private String foreignKey;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the record
	 */
	public int getRecord() {
		return record;
	}
	/**
	 * @param record the record to set
	 */
	public void setRecord(int record) {
		this.record = record;
	}
	/**
	 * @return the foreignKey
	 */
	public String getForeignKey() {
		return foreignKey;
	}
	/**
	 * @param foreignKey the foreignKey to set
	 */
	public void setForeignKey(String foreignKey) {
		this.foreignKey = foreignKey;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "C [id=" + id + ", value=" + value + ", record=" + record + ", foreignKey=" + foreignKey + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foreignKey == null) ? 0 : foreignKey.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + record;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C other = (C) obj;
		if (foreignKey == null) {
			if (other.foreignKey != null)
				return false;
		} else if (!foreignKey.equals(other.foreignKey))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (record != other.record)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
		
	
}
