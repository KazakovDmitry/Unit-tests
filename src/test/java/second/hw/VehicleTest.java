package second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    
    @BeforeEach
    void setUp() {
        car = new Car("Kia", "Ceed", 2011);
        motorcycle = new Motorcycle("Yamaha", "Sport", 2015);        
    }
    
    @Test
    @DisplayName("Проверка, что экземпляр объекта Car также является экземпляром транспортного средства")
    void carInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("проверка, что Car создается с 4-мя колесами")
    void carWith4Wheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("проверка, что Motocycle создается с 2-мя колесами")
    void motoWith2Wheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Проверка, что объект Car развивает скорость 60")
    void carSpeed60(){
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка, что объект Motocycle развивает скорость 75")
    void motoSpeed75() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("проверить, что в режиме парковки машина останавливается (speed = 0)")
    void carParkSpeed0() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("проверить, что в режиме парковки мотоцикл останавливается (speed = 0)")
    void motoParkSpeed0() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}