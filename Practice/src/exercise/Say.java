package exercise;

public class Say {
    String[] numbers = {"zer", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};

    public String say(long number) {
    	return numbers[(int) number];
    }
}
