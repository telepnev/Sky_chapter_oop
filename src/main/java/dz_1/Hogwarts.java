package dz_1;


public class Hogwarts {
    private int magic;
    private int transgress;
    private String name;
    private String middleName;

    public Hogwarts(int magic, int transgress, String name, String middleName) {
        this.magic = magic;
        this.transgress = transgress;
        this.name = name;
        this.middleName = middleName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                );
    }

    public static void compareTwoHogwartsWizards(Hogwarts wizard1, Hogwarts wizard2) {
        if((wizard1.getMagic() + wizard1.getTransgress()) > (wizard2.getMagic() + wizard2.getTransgress())) {
            System.out.println(wizard1.getName() + " у этого волшебника Магия сильней чем у " + wizard2.getName());
        }
        else if ((wizard2.getMagic() + wizard2.getTransgress()) > (wizard1.getMagic() + wizard1.getTransgress())) {
            System.out.println(wizard2.getName() + " у этого волшебника Магия сильней чем у " + wizard1.getName());
        }
        else {
            System.out.println("Победила дружба !!!");
        }
        System.out.println();
    }

}
