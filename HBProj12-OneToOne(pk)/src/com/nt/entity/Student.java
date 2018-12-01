package com.nt.entity;

import lombok.Data;

@Data
public class Student {
	private long sid;
	private String sname;
	private String addrs;
	private LibraryMembership child;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (addrs == null) {
			if (other.addrs != null)
				return false;
		} else if (!addrs.equals(other.addrs))
			return false;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addrs == null) ? 0 : addrs.hashCode());
		result = prime * result + (int) (sid ^ (sid >>> 32));
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}
	
	

}
