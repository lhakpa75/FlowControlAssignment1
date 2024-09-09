import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 60;
        int year = 2024;
        System.out.println("Let, \na = 20,\nb = 40,\nc = 60,\nyear = 2024");
//=========================================================================================================================
        System.out.println("1. Maximum among two numbers (a & b).");
        if (a > b) {
            System.out.println("-> a: " + a + " is the maximum number");
        } else if (b > a) {
            System.out.println("-> b: " + b + " is the maximum number");
        }
//=========================================================================================================================
        System.out.println("2. Maximum among three numbers (a, b & c).");
        if (a > b && a > c) {
            System.out.println("-> a: " + a + " is the maximum number");
        } else if (b > a && b > c) {
            System.out.println("->b: " + b + " is the maximum number");
        } else {
            System.out.println("-> c: " + c + " is the maximum number");
        }
//=========================================================================================================================
        System.out.println("3. Check whether a given numbers is divisible by 3 or not");
        if (a % 3 == 0) {
            System.out.println("-> a: " + a + " is a divisible by 3");
        } else if (b % 3 == 0) {
            System.out.println("-> b: " + b + " is a divisible by 3");
        } else if (c % 3 == 0) {
            System.out.println("-> c: " + c + " is a divisible by 3");
        } else {
            System.out.println("-> Non of them is a divisible by 3");
        }
//=========================================================================================================================
        System.out.println("4. Check whether a given numbers all is divisible by 5 or not");
        if (a % 5 == 0 && b % 5 == 0 && c % 5 == 0) {
            System.out.println("-> Yes! a, b & c are divisible by 5");
        } else {
            System.out.println("-> Non of them are a divisible by 5");
        }
//=========================================================================================================================
        System.out.println("5. Check whether a given numbers all is divisible by 11 or not");
        if (a % 11 == 0 && b % 11 == 0 && c % 11 == 0) {
            System.out.println("-> Yes! a, b & c are divisible by 11");
        } else {
            System.out.println("-> Non of them are a divisible by 11");
        }
//=========================================================================================================================
        System.out.println("6. Check whether a given number are even or odd.");
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("-> a, b & c are even numbers");
        } else {
            System.out.println("-> a, b & c are odd numbers");
        }
//=========================================================================================================================
        System.out.println("7. Check whether a year is leap year or not.");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("-> Year: " + year + " is leap year");
        } else {
            System.out.println("-> Year: " + year + " is not a leap year");
        }
//=========================================================================================================================
        System.out.println("8. Check whether a given input is digit or not not.\nPlease type a digit: ");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if (digit <= 9) {
            System.out.println("-> Yes, it is a digit");
        } else {
            System.out.println("-> No, it is not a digit");
        }
//=========================================================================================================================
        System.out.println("9. Check whether a given input an alphabet not not.\nPlease type an alphabet: ");
        char alphabet = scanner.next().charAt(0);
        if (alphabet >='a' && alphabet >= 'z') {
            System.out.println("-> Yes, it is an alphabet");
        } else {
            System.out.println("-> No, it is not an alphabet");
        }
//=========================================================================================================================
        System.out.println("10. Check whether a given input Digit or Alphabets or Special Character.\nPlease type an alphabet/digit/Special Character: ");
        char specialCharacter = scanner.next().charAt(0);
        if (alphabet >='a' && alphabet >= 'z') {
            System.out.println("-> It is an alphabet");
        } else if (digit >= 0 && digit <= 9) {
            System.out.println("->It is a digit");
        } else {
            System.out.println("-> It is most likely a special character");
        }
//=========================================================================================================================
        System.out.println("11. Check whether a given given number is a positive or negative number");
        boolean isPositive = scanner.nextInt() > 0;
        if (isPositive) {
            System.out.println("-> Yes, it is a positive number");
        } else {
            System.out.println("-> It is  a negative number");
        }
//=========================================================================================================================
        System.out.println("12. Convert temperature from Celsius to Fahrenheit");
        double celsius = 75;
        if (celsius >= -273.15) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "ºC is equal to " + fahrenheit + "ºF");
        } else {
            System.out.println("Invalid");
        }
//=========================================================================================================================
        System.out.println("13. Convert temperature from Celsius to Fahrenheit");
        double fahrenheit = 75;
        if (fahrenheit >= -459.67) {
            double celsius1 = (fahrenheit -32 ) * 5/9;
            System.out.println(fahrenheit + "ºF is equal to " + celsius1 + "ºC");
        } else {
            System.out.println("Invalid");
        }
//=========================================================================================================================
        System.out.println("14. Check whether a character is a vowel or consonant");
        char character = 'A';
        character =Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("-> " + character + " is a vowel");
        } else {
            System.out.println("-> " + character + " is not a consonant");
        }
//=========================================================================================================================
        System.out.println("15. Check whether character is uppercase or lowercase");
        if (character >= 'a' && character <= 'z') {
            System.out.println("-> " + character + " is in lower case");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("-> " + character + " is in upper case");
        } else {
            System.out.println("-> Not a valid character");
        }
//=========================================================================================================================
        System.out.println("16. Print week day for a given input week");
        int dayOfWeek = 7;
        if (dayOfWeek == 1) {
            System.out.println("-> " + dayOfWeek + " is a Sunday");
        } else if (dayOfWeek == 2) {
            System.out.println("-> " + dayOfWeek + " is a Monday");
        } else if (dayOfWeek == 3) {
            System.out.println("-> " + dayOfWeek + " is a Tuesday");
        } else if (dayOfWeek == 4) {
            System.out.println("-> " + dayOfWeek + " is a Wednesday");
        } else if (dayOfWeek == 5) {
            System.out.println("-> " + dayOfWeek + " is a Thursday");
        } else if (dayOfWeek == 6) {
            System.out.println("-> " + dayOfWeek + " is a Friday");
        }  else if (dayOfWeek == 7) {
            System.out.println("-> " + dayOfWeek + " is a Saturday");
        } else {
            System.out.println("-> Not a valid day");
        }
//=========================================================================================================================
        System.out.println("17. Print number of days for a given input month");
        int month = 2;
        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            days = 28;
        } else {
            System.out.println("-> Invalid month! Please enter a month between 1 and 12.");
            return;  // Exit if the month is invalid
        }
        System.out.println("-> Month " + month + " has " + days + " days.");
//=========================================================================================================================
        System.out.println("18. Check whether a triangle is an equilateral, isosceles, or scalene triangle");
        double x = 18;
        double y = 18;
        double z = 18;
        if (x + y > z && x + z > y && y + z > x) {
            // Check the type of triangle
            if (x == y && y == z) {
                System.out.println("The triangle is equilateral.");
            } else if (x == y || x == z || y == z) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The lengths do not form a triangle.");
        }
//=========================================================================================================================
        System.out.println("19. Check whether a a person is valid for vote or not");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
//=========================================================================================================================
        System.out.println("20. Check Division on the basis of marks obtained by students.\n" +
                "Percentage >= 60% : Division 1, Percentage >= 45% : Division 2, Percentage >= 30% : Division 3, Percentage < 30% : Fail");
        double percentage = scanner.nextDouble();
        if (percentage >= 60) {
            System.out.println(percentage + "% : Division 1");
        } else if (percentage >= 45) {
            System.out.println(percentage + "% : Division 2");
        } else if (percentage >= 30) {
            System.out.println(percentage + "% : Division 3");
        }  else {
            System.out.println(percentage + "% : Fail ");
        }
//=========================================================================================================================
        System.out.println("Calculate percentage and grade of students on the basis of marks obtained in 5 subjects\n" +
                " Maths, Physics, Chemistry, English and Hindi. Marks of subject is taken as an input:");
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for English: ");
        double english = scanner.nextDouble();

        System.out.print("Enter marks for Hindi: ");
        double hindi = scanner.nextDouble();

        double totalMarks = maths + physics + chemistry + english + hindi;
        double percent = (totalMarks / 500) * 100;

        char grade;
        if (percent >= 90) {
            grade = 'A';
        } else if (percent >= 80) {
            grade = 'B';
        } else if (percent >= 70) {
            grade = 'C';
        } else if (percent >= 60) {
            grade = 'D';
        } else if (percent >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Percent: %.2f%%\n", percent);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}




