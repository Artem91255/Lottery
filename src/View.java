import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class View {
    public static void menu() throws IOException {

        boolean isExit = false;
        while(!isExit) {
            System.out.println("1. Добавить набор " +
                    "\n2. Просмотреть список наборов " +
                    "\n3. Изменить вероятность выигрыша набора "+
                    "\n4. Начать розыгрыш наборов" +
                    "\n5. Выход ");


            System.out.print("Введите нужный пункт меню: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choise = reader.readLine();

            int ch = Integer.parseInt(choise);
            if(ch==1)
            {
                AddToyInfo.InputInfo();
            }
            else if(ch==2)
            {
                WorkingWithFile.addInFile(AddToyInfo.idOfToy, AddToyInfo.nameOfToy, AddToyInfo.numbersOfToy, AddToyInfo.probabilityOfToy, AddToyInfo.typeOfToy);
                WorkingWithFile.readFromFile();
//                AddToyInfo.printInfoForLists(AddToyInfo.idOfToy, AddToyInfo.nameOfToy, AddToyInfo.numbersOfToy, AddToyInfo.probabilityOfToy, AddToyInfo.typeOfToy);
            }
            else if(ch==3)
            {

                WorkingWithFile.addInFile(AddToyInfo.idOfToy, AddToyInfo.nameOfToy, AddToyInfo.numbersOfToy, AddToyInfo.probabilityOfToy, AddToyInfo.typeOfToy);
                WorkingWithFile.readFromFile();
                AddToyInfo.changeProbability(AddToyInfo.idOfToy, AddToyInfo.probabilityOfToy);

            }
            else if(ch==4)
            {
//                AddToyInfo.addInFile(AddToyInfo.idOfToy, AddToyInfo.nameOfToy, AddToyInfo.numbersOfToy, AddToyInfo.probabilityOfToy, AddToyInfo.typeOfToy);
//                AddToyInfo.readFromFile();
                LotteryGame.game(AddToyInfo.idOfToy, AddToyInfo.nameOfToy, AddToyInfo.numbersOfToy, AddToyInfo.probabilityOfToy, AddToyInfo.typeOfToy);
//                    String res = LotteryGame.probability("20");
//                System.out.println(res);
//                for(int i  = 0; i<itemsForDelete.size(); i++)
//                {
//                    System.out.println(itemsForDelete.get(i));
//                }

//                LotteryGame.removeItemsInList(AddToyInfo.idOfToy, itemsForDelete);
//                LotteryGame.removeItemsInList(AddToyInfo.nameOfToy, itemsForDelete);
//                LotteryGame.removeItemsInList(AddToyInfo.numbersOfToy, itemsForDelete);
//                LotteryGame.removeItemsInList(AddToyInfo.probabilityOfToy, itemsForDelete);
//                LotteryGame.removeItemsInList(AddToyInfo.typeOfToy, itemsForDelete);
            }

            else if(ch==5)
            {
                isExit = true;
            }
        }

    }
}
