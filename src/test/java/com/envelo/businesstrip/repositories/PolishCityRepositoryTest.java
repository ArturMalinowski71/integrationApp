package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.PolishCity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PolishCityRepositoryTest {
    @Autowired
    private PolishCityRepository polishCityRepository;

    @AfterEach
    void tearDown() {
        polishCityRepository.deleteAll();
    }
    @Test
    void should_return_list_of_polish_cities_Starting_With_Wa() {

        //given
        String name = "Warszawa";
        PolishCity polishCity = PolishCity.builder().name(name).build();

        polishCityRepository.save(polishCity);

        //PolishCity expected = polishCityRepository.getById(polishCity.getId());

        //when
        List<PolishCity> actual = polishCityRepository.findAllByNameStartingWithIgnoreCase("war");

        //then
        assertThat(actual.get(0)).isEqualTo(polishCity);
    }
}