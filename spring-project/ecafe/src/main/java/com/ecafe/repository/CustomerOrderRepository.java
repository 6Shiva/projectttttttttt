package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.CustomerOrder;
@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long>{

}
