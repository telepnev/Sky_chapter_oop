package dz_1;


import static dz_1.Gryffindor.getBestStudentOfFacultyGryffindor;
import static dz_1.Hogwarts.compareTwoHogwartsWizards;
import static dz_1.Hufflepuff.getBestStudentOfFacultyHufflepuff;
import static dz_1.Ravenclaw.getBestStudentOfFacultyRavenclaw;
import static dz_1.Slytherin.getBestStudentOfFacultySlytherin;

public class Main {

    public static void main(String[] args) {

        Gryffindor garryPotter = new Gryffindor(
                19, 11, "Гарри", "Поттер",
                100, 31,13);
        Gryffindor germionaGredge = new Gryffindor(
                61, 21, "Гермиона", "Грейнджер",
                36, 32,23);
        Gryffindor ronUzle = new Gryffindor(
                19, 19, "Рон", "Уизли",
                61, 71,81);


        Slytherin dracoMalfoy = new Slytherin(40, 14, "Драко", "Малфой",
                14, 24, 34, 44, 54);
        Slytherin grehomMontegu = new Slytherin(42, 14, "Грэхэм", "Монтегю",
                40, 54, 47, 34, 84);
        Slytherin gregoryGoil = new Slytherin(40, 40, "Грегори", "Гойл",
                23, 41, 12, 10, 64);


        Hufflepuff zahariaSmit = new Hufflepuff(22, 92, "Захария", "Смит",
                21, 21, 20);
        Hufflepuff sederikDegory = new Hufflepuff(42, 72, "Седрик", "Диггори",
                21, 28, 52);
        Hufflepuff gastinFinch = new Hufflepuff(72, 20, "Джастин", "Финч-Флетчли",
                31, 54, 21);


        Ravenclaw dgouChang = new Ravenclaw(89, 31, "Чжоу", "Чанг",
                31,32, 32, 34);
        Ravenclaw padmaPlati = new Ravenclaw(33, 34, "Падма", "Патил",
                13,23, 33, 43);
        Ravenclaw markusBelbi = new Ravenclaw(23, 32, "Маркус", "Белби",
                34,33, 32, 35);

//      Вывод на печать
        dgouChang.printWizard();
        zahariaSmit.printWizard();
        gregoryGoil.printWizard();
        ronUzle.printWizard();

//      Сравниваем магию по факультету
        getBestStudentOfFacultyGryffindor(garryPotter, germionaGredge);
        getBestStudentOfFacultyHufflepuff(zahariaSmit,gastinFinch);
        getBestStudentOfFacultySlytherin(dracoMalfoy, gregoryGoil);
        getBestStudentOfFacultyRavenclaw(padmaPlati,markusBelbi);

//      Сравниваем магию по школе
        compareTwoHogwartsWizards(dgouChang, padmaPlati);
    }

}
