package at.bumzack.leveleasy;

import at.bumzack.di.DependencyInjectionService;
import at.bumzack.exception.AmbiguousBeanException;
import at.bumzack.exception.BeanNotFoundException;
import at.bumzack.exception.ClassCreationException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


// BEFORE you begin
// estimation for implementation in hours:
// actual time spend for implementation in hours:

class Level_01_Easy_Tests {

    private final DependencyInjectionService dependencyInjectionService = DependencyInjectionService.getInstance();

    @Test
    public void level01_easy_01() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vehicle car = (Vehicle) dependencyInjectionService.beanByName("car");

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level01_easy_02() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Plane plane = (Plane) dependencyInjectionService.beanByName("plane");

        assertThat(plane.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level01_easy_03() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vehicle car = (Vehicle) dependencyInjectionService.beanByName("car");

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level01_easy_04() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vehicle plane = (Vehicle) dependencyInjectionService.beanByName("plane");

        assertThat(plane.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level01_easy_05() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Apple apple = (Apple) dependencyInjectionService.beanByName("apple");

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_06() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Fruit apple = (Fruit) dependencyInjectionService.beanByName("apple");

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_07_by_type_ok() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Fruit apple = (Fruit) dependencyInjectionService.beanByType(Fruit.class);

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_08_by_type_ok() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Fruit apple = (Fruit) dependencyInjectionService.beanByType(Apple.class);

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_09_by_type_ok() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Apple apple = (Apple) dependencyInjectionService.beanByType(Apple.class);

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_10_by_type_ok() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Vehicle car = (Vehicle) dependencyInjectionService.beanByType(Car.class);

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level01_easy_11_by_type_ok() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Car car = (Car) dependencyInjectionService.beanByType(Car.class);

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    // ************************************************************************
    // additional tests for exceptions
    // ************************************************************************
    @Test
    public void level01_easy_10() {
        final BeanNotFoundException exception = assertThrows(BeanNotFoundException.class, () -> {
            final Fruit pear = (Fruit) dependencyInjectionService.beanByName("pear");
        });
    }

    @Test
    public void level01_easy_11_ambiguous_type() {
        final AmbiguousBeanException exception = assertThrows(AmbiguousBeanException.class, () -> {
            final Vehicle aVehicle = (Vehicle) dependencyInjectionService.beanByType(Vehicle.class);
        });
    }

}
