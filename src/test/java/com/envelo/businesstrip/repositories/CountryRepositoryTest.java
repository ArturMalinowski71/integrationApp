package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Country;
import com.envelo.businesstrip.model.entities.Transport;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


@DataJpaTest
@Transactional
class CountryRepositoryTest {

    @Autowired
    private CountryRepository countryRepository;

    @AfterEach
    void tearDown() {
        countryRepository.deleteAll();
    }

    @Test
    void findCountryByName_shouldReturnBelize() {

        //given
        String name = "Belize";
        BigDecimal dietAmount = new BigDecimal(222) ;
        boolean isActive = true;
        String dietCurrency =  "USD";
        String documentVersion= "1.0.0";
        Country countryTest = Country.builder()
                .name(name)
                .dietAmount(dietAmount)
                .isActive(isActive)
                .dietCurrency(dietCurrency)
                .documentVersion(documentVersion)
                .build();

        countryRepository.save(countryTest);

        Country expected = countryRepository.getById(countryTest.getId());

        //when
        Optional<Country> test = countryRepository.findCountryByName(name);

        //then
        AssertionsForClassTypes.assertThat(test.isPresent())
                .isTrue();

        AssertionsForClassTypes.assertThat(test.get())
                .isEqualTo(expected);
    }
    @Test
    void findCountryByName_ShouldReturnNull_WhenDoesNotExists(){
        String country = "xyz";

        //when
        Optional<Country> actual = countryRepository.findCountryByName(country);

        //then
        AssertionsForClassTypes.assertThat(actual.isPresent())
                .isFalse();

        assertThatThrownBy(actual::get)
                .isInstanceOf(NoSuchElementException.class);
    }
    @Test
    void findAllCountriesByActive_shouldReturnBelize(){

        //given
        String name = "Belize";
        BigDecimal dietAmount = new BigDecimal(222) ;
        boolean isActive = true;
        String dietCurrency =  "USD";
        String documentVersion= "1.0.0";
        Country countryTest = Country.builder()
                .name(name)
                .dietAmount(dietAmount)
                .isActive(isActive)
                .dietCurrency(dietCurrency)
                .documentVersion(documentVersion)
                .build();

        countryRepository.save(countryTest);

        Country expected = countryRepository.getById(countryTest.getId());

        //when
        List<Country>countries = countryRepository.findAllCountriesByIsActive(true);

        //then
        assertThat(countries.get(0)).isEqualTo(expected);

    }



}

