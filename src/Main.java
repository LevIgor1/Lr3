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

        //Завдання 3
        int currentYear = 2023;

        String MyDate = "Четверг, 21 Вересня 2022";
        System.out.println(MyDate);
        String[] MyStringDate = MyDate.split(" ");
        String MyStringYear = MyStringDate[3];
        boolean check = false;
        for (char c : MyStringYear.toCharArray()){
            if (Character.isDigit(c)){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }
        if (check){
            int MyYear = Integer.parseInt(MyStringYear);
            if (MyYear == currentYear){
                System.out.println("Ця дата належить поточному року");
            }
            else{
                System.out.println("Ця дата не належить поточному року!");
            }
        }
        else {
            System.out.println("Рядок не є числом");
        }
    }
}