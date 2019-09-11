package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    private SpecialtyRepository specialtyRepository;

    @InjectMocks
    private SpecialitySDJpaService service;

    @Test
    void testDelete() {
        Speciality speciality = new Speciality();
        service.delete(speciality);

        verify(specialtyRepository, times(1)).delete(speciality);
    }

    @Test
    void testDeleteById() {
        service.deleteById(1L);

        verify(specialtyRepository, times(1)).deleteById(1L);

    }
}