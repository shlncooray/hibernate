package com.shelan.zoo.objects;

import java.util.Date;

public class CageAllocation {
	
	private Date allocatedDate;
	private Date deAllocatedDate;
	private String reason;
	
	public CageAllocation() {
		// TODO Auto-generated constructor stub
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


	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allocatedDate == null) ? 0 : allocatedDate.hashCode());
		result = prime * result
				+ ((deAllocatedDate == null) ? 0 : deAllocatedDate.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CageAllocation other = (CageAllocation) obj;
		if (allocatedDate == null) {
			if (other.allocatedDate != null)
				return false;
		} else if (!allocatedDate.equals(other.allocatedDate))
			return false;
		if (deAllocatedDate == null) {
			if (other.deAllocatedDate != null)
				return false;
		} else if (!deAllocatedDate.equals(other.deAllocatedDate))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}
	*/
	

}
