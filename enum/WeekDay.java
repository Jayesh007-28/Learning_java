enum Day {
    MONDAY,
    TUSEDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class WeekDay {
    public static void main(String[] args) {
        
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It is satrt of the week.");
                break;

            case TUSEDAY:
                System.out.println("It is 2nd Day of week.");
                break;

            case WEDNESDAY:
                System.out.println("It is 3rd Day of week.");
                break;

            case THURSDAY:
                System.out.println("It is 4th Day of week.");
                break;

            case FRIDAY:
                System.out.println("It is 5th Day of week.");
                break;

            case SATURDAY:
                System.out.println("It is week end  of");
                break;

            case SUNDAY:
                System.out.println("It is End of week");
                break;
        
            default:
                System.out.println("Invalid day.......!");
                break;
        }
    }
}
