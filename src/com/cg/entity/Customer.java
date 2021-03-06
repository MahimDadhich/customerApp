package com.cg.entity;

import java.util.Objects;
import org.springframework.stereotype.Component;


@Component
public class Customer 
{

	private Long id;
	private String name;
	
	public Customer() 
	{		}
	
	public Customer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int hashCode=Objects.hashCode(id);
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer that = (Customer) obj;
	    return this.id.equals(that.id);
	}
	
}
