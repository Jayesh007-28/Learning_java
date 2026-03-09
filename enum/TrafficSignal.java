enum Siganl{
    RED,
    YELLOW,
    GREEN
}

public class TrafficSignal {
    public static void main(String[] args) {
        Siganl traffic = Siganl.RED;

        switch (traffic) {
            case RED:
                System.out.println("STOP.");
                break;
            
            case YELLOW:
                System.out.println("Ready");
                break;

            case GREEN:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal...!");
                break;
        }
    }
}
