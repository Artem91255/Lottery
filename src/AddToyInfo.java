import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class AddToyInfo
{

    static ArrayList<String> idOfToy = new ArrayList<String>();
    static ArrayList<String> nameOfToy = new ArrayList<String>();
    static ArrayList<String> numbersOfToy = new ArrayList<String>();
    static ArrayList<String> probabilityOfToy = new ArrayList<String>();
    static ArrayList<String> typeOfToy = new ArrayList<String>();


    public static void changeProbability(ArrayList<String> id, ArrayList<String> counts) throws IOException {
        System.out.print("Введите уникальный номер набора, для которого вы хотите изменить вероятной выигрыша: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.print("Введите новое значение вероятности выигрыша выбранного набора: ");
        String pr = reader.readLine();

        for(int i = 0; i<id.size(); i++)
        {
            if (id.get(i).equals(s))
            {
                counts.set(i,pr);
            }
        }

        System.out.println("Данные успешно изменены");
    }

//    public static void printInfoForLists(ArrayList<String> nameOfId, ArrayList<String> nameOfToy, ArrayList<String> nameOfcount, ArrayList<String> nameOfProbability, ArrayList<String> nameOfType)
//    {
//        for(int i = 0; i<nameOfId.size();i++)
//        {
//            System.out.println(nameOfId.get(i) +" "+ nameOfToy.get(i) +" "+ nameOfcount.get(i) +" "+ nameOfProbability.get(i) +" "+ nameOfType.get(i));
//        }
//    }

    public static void toFillLists(String id, String name, String number, String pr, String type)
    {
        idOfToy.add(id);
        nameOfToy.add(name);
        numbersOfToy.add(number);
        probabilityOfToy.add(pr);
        typeOfToy.add(type);
        System.out.println("Информация по набору внесена");
    }

    public static void InputInfo() throws IOException {
        String id = toyID();
        String name = toyName();
        String number = toyNumber();
        String pr =toyProbability();
        String type = toyType();


        //Lego lego1 = new Lego(id, name, number, pr, type);
        toFillLists(id, name, number, pr, type);

    }


    public static String toyID() throws IOException
    {
        UUID tId = UUID.randomUUID();
        String s = String.valueOf(tId);

        return s;
    }
    public static String toyName() throws IOException
    {
        System.out.print("Введите Название набора LEGO: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static String toyNumber() throws IOException
    {
        System.out.print("Введите количество имеющихся наборов LEGO: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        return s;
    }

    public static String toyProbability() throws IOException
    {
        System.out.print("Введите вероятность выигрыша набора LEGO: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        return s;
    }

    public static String toyType() throws IOException
    {
        String s = "";
        boolean isExit = false;
        while(!isExit)
        {
            System.out.print("Введите тип набора LEGO(Technic, Creator, Duplo, Friends, City, No category): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s = reader.readLine();
            if(s.equals("Technic") || s.equals("Creator")  || s.equals("Duplo") || s.equals("Friends") || s.equals("City") || s.equals("No category"))
            isExit = true;
            else
            {
                System.out.println("Указанный тип не найден");
            }
        }
        return s;
    }


//    public static void printInfo(String idOfToy, String name, String numberOfToys, String probability, String type)
//    {
//        System.out.println("Номер игрушки: " + idOfToy +
//                "\nНаименование: " + name +
//                "\nКоличество: " + numberOfToys +
//                "\nВероятность выпадения: " + probability +
//                "\nТип: " + type);
//    }

}
