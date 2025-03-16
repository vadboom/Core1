package task.methods;

public class Methods {

    public String stringToLowerCase(String str) {
        return str.toLowerCase();
    }

    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public String sumOfTwoStrings(String a, String b) {
        return a + b;
    }

    public String sumOfStringAndNumber(String str, int num) {
        int numFromString = Integer.parseInt(str);
        int sum = numFromString + num;
        return String.valueOf(sum);
    }

    public boolean compareStringNumberWithInt(String str, int num) {
        int numFromString = Integer.parseInt(str);
        return numFromString <= num;
    }

    public boolean checkBooleans(boolean a, boolean b) {
        return a || b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public String checkArrayEvenOdd(int[] arr) {

        boolean evenNumbers = false;
        boolean oddNumbers = false;


        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers = true;
            } else {
                oddNumbers = true;
            }
            if (evenNumbers && oddNumbers) {
                break;
            }
        }
        if (evenNumbers && oddNumbers) {
            return "Массив четных и нечетных чисел";
        } else if (evenNumbers) {
            return "Массив четных чисел";
        } else {
            return "Массив нечетных чисел";
        }
    }

    public int[] sumArrayElements(int[] arr) {
        int[] result = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result[i] = sum;
        }

        return result;
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public int ageInMonths(int years) {
        return years * 12;
    }

    public int ageInMinutes(int years) {
        return years * 365 * 24;
    }

    public int ageInHours(int years) {
        return years * 365 * 24 * 60;
    }

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }

    public int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    public int countLetterA(String str) {
        int count = 0;
        for (char b : str.toCharArray()) {
            if (b == 'A' || b == 'a') {
                count++;
            }
        }

        return count;
    }

    private int wallet = 1000;

    public String withdraw(int amount) {

        if (amount > wallet) {
            return "Ошибка: недостаточно средств в кошельке.";
        }
        wallet -= amount;
        return "Остаток в кошельке: " + wallet;
    }

    public String deposit(int amount) {

        if (amount > 10000) {
            return "Ошибка: сумма пополнения слишком большая (максимум 10 000 рублей).";
        }
        wallet += amount;
        return "Баланс кошелька : " + wallet;
    }
}