package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.CafeItem;
@Repository
public interface CafeItemRepository extends JpaRepository<CafeItem,String>{

}
