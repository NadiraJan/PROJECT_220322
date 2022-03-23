package be.intecbrussel;

public class exercise {             //throw
    static void checkAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {       //finally
  checkAge(20);
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);

        } catch (Exception exception){
            System.out.println("Something went wrong");
        } finally {
            System.out.println(" try catch is finished");
        }

       try {
            int[] myNumbers = {1, 2, 3};          //try catch
            System.out.println(myNumbers[10]);
        }catch (Exception exception){
            System.out.println("smth is wrong");
        }


        }

    }




