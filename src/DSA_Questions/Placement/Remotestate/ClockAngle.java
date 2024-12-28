package DSA_Questions.Placement.Remotestate;
//4. Given a clock time in hh:mm format, determine, to the nearest degree, the angle between the hour and the minute hands.

public class ClockAngle {

    public static double clockAngle(String time) {
        String hrStr = time.substring(0, 2);
        String minStr = time.substring(3);
        System.out.println(hrStr + minStr);

        int hour = Integer.parseInt(hrStr);
        int min = Integer.parseInt(minStr);
        System.out.println(hour + min);

        double hourAngle = hour * 30 + min * 0.5;
        double minAngle = hour * 0 + min * 6;

        double angle = Math.abs(hourAngle - minAngle);

        return Math.min(angle, 360-angle);
    }

    public static void main(String[] args) {
        String time = "03:15";
        System.out.println(clockAngle(time));
    }
}