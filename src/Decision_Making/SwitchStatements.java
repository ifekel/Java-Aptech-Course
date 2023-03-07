package Decision_Making;

public class SwitchStatements {
    public static void main(String[] args) {
        /*
        int choice = 2;

        switch (choice) {
            case 1: {
                System.out.println("Addition");
                break;
            }
            case 2: {
                System.out.println("Subtraction");
                break;
            }
            case 3: {
                System.out.println("Multiplication");
                break;
            }
            case 4: {
                System.out.println("Division");
                break;
            }
            default: {
                System.out.println("Invalid Choice");
                break;
            }
        }

        // Example 2
        // Months and their dates
        int month = 8;
        int numDays = 0;
        int year = 2001;

        switch (month)  {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                 break;
            case 2:
                if (year % 4 == 0) {
                    numDays = 29;
                }
                else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid Month");
        }

        System.out.println("Month: " + month);
        System.out.println("Number of Days: " + numDays);


        // Example 3
        // Getting the day of the week
        String day = "Wednesday";

        switch (day) {
            case "Sunday" -> {
                System.out.println("Sunday is the first day of the week");
            }
            case "Monday" -> {
                System.out.println("Monday is the second day of the week");
            }
            case "Tuesday" -> {
                System.out.println("Tuesday is the third day of the week");
            }
            case "Wednesday" -> {
                System.out.println("Wednesday is the fourth day of the week");
            }
            case "Thursday" -> {
                System.out.println("Thursday is the fifth day of the week");
            }
            case "Friday" -> {
                System.out.println("Friday is the sixth day of the week");
            }
            case "Saturday" -> {
                System.out.println("Saturday is the seventh day of the week");
            }
            default -> {
                System.out.println("Invalid day");
            }
        }

        */

        enum Card {
            Spade, Diamond, Heart, Club
        }

        Card card = Card.Club;

        switch (card) {
            case Spade -> {
                System.out.println("Spade");
            }
            case Heart -> {
                System.out.println("Heart");
            }
            case Club -> {
                System.out.println("Club");
            }
            case Diamond -> {
                System.out.println("Diamond");
            }
        }


        // Nested Switch Statements
        String day = "Monday";
        String hour = "pm";

        switch (day) {
            case "Sunday" -> {
                System.out.println("Sunday is a holiday");
                switch (hour) {
                    case "am" -> {
                        System.out.println("Good Morning");
                    }
                    case "pm" -> {
                        System.out.println("Good Evening");
                    }
                }
            }
            case "Monday" -> {
                System.out.println("Monday is a working day");
                switch (hour) {
                    case "am" -> {
                        System.out.println("Good Morning");
                    }
                    case "pm" -> {
                        System.out.println("Good Evening");
                    }
                }
            }
            default -> {
                System.out.println("Invalid Day");
            }
        }
    }
}
