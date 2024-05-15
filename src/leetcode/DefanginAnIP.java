package leetcode;

public class DefanginAnIP {

    private String defangIPaddr(String address) {
        CharSequence charSequence = address.replace(".", "[.]");
        return charSequence.toString();
    }

    public static void main(String[] args) {
        DefanginAnIP defanginAnIP = new DefanginAnIP();
        System.out.println(defanginAnIP.defangIPaddr("127.0.0.0"));
    }

}
