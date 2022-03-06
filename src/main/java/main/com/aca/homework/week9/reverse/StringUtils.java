package main.com.aca.homework.week9.reverse;

public class StringUtils {
    public static String reverse(String string){
        if(string == null) throw new NullPointerException();
        if(string.length() == 1) return string;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length(); i > 0; i--) {
            stringBuilder.append(string.substring(i-1,i));
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        reverse("t");
    }
}
