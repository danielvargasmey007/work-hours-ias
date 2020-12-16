package com.ias.workhours.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

/**
 * The Class Report.
 */
@Entity
@Table(name = "REPORT")
public class Report {

	/** The id. */
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The start date. */
	@Column
	@NonNull
	private Date startDate;

	/** The end date. */
	@Column
	@NonNull
	private Date endDate;

	/** The technician. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idTechnician")
	private Technician technician;

	/** The service. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idService")
	private Service service;

	/**
	 * Instantiates a new report.
	 */
	public Report() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the technician.
	 *
	 * @return the technician
	 */
	public Technician getTechnician() {
		return technician;
	}

	/**
	 * Sets the technician.
	 *
	 * @param technician the new technician
	 */
	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(Service service) {
		this.service = service;
	}

}
