package Aston.Trainee.Methods;

public class Check {

    public static void checkSeven(String text) {
        int number = Integer.parseInt(text);
        if(number > 7 ){
            System.out.println("Привет");
        }  else {
            System.out.println("Цифра меньше, либо равна 7");
        }
    }

    public static void checkVyacheslav(String name) {
        String result = name.toLowerCase();
        if(result.equals("вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void checkArray(String[] array){
        String result = "";
        for(int i = 0; i < array.length; i++){
            if (Integer.parseInt(array[i]) % 3 == 0 && Integer.parseInt(array[i]) != 0) {
                result += array[i] + " ";
            }
        }
        System.out.println("Элементы массива, кратные 3: " + result);
    }
}
