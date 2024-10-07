package Lesson_3;

public class Bowl {
    private int foodInBowl;

    public Bowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }

    public void addFoodInBowl(int amount) {
        if (amount > 0) {
            foodInBowl += amount;
        }
    }

    public boolean tryToEat(int needFood) {
        if(foodInBowl >= needFood){
            foodInBowl-=needFood;
            return true;
        }
        return false;
    }

    public int getFoodInBowl() {
        return foodInBowl;
    }
}



