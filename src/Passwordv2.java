void main() {
    var password = IO.readln("Shkruaj passwordin: ");
    int length = password.length();
    String lower = password.toLowerCase();
    boolean hasUpper = !password.equals(lower);
    String upper = password.toUpperCase();
    boolean hasLower = !password.equals(upper);
    boolean isCommon = lower.equals("123456") || lower.equals("password") || lower.equals("qwerty");
    if (isCommon || length < 8) {
        IO.println("Fjalkalimi ehste i dobet");
    } else {
        int score = 0;
        if (length >= 12) {
            score++;
        }
        if (hasUpper) {
            score++;
        }
        if (hasLower) {
            score++;
        }
        String level = switch(score) {
            case 0 ,1 -> "I dobet" ;
            case 2 -> "I mesem";
            case 3 -> "I forte";
            default -> "I panjohur";
        };
      //  IO.println("Pike: " + score + "nga 3" + level ".");
        System.out.printf("Pike: %d nga 3. %s.%n", score, level);
    }
}