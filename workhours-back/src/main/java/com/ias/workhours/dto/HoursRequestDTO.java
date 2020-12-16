package com.ias.workhours.dto;

/**
 * The Class HoursRequestDTO.
 */
public class HoursRequestDTO {

	/** The id technician. */
	private String idTechnician;

	/** The week. */
	private Integer week;

	/**
	 * Instantiates a new hours request DTO.
	 */
	public HoursRequestDTO() {
		super();
	}

	/**
	 * Instantiates a new hours request DTO.
	 *
	 * @param idTechnician the id technician
	 * @param week the week
	 */
	public HoursRequestDTO(String idTechnician, Integer week) {
		this.idTechnician = idTechnician;
		this.week = week;
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
	 * Gets the week.
	 *
	 * @return the week
	 */
	public Integer getWeek() {
		return week;
	}

	/**
	 * Sets the week.
	 *
	 * @param week the new week
	 */
	public void setWeek(Integer week) {
		this.week = week;
	}

}
