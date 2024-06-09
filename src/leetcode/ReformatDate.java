package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public String reformatDate(String date) {
        System.out.println(getMonth(date.substring(4, 6)));
        if (date.length() == 12) {
            return date.substring(8) + "-" + getMonth(date.substring(4, 7)) + "-" + "0" +  date.charAt(0);
        }
        return date.substring(9) + "-" + getMonth(date.substring(5, 8)) + "-" + date.substring(0, 2);
    }

    public String getMonth(String month) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        return months.get(month);
    }

    public static void main(String[] args) {
        System.out.println(new ReformatDate().reformatDate("6th Jun 1933"));//2052-10-10 "20th Oct 2052"
    }

}
