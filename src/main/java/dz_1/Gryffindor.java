package dz_1;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magic, int transgress, String name, String middleName, int nobility, int honor, int bravery) {
        super(magic, transgress, name, middleName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Гриффиндор : " + " благородство, - " + getNobility()
                                + ", честь -" + getHonor()
                                + ", храбрость - " + getBravery()

                );
        System.out.println();
    }

    public static void getBestStudentOfFacultyGryffindor(Gryffindor wizard1, Gryffindor wizard2) {
        int wiz1 = wizard1.getNobility() + wizard1.getHonor() + wizard1.getBravery();
        int wiz2 = wizard2.getNobility() + wizard2.getHonor() + wizard2.getBravery();

        if (wiz1 > wiz2) {
            System.out.println("У "+wizard1.getName()+" сумма баллов равна "+wiz1+" -ти , а у "+wizard2.getName()+" "+wiz2 +"-ти.");
            System.out.println(wizard1.getName() + " лучший Гриффиндорец, чем " + wizard2.getName());
        } else if (wiz2 > wiz1) {
            System.out.println("У "+wizard2.getName()+" сумма баллов равна "+wiz2+" -ти , а у "+wizard1.getName()+" "+wiz1 +"-ти.");
            System.out.println(wizard2.getName() + " лучший Гриффиндорец, чем " + wizard1.getName());
        } else {
            System.out.println("Победила дружба!!!");
        }
        System.out.println();
    }


}
