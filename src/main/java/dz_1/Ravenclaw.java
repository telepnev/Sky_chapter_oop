package dz_1;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(int magic, int transgress, String name, String middleName, int smart, int wise, int witty, int creativity) {
        super(magic, transgress, name, middleName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Когтевранцы : " + " ум - " + getSmart()
                                + ", мудрость -" + getWise()
                                + ", остроумие - " + getWitty()
                                + ", творчество - " + getCreativity()

                );
        System.out.println();
    }

    public static void getBestStudentOfFacultyRavenclaw(Ravenclaw wizard1, Ravenclaw wizard2) {
        int wiz1 = wizard1.getSmart() + wizard1.getWise() + wizard1.getWitty() + wizard1.getCreativity();
        int wiz2 = wizard2.getSmart() + wizard2.getWise() + wizard2.getWitty() + wizard2.getCreativity();

        if (wiz1 > wiz2) {
            System.out.println("У " + wizard1.getName() + " сумма баллов равна " + wiz1 + " -ти , а у " + wizard2.getName() + " " + wiz2 + "-ти.");
            System.out.println(wizard1.getName() + " лучший Когтевранец, чем " + wizard2.getName());
        } else if (wiz2 > wiz1) {
            System.out.println("У " + wizard2.getName() + " сумма баллов равна " + wiz2 + " -ти , а у " + wizard1.getName() + " " + wiz1 + "-ти.");
            System.out.println(wizard2.getName() + " лучший Когтевранец, чем " + wizard1.getName());
        } else {
            System.out.println("Победила дружба!!!");
        }
        System.out.println();
    }

}
