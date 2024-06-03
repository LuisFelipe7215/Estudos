
class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;

        for (char c : identifier.toCharArray()) {
            if (Character.isWhitespace(c)) {
                c = '_';
                sb.append(c);
            } else if (c == '-') {
                upperCase = true;
            }

            if (Character.isLetter(c)) {
                if (upperCase) {
                    c = Character.toUpperCase(c);
                    upperCase = false;
                }
                sb.append(c);
            }

            if (Character.isDigit(c)) {
                switch (c) {
                    case '4':
                        c = 'a';
                        break;
                    case '3':
                        c = 'e';
                        break;
                    case '0':
                        c = 'o';
                        break;
                    case '1':
                        c = 'l';
                        break;
                    case '7':
                        c = 't';
                        break;
                }
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
