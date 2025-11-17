package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Point implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal x;
	private BigDecimal y;
	private BigDecimal r;
	private boolean hit;
	
	public Point(BigDecimal x, BigDecimal y, BigDecimal r, boolean hit) {
		setX(x);
		setY(y);
		setR(r);
		setHit(hit);
	}
	
	
	public BigDecimal getX() {
		return x;
	}
	public void setX(BigDecimal x) {
		this.x = x;
	}
	public BigDecimal getY() {
		return y;
	}
	public void setY(BigDecimal y) {
		this.y = y;
	}
	public BigDecimal getR() {
		return r;
	}
	public void setR(BigDecimal r) {
		this.r = r;
	}
	public boolean isHit() {
		return hit;
	}
	public void setHit(boolean hit) {
		this.hit = hit;
	}
	
	
	
}
