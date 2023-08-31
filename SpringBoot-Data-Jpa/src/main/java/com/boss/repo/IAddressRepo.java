package com.boss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boss.entity.Address;

public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
