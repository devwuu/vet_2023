package com.web.vt.domain.guardian;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalGuardianRepository extends JpaRepository<AnimalGuardian, Long> {
}
