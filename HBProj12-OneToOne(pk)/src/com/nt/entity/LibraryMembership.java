package com.nt.entity;


import java.util.Date;

import lombok.Data;
@Data
public class LibraryMembership {
	private int lid;
	private String type;
	private Date doj;
	private Student parent;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryMembership other = (LibraryMembership) obj;
		if (lid != other.lid)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lid;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	

}
