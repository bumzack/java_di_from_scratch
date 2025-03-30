package at.bumzack.levelbrutal;

import at.bumzack.leveleasy.Car;
import at.bumzack.leveleasy.Plane;

public class ClassVacation implements Vacation {

    private final Car car;
    private final Plane plane;

    public ClassVacation(final Car car, final Plane plane) {
        this.car = car;
        this.plane = plane;
    }

    @Override
    public String allVehicles() {
        return String.format("ClassVacation: I am travelling by %s and by %s.", car.vehicleType(), plane.vehicleType());
    }

}
