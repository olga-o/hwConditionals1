public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int personsAge = 19;

        if (personsAge >= 18) {
            System.out.println("If person's age is 18 or above the person is considered adult");
        } else {
            System.out.println("If person's age is under 18 he is not yet an adult and has to wait a little");
        }

        //Task 2
        System.out.println("\nTask 2");

        int temperatureOutside = 3;

        if (temperatureOutside < 5) {
            System.out.println("It's cold outside, you have to put on the hat");
            System.out.println("It's " + temperatureOutside + " degrees outside, you have to put on the hat");
        } else {
            System.out.println("It's warm today, good to go without the hat");
            System.out.println("It's " + temperatureOutside + " degrees outside, good to go without the hat");
        }

        //Task 3
        System.out.println("\nTask 3");

        int carSpeed = 40;

        if (carSpeed > 60) {
            System.out.println("In case car speed is " + carSpeed + "km/h, you have to pay the fine");
        } else {
            System.out.println("In case car speed is " + carSpeed + "km/h, you are safe to drive");
        }

        //Task 4
        System.out.println("\nTask 4");

        int age = 50;

        if (age < 2) {
            System.out.println("In case persons' age is " + age + " he doesn't have to go anywhere");
        } else if (age >= 2 && age <= 6) {
            System.out.println("In case persons' age is " + age + " he should go to kinder garden");
        } else if (age >= 7 && age <= 17) {
            System.out.println("In case persons' age is " + age + " he should go to school");
        } else if (age >= 18 && age <= 24) {
            System.out.println("In case persons' age is " + age + " he should go to university");
        } else {
            System.out.println("In case persons' age is " + age + " he should go to work");
        }

        //Task 5
        System.out.println("\nTask 5");

        int childsAge = 17;

        if (childsAge < 5) {
            System.out.println("In case child's age is " + childsAge + ", he is not allowed to go on rides");
        } else if (childsAge >= 5 && childsAge < 14) {
            System.out.println("In case child's age is " + childsAge + ", he is allowed to go on rides only accompanied by an adult");
        } else {
            System.out.println("In case child's age is " + childsAge + ", he is allowed go on rides without adult");
        }

        //Task 6
        System.out.println("\nTask 6");

        int totalCoachCapacity = 102;
        int totalSittingPlacesCount = 60;
        int totalStandingPlacesCapacity = totalCoachCapacity - totalSittingPlacesCount;

        int occupiedSittingPlacesCount = 50;
        int occupiedStandingPlacesCount = 41;
        int occupiedCoachCapacity = occupiedSittingPlacesCount + occupiedStandingPlacesCount;

        if (occupiedCoachCapacity >= totalCoachCapacity) {
            System.out.println("Coach is fully occupied, no available places");
        } else if (occupiedSittingPlacesCount < totalSittingPlacesCount && occupiedStandingPlacesCount < totalStandingPlacesCapacity) {
            System.out.println("Sitting and standing places are available in the coach");
        } else if (occupiedSittingPlacesCount < totalSittingPlacesCount) {
            System.out.println("Only sitting places are available in the coach");
        } else {
            System.out.println("Only standing places are available in the coach");
        }

        //Task 7
        System.out.println("\nTask 7");

        int one = 20;
        int two = 30;
        int three = 10;

        if (one > two) {
            if (one > three) {
                System.out.println("Max value out of " + one + ", " + two + " and " + three + " is " + one);
            } else {
                System.out.println("Max value out of " + one + ", " + two + " and " + three + " is " + three);
            }
        } else {
            if (two > three) {
                System.out.println("Max value out of " + one + ", " + two + " and " + three + " is " + two);
            } else {
                System.out.println("Max value out of " + one + ", " + two + " and " + three + " is " + three);
            }
        }
    }
}