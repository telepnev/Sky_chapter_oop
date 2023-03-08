package dz_1;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(int magic, int transgress, String name, String middleName, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(magic, transgress, name, middleName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Слизерине : " + " хитрость - " + getCunning()
                                + ", решительность -" + getDetermination()
                                + ", амбициозность - " + getAmbition()
                                + ", находчивость - " + getResourcefulness()
                                + ". жажда власти - " + getLustForPower()
                );
        System.out.println();
    }
    public static void getBestStudentOfFacultySlytherin(Slytherin wizard1, Slytherin wizard2) {
        int wiz1 = wizard1.getCunning() + wizard1.getDetermination() + wizard1.getAmbition() +
                wizard1.getResourcefulness() + wizard1.getLustForPower();
        int wiz2 = wizard2.getCunning() + wizard2.getDetermination() + wizard2.getAmbition() +
                wizard2.getResourcefulness() + wizard2.getLustForPower();

        if (wiz1 > wiz2) {
            System.out.println("У "+wizard1.getName()+" сумма баллов равна "+wiz1+" -ти , а у "+wizard2.getName()+" "+wiz2 +"-ти.");
            System.out.println(wizard1.getName() + " лучший Когтевранец, чем " + wizard2.getName());
        } else if (wiz2 > wiz1) {
            System.out.println("У "+wizard2.getName()+" сумма баллов равна "+wiz2+" -ти , а у "+wizard1.getName()+" "+wiz1 +"-ти.");
            System.out.println(wizard2.getName() + " лучший Когтевранец, чем " + wizard1.getName());
        } else {
            System.out.println("Победила дружба!!!");
        }
        System.out.println();
    }

}
