package artexpo;

public class Artist {
    String name;
    int registrationTime; // e.g. minutes since expo opened

    public Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }
}
