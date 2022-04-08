public class kinaiFintan extends kitoFintan{
    public String familyName;
    private String hairstyle;
    private int age;
    private String superpower;
    private String eyecolor;

    @Override
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }


    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }

    @Override
    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String getEyecolor() {
        return eyecolor;
    }

    @Override
    public String getHairstyle() {
        return hairstyle;
    }
}
