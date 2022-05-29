package com.dumi.OCAJSE8PI.C2OperatorsAndStatements;

public class SwitchStatements {

    public static void main(String[] args) {
        int dayOfWeek = 5;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Weekday");
            case 3:
                System.out.println("Friday");
                break;
        }

        String firstName = "Java";
        final String lastName = "JavaC";
        SwitchStatements obj = new SwitchStatements();
        System.out.println(obj.getSortOrder(firstName, lastName));
    }

    private int getSortOrder(String firstName, final String lastName) {
        final String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName:  // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
//            case lastName:  // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5:  // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J':  // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
//                id=15;
//                break;
        }
        return id;
    }

}
