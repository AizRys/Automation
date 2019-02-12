
public class Exercises{
    public static void main(String[]args){
        Exercises e = new Exercises();
        System.out.println(e.readUntilDot("I am Aizat not to read"));
    }

    int readUntilDot(String s) {
        int spaces = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }

            if (chars[i] == '.') {
                return spaces;
            }
        }

        return spaces;
    }

    void readChars(String a) {
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                return;
            }

        }

    }
}