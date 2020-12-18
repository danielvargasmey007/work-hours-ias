package com.ias.workhours.dto;

/**
 * The Class HoursDTO.
 */
public class HoursDTO {

	/** The normals. */
	private Double normals;

	/** The nocturnals. */
	private Double nocturnals;

	/** The sundays. */
	private Double sundays;

	/** The normals ext. */
	private Double normalsExt;

	/** The nocturnals ext. */
	private Double nocturnalsExt;

	/** The sundays ext. */
	private Double sundaysExt;

	/**
	 * Instantiates a new hours DTO.
	 */
	public HoursDTO() {
		super();
	}

	/**
	 * Instantiates a new hours DTO.
	 *
	 * @param normals the normals
	 * @param nocturnals the nocturnals
	 * @param sundays the sundays
	 * @param normalsExt the normals ext
	 * @param nocturnalsExt the nocturnals ext
	 * @param sundaysExt the sundays ext
	 */
	public HoursDTO(Double normals, Double nocturnals, Double sundays, Double normalsExt, Double nocturnalsExt,
			Double sundaysExt) {
		this.normals = normals;
		this.nocturnals = nocturnals;
		this.sundays = sundays;
		this.normalsExt = normalsExt;
		this.nocturnalsExt = nocturnalsExt;
		this.sundaysExt = sundaysExt;
	}

	/**
	 * Gets the normals.
	 *
	 * @return the normals
	 */
	public Double getNormals() {
		return normals;
	}

	/**
	 * Sets the normals.
	 *
	 * @param normals the new normals
	 */
	public void setNormals(Double normals) {
		this.normals = normals;
	}

	/**
	 * Gets the nocturnals.
	 *
	 * @return the nocturnals
	 */
	public Double getNocturnals() {
		return nocturnals;
	}

	/**
	 * Sets the nocturnals.
	 *
	 * @param nocturnals the new nocturnals
	 */
	public void setNocturnals(Double nocturnals) {
		this.nocturnals = nocturnals;
	}

	/**
	 * Gets the sundays.
	 *
	 * @return the sundays
	 */
	public Double getSundays() {
		return sundays;
	}

	/**
	 * Sets the sundays.
	 *
	 * @param sundays the new sundays
	 */
	public void setSundays(Double sundays) {
		this.sundays = sundays;
	}

	/**
	 * Gets the normals ext.
	 *
	 * @return the normals ext
	 */
	public Double getNormalsExt() {
		return normalsExt;
	}

	/**
	 * Sets the normals ext.
	 *
	 * @param normalsExt the new normals ext
	 */
	public void setNormalsExt(Double normalsExt) {
		this.normalsExt = normalsExt;
	}

	/**
	 * Gets the nocturnals ext.
	 *
	 * @return the nocturnals ext
	 */
	public Double getNocturnalsExt() {
		return nocturnalsExt;
	}

	/**
	 * Sets the nocturnals ext.
	 *
	 * @param nocturnalsExt the new nocturnals ext
	 */
	public void setNocturnalsExt(Double nocturnalsExt) {
		this.nocturnalsExt = nocturnalsExt;
	}

	/**
	 * Gets the sundays ext.
	 *
	 * @return the sundays ext
	 */
	public Double getSundaysExt() {
		return sundaysExt;
	}

	/**
	 * Sets the sundays ext.
	 *
	 * @param sundaysExt the new sundays ext
	 */
	public void setSundaysExt(Double sundaysExt) {
		this.sundaysExt = sundaysExt;
	}

}
