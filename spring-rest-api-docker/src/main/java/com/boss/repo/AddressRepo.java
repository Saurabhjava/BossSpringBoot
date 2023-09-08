package com.boss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boss.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
