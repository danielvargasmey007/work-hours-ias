package com.ias.workhours.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Service.
 * 
 * @author Anderson Vargas
 */
@Entity
@Table(name = "SERVICE")
public class Service {

	/** The id. */
	@Id
	@Column
	private String id;

	/** The name. */
	@Column
	private String name;

	/** The name. */
	@Column
	private String descripcion;

	/** The reports. */
	@OneToMany(mappedBy = "service")
	List<Report> reports;

	/**
	 * Instantiates a new service.
	 */
	public Service() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the reports.
	 *
	 * @return the reports
	 */
	public List<Report> getReports() {
		return reports;
	}

	/**
	 * Sets the reports.
	 *
	 * @param reports the new reports
	 */
	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

}
