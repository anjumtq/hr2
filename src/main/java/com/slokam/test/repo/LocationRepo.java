package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Location;
				@Repository
				public interface LocationRepo extends JpaRepository<Location, Integer> {

				}
