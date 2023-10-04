public class Main {
    public static void main(String[] args) {
        //Перевіряє чи є символ цифрою
        System.out.println(Character.isDigit('X'));

        //Завдання #2

        String unicodeHex1 = "1F624"; // Код "U+1F624" без префикса "U+"
        String unicodeHex2 = "263B";
        String unicodeHex3 = "1F608";

        int codePoint1 = Integer.parseInt(unicodeHex1, 16);
        int codePoint2 = Integer.parseInt(unicodeHex2, 16);
        int codePoint3 = Integer.parseInt(unicodeHex3, 16);

        String emoji1 = new String(Character.toChars(codePoint1));
        String emoji2 = new String(Character.toChars(codePoint2));
        String emoji3 = new String(Character.toChars(codePoint3));

        System.out.println(emoji1);
        System.out.println(emoji2);
        System.out.println(emoji3);
    }
}