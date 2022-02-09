package org.Chuprova.Homework7;

public class MainClass {

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        Plate plate = new Plate(100, cat);

        String[] catNames = {"Барсик", "Мурка", "Фокс"};
        FillCatArray(cat, catNames);

        plate.info();
        for(int i = 0; i < 3; i++)
        {
            cat[i].eat(plate, i);
        }
        plate.info();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Сытость кота номер " + (i + 1) + ": " + cat[i].satiety);
        }
    }

    public  static void FillCatArray(Cat[] cat, String[] catNames)
    {
        for(int i = 0; i < 3; i++)
        {
            cat[i] = new Cat(catNames[i], i+1, false);
        }
    }
}
