package com.ias.workhours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ias.workhours.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
