public class Akun {

    private String name;
    private String email;
    private int tlp;
    private String gender;
    private int usia;

    public Akun setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setTlp(int tlp) {
        this.tlp = tlp;
        return this;
    }

    public int getTlp() {
        return this.tlp;
    }

    public Akun setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getGender() {
        return this.gender;
    }

     public Akun setUsia(int usia) {
        this.usia = usia;
        return this;
    }

    public int getusia() {
        return this.usia;
    }

}