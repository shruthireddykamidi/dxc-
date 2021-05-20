package com.demo;

public class Bill {
	String productname;
    double price;
    int qty;
    double total;
	
	public Bill(String productname, double price, int qty, double total) {
		super();
		this.productname = productname;
		this.price = price;
		this.qty = qty;
		this.total = total;
	}
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total*this.price;
	}
	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		//result = prime * result + marks;
		result = prime * result
				+ ((productname == null) ? 0 : productname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// type casting of the argument.
		Bill other = (Bill)obj;

		// comparing the state of argument with
		// the state of 'this' Object
		//if (marks != other.marks)
		//	return false;
		if (productname == null) {
			if (other.productname != null)
				return false;
		}
		else if (!productname.equals(other.productname))
			return false;
		return true;
	}
}
    

