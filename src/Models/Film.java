package Models;

public class Film {

    private int id;
    private String title;
    private String ageIndication;
    private String language;
    private String length;
    private String category;

    public Film(int id, String title, String ageIndication, String language, String length, String category) {
        this.id = id;
        this.title = title;
        this.ageIndication = ageIndication;
        this.language = language;
        this.length = length;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAgeIndication() {
        return ageIndication;
    }

    public void setAgeIndication(String ageIndication) {
        this.ageIndication = ageIndication;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ageIndication='" + ageIndication + '\'' +
                ", language='" + language + '\'' +
                ", length='" + length + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
