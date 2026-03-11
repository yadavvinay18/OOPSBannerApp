
public class OOPSBannerApp {

    // Static inner class to store character and its pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });

        String[] O1 = O.getPattern();
        String[] O2 = O.getPattern();
        String[] P1 = P.getPattern();
        String[] S1 = S.getPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(O1[i] + " " + O2[i] + " " + P1[i] + " " + S1[i]);
        }
    }
}