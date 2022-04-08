package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Transport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@DataJpaTest
@Transactional
class TransportRepositoryTest {

    @Autowired
    private TransportRepository transportRepository;

    @Test
    void findTransportByType_ShouldReturnNull_WhenDoesNotExists() {
        //given
        String type = "plane";

        //when
        Optional<Transport> actual = transportRepository.findTransportByType(type);

        //then
        assertThat(actual.isPresent())
                .isFalse();

        assertThatThrownBy(actual::get)
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void findTransportByType_ShouldReturnTransport_WhenExists() {
        //given
        String type = "car";
        Transport transport = Transport.builder().type(type).build();

        transportRepository.save(transport);

        Transport expected = transportRepository.getById(transport.getId());

        //when
        Optional<Transport> actual = transportRepository.findTransportByType(type);

        //then
        assertThat(actual.isPresent())
                .isTrue();

        assertThat(actual.get())
                .isEqualTo(expected);
    }

}