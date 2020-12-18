package com.ias.workhours.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ias.workhours.model.Report;

/**
 * The Interface ReportRepository.
 * 
 * @author Anderson Vargas
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

	/**
	 * Find by id technician and week.
	 *
	 * @param idTechnician the id technician
	 * @param startWeek    the start week
	 * @param endWeek      the end week
	 * @return the list
	 */
	@Query(value = "select r from Report r where idTechnician=:idTechnician and (startWeek=:week or endWeek=:week)")
	List<Report> findByIdTechnicianAndWeek(String idTechnician, Integer week);
}
