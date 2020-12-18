package com.ias.workhours.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotNull
	private Date startDate;

	/** The end date. */
	@Column
	@NonNull
	@NotNull
	private Date endDate;

	/** The id technician. */
	@Column
	@NonNull
	@NotNull
	@NotEmpty
	private String idTechnician;

	/** The id service. */
	@Column
	@NonNull
	@NotNull
	@NotEmpty
	private String idService;

	/** The week. */
	@Column
	private Integer startWeek;

	/** The week. */
	@Column
	private Integer endWeek;

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
	 * Gets the id technician.
	 *
	 * @return the id technician
	 */
	public String getIdTechnician() {
		return idTechnician;
	}

	/**
	 * Sets the id technician.
	 *
	 * @param idTechnician the new id technician
	 */
	public void setIdTechnician(String idTechnician) {
		this.idTechnician = idTechnician;
	}

	/**
	 * Gets the id service.
	 *
	 * @return the id service
	 */
	public String getIdService() {
		return idService;
	}

	/**
	 * Sets the id service.
	 *
	 * @param idService the new id service
	 */
	public void setIdService(String idService) {
		this.idService = idService;
	}

	/**
	 * Gets the start week.
	 *
	 * @return the start week
	 */
	public Integer getStartWeek() {
		return startWeek;
	}

	/**
	 * Sets the start week.
	 *
	 * @param startWeek the new start week
	 */
	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}

	/**
	 * Gets the end week.
	 *
	 * @return the end week
	 */
	public Integer getEndWeek() {
		return endWeek;
	}

	/**
	 * Sets the end week.
	 *
	 * @param endWeek the new end week
	 */
	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}

}
