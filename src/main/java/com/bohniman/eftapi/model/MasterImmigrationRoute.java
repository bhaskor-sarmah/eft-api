package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterImmigrationRoute
 */
@Entity
public class MasterImmigrationRoute extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String routeCode;

	@Size(max = 300)
	private String routeName;

	@Size(max = 300)
	private String routeAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterImmigrationRoute() {
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteAsm() {
		return routeAsm;
	}

	public void setRouteAsm(String routeAsm) {
		this.routeAsm = routeAsm;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}