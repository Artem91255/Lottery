import java.util.ArrayList;

import java.util.Random;



public class LotteryGame {


    public static String LuckProbability(String pr)
    {
        int num = Integer.parseInt(pr);
        Random random = new Random();
        int aaaa = random.nextInt(100);
        if (aaaa < num)
        {
            String result = "Удача";
            return result;
        }
        else
        {
            String result = "Провал";
            return result;
        }
    }

    public static void game(ArrayList<String> nameOfId, ArrayList<String> nameOfToy, ArrayList<String> nameOfcount, ArrayList<String> nameOfProbability, ArrayList<String> nameOfType )
    {

        System.out.println("Начинаем розыгрыш");
        System.out.println("Количество наборов, участвующих в розыгрыше: " +nameOfProbability.size());
        for(int i = 0; i<nameOfProbability.size(); i++ )
        {
            if(nameOfcount.get(i).equals("0"))
            {
                System.out.println("К сожалению, набор под названием " + nameOfToy.get(i) + " закончился. Двигаемся дальше." );
            }
            else {
                System.out.println("Разыгрываем конструктор по именем " + (nameOfToy.get(i)));
                String result = LuckProbability(nameOfProbability.get(i));
                System.out.println(result);
                if (result.equals("Удача")) {
                    String s = "Ура, вы выиграли набор под названием: " + nameOfToy.get(i);
                    int temp = Integer.parseInt(nameOfcount.get(i)) - 1;
                    String newValuesOfCount = Integer.toString(temp);
                    nameOfcount.set(i, newValuesOfCount);

                    System.out.println(s);
                    break;


                } else if (result.equals("Провал")) {
                    String resFalse = "К сожалению, удача не на вашей стороне. Попробуем еще раз";
                    System.out.println(resFalse);

                }
            }

        }
        String res2 = "Розыгрыш окончен";

        System.out.println(res2);

    }
}

