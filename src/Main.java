import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);//Объект класса Scanner для считывания введенной строки
        System.out.println("Input:");
        String input = scanner.nextLine();//пользователь вводит строку, считываем введенную строку, сохраняем в переменную input
        String output = calc(input);
        System.out.println("Output:");
        System.out.println(output);
    }
    public static String calc(String input) throws Exception{
        String[] arr=input.split(" ");
        if(arr.length !=3){
            throw new Exception("Неверный формат ввода (Пример: 5 + 10)");
        }
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        if(a < 1 || a > 10 || b < 1 || b > 10){
            throw new Exception("Введенные числа не принадлежат множеству от 1 до 10");
        }
        String op = arr[1];
        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new Exception("Неверный оператор");
        };
        return String.valueOf(result);
    }
}