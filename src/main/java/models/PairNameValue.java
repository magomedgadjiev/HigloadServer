package models;

public class PairNameValue {
    private String name;
    private String value;

    public PairNameValue(){
        ;
    }

    public PairNameValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void pushBackName(char ch) {
        name += ch;
    }

    public void pushBackValue(char ch) {
        value += ch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
