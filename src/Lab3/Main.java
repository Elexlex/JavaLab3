package Lab3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int menu = 0;
        do{
        System.out.print("\n\n1. Checking the last two letters for \"ed\"\n2. The amount of numbers in your line\n3. Searching the longest sequence\n4. Each word on a new line\n5. Merging two lines\n6. Exit\n- ");
        menu = num.nextInt();
            switch (menu){
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
            }
        }while (menu!=6);
    }
    static String newLine(){
        Scanner name = new Scanner(System.in);
       System.out.println("Input the line:");
        String line = name.nextLine();
       return line;
    }
    static void task1(){
        String line;
        line = newLine();
        boolean check = line.endsWith("ed");
        System.out.println(check);
    }
    static void task2(){
        String line;
        int summary = 0;
        line = newLine();
        char[] characters = line.toCharArray();
        for (int i=0; i<characters.length; i++){
            if (Character.isDigit(characters[i])){
                int number = Integer.parseInt(String.valueOf(characters[i]));
                summary+=number;
            }
        }
        System.out.println(summary);
    }
    static void task3(){
        String line;
        line = newLine();
        int count = 0, startCount = 0, maxCount = 0;
        char[] characters = line.toCharArray();
        for (int i=1; i<characters.length; i++){
            if (characters[i] == characters[i-1]) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                    startCount = i-maxCount;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.print("Your longest sequence is: ");
        for (int i=0; i<=maxCount; i++){
            System.out.print(characters[startCount+i]);
        }
        System.out.println("\nThe length is: " + (maxCount+1));
    }
    static void task4(){
        String line;
        line = newLine();
        char[] characters = line.toCharArray();
        for (int i=0; i<characters.length; i++){
            System.out.print(characters[i]);
            if (characters[i] == ' ')
                System.out.println();
        }
    }
    static void task5(){
        String line1, line2;
        line1 = newLine();
        line2 = newLine();
        char[] characters1 = line1.toCharArray();
        char[] characters2 = line2.toCharArray();
        int count = 0;
        do{
            if (count < line1.length())
            System.out.print(characters1[count]);
            if (count < line2.length())
            System.out.print(characters2[count]);
            count++;
        } while (count < line1.length() || count < line2.length());
    }
}
