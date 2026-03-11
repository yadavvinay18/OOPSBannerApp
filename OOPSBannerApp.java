
public class OOPSBannerApp {

    // Method to build character pattern map
    static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        map.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });

        return map;
    }

    // Function to render banner
    static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }

            }

            System.out.println(line);
        }

    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);

    }
}