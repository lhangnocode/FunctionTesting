package Function_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingFeeCalculatorTest {

    // Test cases R1 -> R6: Người ngoài
    @Test
    public void test_R1() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Người ngoài", "08:00", "16:00"));
    }

    @Test
    public void test_R2() {
        assertEquals("8000", ParkingFeeCalculator.calculateFee("Người ngoài", "08:00", "19:00"));
    }

    @Test
    public void test_R3() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "08:00", "23:00"));
    }

    @Test
    public void test_R4() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "21:00", "15:30"));
    }

    @Test
    public void test_R5() {
        assertEquals("8000", ParkingFeeCalculator.calculateFee("Người ngoài", "18:00", "21:30"));
    }

    @Test
    public void test_R6() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "18:00", "23:00"));
    }

    // Test cases R7 -> R12: Sinh viên
    @Test
    public void test_R7() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Sinh viên", "09:00", "16:00"));
    }

    @Test
    public void test_R8() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Sinh viên", "10:00", "20:00"));
    }

    @Test
    public void test_R9() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Sinh viên", "10:00", "23:00"));
    }

    @Test
    public void test_R10() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "15:00"));
    }

    @Test
    public void test_R11() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "19:00"));
    }

    @Test
    public void test_R12() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "23:00"));
    }

    // Test cases R13 -> R18: Giảng viên
    @Test
    public void test_R13() {
        assertEquals("0", ParkingFeeCalculator.calculateFee("Giảng viên", "09:00", "16:00"));
    }

    @Test
    public void test_R14() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Giảng viên", "09:00", "18:00"));
    }

    @Test
    public void test_R15() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Giảng viên", "09:00", "23:00"));
    }

    @Test
    public void test_R16() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "16:00"));
    }

    @Test
    public void test_R17() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "20:00"));
    }

    @Test
    public void test_R18() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "23:00"));
    }

    // Test cases R19 -> R25: Sinh viên (Biên và các trường hợp khác)
    @Test
    public void test_R19() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Sinh viên", "05:29", "09:00"));
    }

    @Test
    public void test_R20() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Sinh viên", "05:30", "09:00"));
    }

    @Test
    public void test_R21() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Sinh viên", "05:31", "09:00"));
    }

    @Test
    public void test_R22() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "22:01"));
    }

    @Test
    public void test_R23() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "22:00"));
    }

    @Test
    public void test_R24() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Sinh viên", "18:00", "21:59"));
    }

    @Test
    public void test_R25() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Sinh viên", "10:00", "14:00"));
    }

    // Test cases R26 -> R32: Giảng viên (Biên và các trường hợp khác)
    @Test
    public void test_R26() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Giảng viên", "05:29", "09:00"));
    }

    @Test
    public void test_R27() {
        assertEquals("0", ParkingFeeCalculator.calculateFee("Giảng viên", "05:30", "09:00"));
    }

    @Test
    public void test_R28() {
        assertEquals("0", ParkingFeeCalculator.calculateFee("Giảng viên", "05:31", "09:00"));
    }

    @Test
    public void test_R29() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "22:01"));
    }

    @Test
    public void test_R30() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "22:00"));
    }

    @Test
    public void test_R31() {
        assertEquals("3000", ParkingFeeCalculator.calculateFee("Giảng viên", "18:00", "21:59"));
    }

    @Test
    public void test_R32() {
        assertEquals("0", ParkingFeeCalculator.calculateFee("Giảng viên", "10:00", "14:00"));
    }

    // Test cases R33 -> R39: Người ngoài (Biên và các trường hợp khác)
    @Test
    public void test_R33() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "05:29", "09:00"));
    }

    @Test
    public void test_R34() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Người ngoài", "05:30", "09:00"));
    }

    @Test
    public void test_R35() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Người ngoài", "05:31", "09:00"));
    }

    @Test
    public void test_R36() {
        assertEquals("Invalid", ParkingFeeCalculator.calculateFee("Người ngoài", "18:00", "22:01"));
    }

    @Test
    public void test_R37() {
        assertEquals("8000", ParkingFeeCalculator.calculateFee("Người ngoài", "18:00", "22:00"));
    }

    @Test
    public void test_R38() {
        assertEquals("8000", ParkingFeeCalculator.calculateFee("Người ngoài","18:00","21:59"));
    }

    @Test
    public void test_R39() {
        assertEquals("5000", ParkingFeeCalculator.calculateFee("Người ngoài", "10:00", "14:00"));
    }
}