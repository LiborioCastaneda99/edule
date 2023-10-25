package com.cipasoft.edule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cipasoft.edule.models.IdType;

@Repository
public interface RepoIdType extends JpaRepository<IdType, Integer> {
    
}
