package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            //int a = 10 / 0;
            int [] arr ={1,2};
            arr[3] = 2;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (ArrayIndexOutOfBoundsException i) {
            // при обработке исключений приоритет будет отдаваться тому классу исключения
            // который в цепочке наследования находиться дальше всего от класса Exception.
            System.out.println(1);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(2);
        }
        // так делать нельзя
        try {
            int a = 10 / 0;
            int [] arr ={1,2};
            arr[3] = 2;

        } catch (Exception e) {
            System.out.println("Что- то пошло не так :(");
        }
        // исключения в java  бывают двух видов
        // -checked (обязательны для обработки)
        // -unchecked (не обязательны для обработки блок try catch)
        File f = new File ("1.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // unchecked = все классы исключения, которые наследуют RuntimeException
        //int []arr ={1,2};
        //arr [2]= 2;

        //обработка нескольких исключений в 1 блоке catch
        try {
            int a = 10 / 0;
            int [] arr ={1,2};
            arr[3] = 2;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {}

        // throw  -генерирует исключение
        // после throw  нужно укать объкт исключения
        // (наследует класс Exception, RuntimeException ,
        /*try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //setAge(12); - если не обработать try catch (alt+enter) ошибка
        */
        try {
            setAge(150);
        } catch (Exception e) {
           System.out.println(e.getMessage());// getMassage выводит текст исключения
        }


    }
    //trows - определяет классы исключений, которые генерирует метод,которые должны быть обработаны (try catch
    //  при вызове этого метода
    public static void setAge (int age) throws Exception {
        if (age < 0 || age >120) {
            // генерация исключения!
            throw new Exception("invalid age");
        }
        //.....

    }

}
