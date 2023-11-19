package lesson27;

public class Tiger {
    void eat(String meal) {
        if (!meal.equals("meat")) {
            throw new NotMeatException("Tiger doesn't eat " + meal);
        }
        System.out.println("Tiger eats " + meal);
    }

    void drink(String liquid) throws NotWaterException {
        if (!liquid.equals("water")) {
            throw new NotWaterException("Tiger doesn't drink " + liquid);
        }
        System.out.println("Tiger drinks " + liquid);
    }
}