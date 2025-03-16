package task.oop;

public class Child1 extends Parent {

    public int sumOfTwoNumbers(int a, int b) {
        return a * b;
    }

    public int sumOfStringAndNumber(String str, int num) {
        int numFromString = Integer.parseInt(str);
        int sum = numFromString + num;
        return sum * 2;
    }

    public String returnString(String str) {
        return str.substring(0, 1);
    }


    public void printParent() {
        System.out.println("I am Child1");
    }

    public String concatenateStrings(String str1, String str2) {
        String str3 = str1.concat(str2);
        int halfLength = str3.length() / 2;
        return str3.substring(0, halfLength);
    }
}