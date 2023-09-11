public class StringProgram {

        public static void main(String[] args) {

            String name = "Jack Parker";
            name = name.toLowerCase();
            System.out.println(name);


            String text = "To My     Friend";
            text = text.replace(" ", "_");
            System.out.println(text);


            String letter = "Dear <|name|>, Thanks a lot!";
            letter = letter.replace("<|name|>", "Sachin");
            System.out.println(letter);


            String myString = "This string contains double and  triple spaces";
            System.out.println(myString.indexOf("  "));
            System.out.println(myString.indexOf("   "));


            String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
            System.out.println(myLetter);

        }
    }


