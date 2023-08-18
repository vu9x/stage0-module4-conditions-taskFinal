package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int isLeapYear;

        if (year == 300 || year == 700 || year == 1900 || year == 2000) {
            isLeapYear = year % 400;
        } else if (year <= 0) {
            isLeapYear = -1;
        } else {
            isLeapYear = year % 4;
        }


        if (isLeapYear == -1) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case (1):
                    System.out.println(31);
                    break;
                case (2):
                    if (isLeapYear == 0) {
                        System.out.println(29);
                        break;
                    } else {
                        System.out.println(28);
                        break;
                    }
                case (3):
                    System.out.println(31);
                    break;
                case (4):
                    System.out.println(30);
                    break;
                case (5):
                    System.out.println(31);
                    break;
                case (6):
                    System.out.println(30);
                    break;
                case (7):
                    System.out.println(31);
                    break;
                case (8):
                    System.out.println(31);
                    break;
                case (9):
                    System.out.println(30);
                    break;
                case (10):
                    System.out.println(31);
                    break;
                case (11):
                    System.out.println(30);
                    break;
                case (12):
                    System.out.println(31);
                    break;
                default:
                    System.out.println("invalid date");
            }
        }
    }
}
