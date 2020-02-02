package com.company;

public class InvoiceItem {

    public static void main(String[] args) {
	    InvoiceItem x = new InvoiceItem("1234","chair",5,50);
	    System.out.println(x.getUnitPrice());
    }
    private int qty;
    private String desc,id;
    private double unitPrice;
    public InvoiceItem(String id,String desc,int qty,double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }

    public String toString() {
        return "InvoiceItem[" +
                "qty=" + qty +
                ", desc='" + desc + '\'' +
                ", id='" + id + '\'' +
                ", unitPrice=" + unitPrice +
                ']';
    }

}
