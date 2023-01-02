package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.Offer;
@Repository
public interface OfferRepository extends JpaRepository<Offer,String> {

}
