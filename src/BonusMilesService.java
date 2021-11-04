public class BonusMilesService {
    public int calculate(int ticket){
        int miles = 20;  // 20 руб = 1 миля
        int bonus = ticket / miles;  // расчет миль

        return bonus;
    }

}
