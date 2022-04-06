package chapter_four;

public class PrintCodeword
{
    private int digit = 0;
    private char character = 'A';
    private static PrintCodeword instance = new PrintCodeword();

    public static PrintCodeword getInstance(){ return instance; }

    private PrintCodeword() {}


    public void printCode()
    {
        System.out.println(character + "" + digit);
        for (int i = 0; i < 25; i++)
            System.out.println(getNextChar() + ""  + getNextDigit());
    }


    private int getNextDigit()
    {
        digit += 1;
        if (digit > 9)
        {
            digit = 0;
            return digit;
        }
        return digit;
    }

    private char getNextChar()
    {
        character = (char) (character + 1);
        if (character > 'Z')
            return character = 'A';
        return character;
    }


    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public static void setInstance(PrintCodeword instance) {
        PrintCodeword.instance = instance;
    }
}
