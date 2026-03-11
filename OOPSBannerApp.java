
public class OOPSBannerApp {

    // Method to generate O pattern
    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate P pattern
    static String[] getP() {
        return new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    // Method to generate S pattern
    static String[] getS() {
        return new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + " " + O[i] + " " + P[i] + " " + S[i]);
        }

    }

}