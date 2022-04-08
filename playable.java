public class playable {

    public static void main(String[] args) {
        kitoFintan father = new kitoFintan();
        father.setFamilyName("Fintan");
        System.out.println("Kito is from the " +father.getFamilyName() + " clan, and the former chief of Fintan clan, " +
                "making him the predecessor of his son, Kinai, ");
        father.setAge(53);
        System.out.println("He is " +father.getAge() + " years old");
        father.setHairstyle("Disheveled Medium Jet Black hair");
        System.out.println("He is known for his " +father.getHairstyle());
        father.setEyecolor("Dark Grey Eyes");
        System.out.println("He has " +father.getEyecolor() + ", like most Fintans");
        father.setSuperpower("Pyrokinesis");
        System.out.println("And of course, the Fintan's signature power " +father.getSuperpower());

        michaFintan mother = new michaFintan();
        mother.setNee("Emerson");
        System.out.println("Micha is actually from " +mother.getNee() + " before she married her husband");
        mother.setAge(50);
        System.out.println("Micha is " +mother.getAge() + " years old, making her 3 years younger than her husband");
        mother.setFace("Everyone knows that her face is very similar to her son");
        System.out.println(mother.getFace());
        mother.setStatus("Deceased");
        System.out.println("Unfortunately, she was " +mother.getStatus() + " when she tried to save her son and husband");

        kinaiFintan son = new kinaiFintan();
        son.setFamilyName("Fintan");
        System.out.println("Kinai is from the " +son.getFamilyName() + " family, and the successor of his father");
        son.setHairstyle("Disheveled Medium Jet Black hair");
        System.out.println("He inherited his father's " +son.getHairstyle());
        System.out.println("And his mother's beautiful face");
        son.setAge(28);
        System.out.println("Kinai is " +son.getAge() + " years old");
        son.setEyecolor("Dark Grey Eyes");
        System.out.println("Like most of the Fintans, he has " +son.getEyecolor());
        son.setSuperpower("Pyrokinesis");
        System.out.println("And " +son.getSuperpower());
    }
}
