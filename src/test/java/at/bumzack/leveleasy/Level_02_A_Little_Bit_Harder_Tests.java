package at.bumzack.leveleasy;

import at.bumzack.di.DependencyInjectionService;
import at.bumzack.exception.AmbiguousBeanException;
import at.bumzack.exception.BeanNotFoundException;
import at.bumzack.exception.ClassCreationException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEFORE you begin
// estimation for implementation in hours:
// actual time spend for implementation in hours:

class Level_02_A_Little_Bit_Harder_Tests {

    private final DependencyInjectionService dependencyInjectionService = DependencyInjectionService.getInstance();

    @Test
    public void level02_a_little_bit_harder_01() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Fruit anApple01 = (Fruit) dependencyInjectionService.beanByName("apple");
        final Fruit anApple02 = (Fruit) dependencyInjectionService.beanByName("apple");

        assertThat(anApple01).isNotEqualTo(anApple02);

        // just for the sake of completeness
        assertThat(anApple01.fruitName()).isEqualTo("apple");
        assertThat(anApple02.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level02_a_little_bit_harder_01_by_type() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Fruit anApple01 = (Fruit) dependencyInjectionService.beanByType(Fruit.class);
        final Fruit anApple02 = (Fruit) dependencyInjectionService.beanByType(Fruit.class);

        assertThat(anApple01).isNotEqualTo(anApple02);

        // just for the sake of completeness
        assertThat(anApple01.fruitName()).isEqualTo("apple");
        assertThat(anApple02.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level02_a_little_bit_harder_02() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final Apple anApple01 = (Apple) dependencyInjectionService.beanByType(Apple.class);
        final Apple anApple02 = (Apple) dependencyInjectionService.beanByType(Apple.class);

        assertThat(anApple01).isNotEqualTo(anApple02);

        // just for the sake of completeness
        assertThat(anApple01.fruitName()).isEqualTo("apple");
        assertThat(anApple02.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level03_a_little_bit_harder_02() {
        final Car aCar01 = new Car();
        final Car aCar02 = new Car();

        assertThat(aCar01).isNotEqualTo(aCar02);

        // just for the sake of completeness
        assertThat(aCar01.vehicleType()).isEqualTo("car");
        assertThat(aCar02.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level03_a_little_bit_harder_03() {
        final Plane aPlane01 = new Plane();
        final Plane aPlane02 = new Plane();

        assertThat(aPlane01).isNotEqualTo(aPlane02);

        // just for the sake of completeness
        assertThat(aPlane01.vehicleType()).isEqualTo("plane");
        assertThat(aPlane02.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level03_a_little_bit_harder_04() {
        final Vehicle aPlane01 = new Plane();
        final Vehicle aPlane02 = new Plane();

        assertThat(aPlane01).isNotEqualTo(aPlane02);

        // just for the sake of completeness
        assertThat(aPlane01.vehicleType()).isEqualTo("plane");
        assertThat(aPlane02.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level03_a_little_bit_harder_05() {
        final Vehicle aPlane = new Plane();
        final Vehicle aCar = new Car();

        assertThat(aPlane).isNotEqualTo(aCar);

        // just for the sake of completeness
        assertThat(aCar.vehicleType()).isEqualTo("car");
        assertThat(aPlane.vehicleType()).isEqualTo("plane");
    }
}
