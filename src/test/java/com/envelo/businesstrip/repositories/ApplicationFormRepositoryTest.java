package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.*;
import com.envelo.businesstrip.model.enums.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Transactional
class ApplicationFormRepositoryTest {

    @Autowired
    private ApplicationFormRepository applicationFormRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void getById_shouldReturnApplicationForm_whenApplicationFormWithGivenIdExists() {
        //given
        User commissioner = User.builder()
                .id("id")
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .department("department")
                .title("title")
                .supervisor("supervisor")
                .roles(new HashSet<>())
                .build();

        Country albania = Country.builder()
                .name("Albania")
                .dietAmount(BigDecimal.valueOf(12.44D))
                .dietCurrency("Dolary")
                .documentVersion("V1")
                .build();

        Country polska = Country.builder()
                .name("Polska")
                .dietAmount(BigDecimal.valueOf(30))
                .dietCurrency("polskie złote")
                .documentVersion("V1")
                .build();

        Meal meal = Meal.builder()
                .numberOfBreakfasts(1)
                .numberOfDinners(2)
                .numberOfLunches(4)
                .build();

        Place place = Place.builder()
                .city("Warszawa")
                .build();

        Destination first = Destination.builder()
                .checkInDate(LocalDate.now())
                .checkOutDate(LocalDate.now())
                .meal(meal)
                .place(place)
                .country(albania)
                .hotel(Hotel.PROVIDED)
                .build();

        Destination second = Destination.builder()
                .checkInDate(LocalDate.now())
                .checkOutDate(LocalDate.now())
                .meal(meal)
                .place(place)
                .country(polska)
                .hotel(Hotel.PROVIDED)
                .build();

        List<Destination> destinations = new ArrayList<>();
        destinations.add(first);
        destinations.add(second);

        Transport car = Transport.builder()
                .type("car")
                .build();

        Transport plane = Transport.builder()
                .type("plane")
                .build();

        Set<Transport> transports = new HashSet<>();
        transports.add(car);
        transports.add(plane);

        ApplicationForm expected = ApplicationForm.builder()
                .creationDate(LocalDateTime.now())
                .groupNumber(12)
                .commissioner(commissioner)
                .delegationPurpose("purpose")
                .comment("comment")
                .declaredStartDate(LocalDate.MIN)
                .declaredEndDate(LocalDate.MAX)
                .destinations(destinations)
                .transports(transports)
                .build();


        entityManager.persist(commissioner);
        entityManager.persist(albania);
        entityManager.persist(polska);
        entityManager.persist(first);
        entityManager.persist(second);
        entityManager.persist(car);
        entityManager.persist(plane);
        //entityManager.persist(transports);


        //when
        Long applicationFormId = (Long) entityManager.persistAndGetId(expected);
        ApplicationForm actual = applicationFormRepository.getById(applicationFormId);

        //then
        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }


}