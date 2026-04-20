package ru.okulova.codereview.house;

public class House {
    private int floors;

    public House() {
        this.floors = 0;
    }

    public House(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    //FIX_ME: переименуем, чтобы имя метода стало осмысленным
    //public String word(int floors) {
    private String getFloorSuffix(int floors) {
        //FIX_ME: переделаем для корректности вывода
//        if (floors % 10 == 1 && floors % 100 != 11) {
//            return "этажом";
//        } else {
//            return "этажами";
//        }
//    }
        if (floors % 10 == 1 && floors % 100 != 11) {
            return "этаж";
        } else if (floors % 10 >= 2 && floors % 10 <= 4 && (floors % 100 < 10 || floors % 100 >= 20)) {
            return "этажа";
        } else {
            return "этажей";
        }
    }

    @Override
    public String toString() {
        //FIX_ME: метод переименован
       // return "Дом с " + floors + " " + word(floors);
        return "Дом с " + floors + " " + getFloorSuffix(floors);
    }
}