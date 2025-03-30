package at.bumzack.leveleasy;

import at.bumzack.di.DependencyInjectionService;
import at.bumzack.exception.AmbiguousBeanException;
import at.bumzack.exception.BeanNotFoundException;
import at.bumzack.exception.ClassCreationException;
import at.bumzack.levelbrutal.ClassVacation;
import at.bumzack.levelbrutal.Vacation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEFORE you begin
// estimation for implementation in hours:
// actual time spend for implementation in hours:

class Level_03_Brutal_Tests {

    private final DependencyInjectionService dependencyInjectionService = DependencyInjectionService.getInstance();

    // ********************************************************************************
    // ********************************************************************************
    // level 03 - brutal
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level03_brutal_01() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vacation aVacation = (Vacation) dependencyInjectionService.beanByName("classVacation");
        assertThat(aVacation.allVehicles()).isEqualTo("ClassVacation: I am travelling by car and by plane.");
    }

    @Test
    public void level03_brutal_02() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vacation aVacation = (Vacation) dependencyInjectionService.beanByType(ClassVacation.class);
        assertThat(aVacation.allVehicles()).isEqualTo("ClassVacation: I am travelling by car and by plane.");
    }

    @Test
    public void level03_brutal_03() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vacation aVacation = (Vacation) dependencyInjectionService.beanByType(Vacation.class);
        assertThat(aVacation.allVehicles()).isEqualTo("ClassVacation: I am travelling by car and by plane.");
    }
}
