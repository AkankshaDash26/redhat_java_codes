package comm.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer orderId;
	private Date orderDate;
	private Integer quantity;
	private String orderName;
	private transient String orderBy;
	public Order() {
		super();
	}
	public Order(Integer orderId, Date orderDate, Integer quantity, String orderName, String orderBy) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.orderName = orderName;
		this.orderBy = orderBy;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}