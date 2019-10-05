package com.model;

public class Bill {
	private int billNo;
	private double total;
	private double gst;
	private double finalTotal;
	public Bill(int billNo, double total, double gst, double finalTotal) {
		super();
		this.billNo = billNo;
		this.total = total;
		this.gst = gst;
		this.finalTotal = finalTotal;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}
	

}
