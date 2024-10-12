//ASSIGNMENT 8
// MONTH NAME
// Write a function.Return the name of the month of the year given the month number according to the table below make sure you do not put any input or output statements in the function the month number will be passed in and the string containing the name will be returned
public class A8MONTH {

    static String month_name(int month) {
        String result;
        switch (month) {

            case 1:
                result = "january";
                break;
            case 2:
                result = "february";
                break;
            case 3:
                result = "march";
                break;

            case 4:
                result = "april";
                break;
            case 5:
                result = "may";
                break;
            case 6:
                result = "june";
                break;
            case 7:
                result = "july";
                break;
            case 8:
                result = "august";
                break;
            case 9:
                result = "september";
                break;
            case 10:
                result = "october";
                break;
            case 11:
                result = "november";
                break;
            case 12:
                result = "december";
                break;
            default:
                result = "invalid";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String m;
        m = month_name(12);
        System.out.println(m);

        System.out.println(month_name(10));
    }

}
