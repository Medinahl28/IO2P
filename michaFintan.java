public class michaFintan extends kitoFintan{
    public String nee;
    private int age;
    private String status;
    private String face;

    public void setNee(String nee) {

        this.nee = nee;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getNee() {

        return nee;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getStatus() {

        return status;
    }

    public String getFace() {
        return face;
    }

}
