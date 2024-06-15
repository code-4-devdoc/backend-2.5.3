// ResumeRepository.java

package com.devdoc.backend.repository;

import com.devdoc.backend.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {
}