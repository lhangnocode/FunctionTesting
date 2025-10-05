package Control_testing;
import org.junit.jupiter.api.Test;

import Function_testing.ParkingFeeCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlTesting {
    
    @Test
    public void test_R1() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "04:00", "8:00"));
    }

    @Test
    public void test_R2() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Người ngoài", "12:00", "15:00"));
    }

    @Test
    public void test_R3() {
        assertEquals("8000", ParkingFeeCalculator.calculateFee("Người ngoài", "12:00", "19:00"));
    }

    @Test
    public void test_R4() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Sinh viên", "12:00", "15:00"));
    }

    @Test
    public void test_R5() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Sinh viên", "12:00", "19:00"));
    }

    @Test
    public void test_R6() {
        assertEquals("0", ParkingFeeCalculator.calculateFee("Giảng viên", "12:00", "15:00"));
    }

    @Test
    public void test_R7() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Giảng viên", "12:00", "19:00"));
    }

    @Test
    public void test_R8() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Du học sinh", "08:00", "10:00"));
    }

    
}
