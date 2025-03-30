package at.bumzack.leveleasy;

import at.bumzack.levelbrutal.ClassVacation;
import at.bumzack.levelbrutal.Vacation;
import at.bumzack.levelwtf.AuthService;
import at.bumzack.levelwtf.RequestHandler;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReferenceTests {

    // ********************************************************************************
    // ********************************************************************************
    // level 01 - easy
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level01_easy_01() {
        final Vehicle car = new Car();

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level01_easy_02() {
        final Plane plane = new Plane();

        assertThat(plane.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level01_easy_03() {
        final Vehicle car = new Car();

        assertThat(car.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level01_easy_04() {
        final Vehicle plane = new Plane();

        assertThat(plane.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level01_easy_05() {
        final Apple apple = new Apple();

        assertThat(apple.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level01_easy_06() {
        final Fruit apple = new Apple();

        assertThat(apple.fruitName()).isEqualTo("apple");
    }


    // ********************************************************************************
    // ********************************************************************************
    // level 02 - a little bit harder
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level02_a_little_bit_harder_01() {
        final Fruit anApple01 = new Apple();
        final Fruit anApple02 = new Apple();

        assertThat(anApple01).isNotEqualTo(anApple02);

        // just for the sake of completeness
        assertThat(anApple01.fruitName()).isEqualTo("apple");
        assertThat(anApple02.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level02_a_little_bit_harder_02() {
        final Apple anApple01 = new Apple();
        final Apple anApple02 = new Apple();

        assertThat(anApple01).isNotEqualTo(anApple02);

        // just for the sake of completeness
        assertThat(anApple01.fruitName()).isEqualTo("apple");
        assertThat(anApple02.fruitName()).isEqualTo("apple");
    }

    @Test
    public void level02_a_little_bit_harder_03() {
        final Car aCar01 = new Car();
        final Car aCar02 = new Car();

        assertThat(aCar01).isNotEqualTo(aCar02);

        // just for the sake of completeness
        assertThat(aCar01.vehicleType()).isEqualTo("car");
        assertThat(aCar02.vehicleType()).isEqualTo("car");
    }

    @Test
    public void level02_a_little_bit_harder_04() {
        final Plane aPlane01 = new Plane();
        final Plane aPlane02 = new Plane();

        assertThat(aPlane01).isNotEqualTo(aPlane02);

        // just for the sake of completeness
        assertThat(aPlane01.vehicleType()).isEqualTo("plane");
        assertThat(aPlane02.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level02_a_little_bit_harder_05() {
        final Vehicle aPlane01 = new Plane();
        final Vehicle aPlane02 = new Plane();

        assertThat(aPlane01).isNotEqualTo(aPlane02);

        // just for the sake of completeness
        assertThat(aPlane01.vehicleType()).isEqualTo("plane");
        assertThat(aPlane02.vehicleType()).isEqualTo("plane");
    }

    @Test
    public void level02_a_little_bit_harder_06() {
        final Vehicle aPlane = new Plane();
        final Vehicle aCar = new Car();

        assertThat(aPlane).isNotEqualTo(aCar);

        // just for the sake of completeness
        assertThat(aCar.vehicleType()).isEqualTo("car");
        assertThat(aPlane.vehicleType()).isEqualTo("plane");
    }


    // ********************************************************************************
    // ********************************************************************************
    // level 03 - brutal
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level03_brutal_01() {
        final Car car = new Car();
        final Plane plane = new Plane();

        final Vacation aVacation = new ClassVacation(car, plane);
        assertThat(aVacation.allVehicles()).isEqualTo("ClassVacation: I am travelling by car and by plane.");
    }

    // ********************************************************************************
    // ********************************************************************************
    // level 04 - brutal
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level04_brutal_01() {
        final AuthService authService = new AuthService();

        final RequestHandler requestHandler1 = new RequestHandler(authService);
        final RequestHandler requestHandler2 = new RequestHandler(authService);

        assertThat(requestHandler1).isNotEqualTo(requestHandler2);
        assertThat(requestHandler1.getAuthService()).isEqualTo(requestHandler2.getAuthService());

        final var res1 = requestHandler1.handleRequest("bliblablupp", "nope");
        assertThat(res1).isTrue();

        final var res2 = requestHandler1.handleRequest("nope", "bliblablupp");
        assertThat(res2).isTrue();

        final var res3 = requestHandler1.handleRequest("nope", "other nope");
        assertThat(res3).isFalse();
    }
}
