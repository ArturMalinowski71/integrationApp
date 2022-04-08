package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.PolishCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolishCityRepository extends JpaRepository<PolishCity, Long> {

    List<PolishCity> findAllByNameStartingWithIgnoreCase(String name);

}
