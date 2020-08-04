public class NextDayCaculator {
    public static int[] findNextDay(int day, int month, int year) {
        if (day < getDayOfMonth(month, year)) {
            day++;
        }else if (day == getDayOfMonth(month, year)){
            day = 1;
            if (month < 12) {
                month++;
            }else {
                month = 1;
                year++;
            }
        }

         int[] day_month_year = {year, month, day};
        return day_month_year;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeap = false;
        boolean isDividedBy4 = year % 4 == 0;
        if (isDividedBy4) {
            boolean isDividedBy100 = year % 100 == 0;
            if (isDividedBy100) {
                boolean isDividedBy400 = year % 400 == 0;
                if (isDividedBy400) {
                    isLeap = true;
                }
            }else {
                isLeap = true;
        }
        }
        return isLeap;
    }



   private static int getDayOfMonth(int month, int year) {
        int dayOfMonth = 0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dayOfMonth = 31;
                    break;
                case 2:
                    if (isLeapYear(year))
                    dayOfMonth = 29;
                    else dayOfMonth = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dayOfMonth = 30;
                    break;
                default:
                    System.out.println("Đây ko phải tháng của năm");
                    break;
            }

        return dayOfMonth;
   }


}
