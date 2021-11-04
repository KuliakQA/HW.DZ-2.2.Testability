public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = service.calculate(2450);
        System.out.println(ticket);
    }
}
