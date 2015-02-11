package com.shelan.zoo.objects;

import java.util.Date;

public class CageAllocation {
	private int cageAllocationId;
	private Date allocatedDate;
	private Date deAllocatedDate;
	private String reason;

	private Animal animal;

	public CageAllocation() {
	}

	public CageAllocation(Date allocatedDate, Date deAllocatedDate,
			String reason) {
		super();
		this.allocatedDate = allocatedDate;
		this.deAllocatedDate = deAllocatedDate;
		this.reason = reason;
	}

	public Date getAllocatedDate() {
		return allocatedDate;
	}

	public void setAllocatedDate(Date allocatedDate) {
		this.allocatedDate = allocatedDate;
	}

	public Date getDeAllocatedDate() {
		return deAllocatedDate;
	}

	public void setDeAllocatedDate(Date deAllocatedDate) {
		this.deAllocatedDate = deAllocatedDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getCageAllocationId() {
		return cageAllocationId;
	}

	public void setCageAllocationId(int cageAllocationId) {
		this.cageAllocationId = cageAllocationId;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
