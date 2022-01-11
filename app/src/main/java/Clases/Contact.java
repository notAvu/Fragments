package Clases;

public class Contact {
    private String name;
    private String surname;
    private String tlfn;
    private int imgSource;

    public Contact(String name, String surname, String tlfn, int imgSource) {
        this.name = name;
        this.surname = surname;
        this.tlfn = tlfn;
        this.imgSource = imgSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }
}
