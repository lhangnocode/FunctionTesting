package Function_testing;

public class ParkingFeeCalculator {
    public ParkingFeeCalculator() {
    }

    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public static String calculateFee(String userType, String startTime, String endTime) {
        // Thoi gian co format "HH:MM"
        int start = toMinutes(startTime);
        int end = toMinutes(endTime);

        int open = 5 * 60 + 30;
        int close = 22 * 60;

        if (start < open || end > close || start >= end) {
            return "Invalid";
        }

        //* Gửi trước 17h
        boolean before17Start = start < 17 * 60;
        //* Lấy trước 17h
        boolean before17End = end < 17 * 60;

        return switch (userType) {
            case "Người ngoài" -> {
                if (before17Start && before17End) yield "5000";
                else yield "8000";
            }
            case "Sinh viên" -> {
                if (before17Start && before17End) yield "3000";
                else yield "5000";
            }
            case "Giảng viên" -> {
                if (before17Start && before17End) yield "0";
                else yield "3000";
            }
            default -> "Invalid";
        };    
    }
}
