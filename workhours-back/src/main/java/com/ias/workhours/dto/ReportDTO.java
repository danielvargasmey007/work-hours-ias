package com.ias.workhours.dto;

import java.util.Date;

/**
 * The Class ReportDTO.
 */
public class ReportDTO {

	/** The id. */
	private Long id;

	/** The id technician. */
	private String idTechnician;

	/** The id service. */
	private String idService;

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/**
	 * Instantiates a new report DTO.
	 */
	public ReportDTO() {
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

}
