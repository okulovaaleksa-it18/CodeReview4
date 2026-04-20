package CodeReview4.ru.okulova.codereview.house;

public class HouseUpdate {
  private final int floors; // Устанавливаем значение единожды т.к. этажность дома не меняется.

  public HouseUpdate(int floors) {
    this.floors = floors;
  }

  public int getFloors() {
    return floors;
  }

  //FIX_ME: переименуем, чтобы имя метода стало осмысленным
  //public String word() {
  private String getFloorSuffix() {
    //FIX_ME: переделаем для корректности вывода
//        if (floors % 10 == 1 && floors % 100 != 11) {
//            return "этажом";
//        } else {
//            return "этажами";
//        }
    int f = floors;
    if (f % 10 == 1 && f % 100 != 11) {
      return "этаж";
    } else if (f % 10 >= 2 && f % 10 <= 4 && (f % 100 < 10 || f % 100 >= 20)) {
      return "этажа";
    } else {
      return "этажей";
    }
  }

  @Override
  public String toString() {
    //FIX_ME: метод переименован
    //return "Дом с " + floors + " " + word();
    return "Дом с " + floors + " " + getFloorSuffix();
  }
}
