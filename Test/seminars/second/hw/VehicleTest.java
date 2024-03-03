package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car = new Car("Honda", "Civic", 2006);
    Motorcycle motorcycle = new Motorcycle("Yamaha", "Bolt", 2017);


    //    экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }


    //    объект Car создается с 4-мя колесами.

    @Test
    public void testCarHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    //   объект Motorcycle создается с 2-мя колесами.

    @Test
    public void testMotorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    //   объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    //   объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    //    в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    //    машина останавливается (speed = 0).

    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    //    в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    //    мотоцикл останавливается (speed = 0).

    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }

}