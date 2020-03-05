package com.bohniman.eftapi.model;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * MasterPoliceCaseCounter
 */
@Entity
public class AutoSuspectId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;

    private String thanaCode;
    private Long counter;
    
	public AutoSuspectId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getThanaCode() {
		return thanaCode;
	}
	public void setThanaCode(String thanaCode) {
		this.thanaCode = thanaCode;
	}
	public Long getCounter() {
		return counter;
	}
	public void setCounter(Long counter) {
		this.counter = counter;
	}

   

}