/**
 * 
 */
package com.barun.rough.model;

import java.util.List;

/**
 * @author bibhu
 *
 */
public class D {

	private A a;
	private List<B> bs;
	private List<List<C>> cs;
	/**
	 * @return the a
	 */
	public A getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(A a) {
		this.a = a;
	}
	/**
	 * @return the bs
	 */
	public List<B> getBs() {
		return bs;
	}
	/**
	 * @param bs the bs to set
	 */
	public void setBs(List<B> bs) {
		this.bs = bs;
	}
	/**
	 * @return the cs
	 */
	public List<List<C>> getCs() {
		return cs;
	}
	/**
	 * @param cs the cs to set
	 */
	public void setCs(List<List<C>> cs) {
		this.cs = cs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "D [a=" + a + ", bs=" + bs + ", cs=" + cs + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((bs == null) ? 0 : bs.hashCode());
		result = prime * result + ((cs == null) ? 0 : cs.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		D other = (D) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (bs == null) {
			if (other.bs != null)
				return false;
		} else if (!bs.equals(other.bs))
			return false;
		if (cs == null) {
			if (other.cs != null)
				return false;
		} else if (!cs.equals(other.cs))
			return false;
		return true;
	}
	
	
}
