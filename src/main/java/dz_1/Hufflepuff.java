package dz_1;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(int magic, int transgress, String name, String middleName, int hardworking, int loyal, int honest) {
        super(magic, transgress, name, middleName);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Пуффендуя : " + " трудолюбив - " + getHardworking()
                                + ", верны -" + getLoyal()
                                + ", честны - " + getHonest()

                );
        System.out.println();
    }
    public static void getBestStudentOfFacultyHufflepuff(Hufflepuff wizard1, Hufflepuff wizard2) {
        int wiz1 = wizard1.getHardworking() + wizard1.getLoyal() + wizard1.getHonest();
        int wiz2 = wizard2.getHardworking() + wizard2.getLoyal() + wizard2.getHonest();

        if (wiz1 > wiz2) {
            System.out.println("У "+wizard1.getName()+" сумма баллов равна "+wiz1+" -ти , а у "+wizard2.getName()+" "+wiz2 +"-ти.");
            System.out.println(wizard1.getName() + " лучший Пуффендорец, чем " + wizard2.getName());
        } else if (wiz2 > wiz1) {
            System.out.println("У "+wizard2.getName()+" сумма баллов равна "+wiz2+" -ти , а у "+wizard1.getName()+" "+wiz1 +"-ти.");
            System.out.println(wizard2.getName() + " лучший Пуффендорец, чем " + wizard1.getName());
        } else {
            System.out.println("Победила дружба!!!");
        }
        System.out.println();
    }

}
