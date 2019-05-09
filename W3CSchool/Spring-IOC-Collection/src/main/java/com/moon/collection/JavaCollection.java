package com.moon.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	
	private List addressList;
	
	private Set addressSet;
	
	private Map addressMap;
	
	private Properties addressProp;
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "JavaCollection [addressList=" + addressList + ", addressSet=" + addressSet + ", addressMap="
				+ addressMap + ", addressProp=" + addressProp + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param addressList
	 * @param addressSet
	 * @param addressMap
	 * @param addressProp
	 */
	public JavaCollection(List addressList, Set addressSet, Map addressMap, Properties addressProp) {
		super();
		this.addressList = addressList;
		this.addressSet = addressSet;
		this.addressMap = addressMap;
		this.addressProp = addressProp;
	}
	
	/**
	 * 无参构造函数
	 */
	public JavaCollection() {
		super();
	}
	
	
	
	
	public List getAddressList() {
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
}
