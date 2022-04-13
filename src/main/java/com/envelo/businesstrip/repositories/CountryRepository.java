package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findCountryByName(String name);

    List<Country> findAllCountriesByIsActive(boolean isActive);


}

