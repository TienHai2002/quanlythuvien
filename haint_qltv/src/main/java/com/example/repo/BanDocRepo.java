package com.example.dto.repo;

import com.example.entity.BanDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanDocRepo extends JpaRepository<BanDoc,Integer> {
}
