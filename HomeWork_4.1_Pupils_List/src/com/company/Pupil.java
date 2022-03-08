package com.company;

public class Pupil implements Comparable<Pupil> {
    private int classNumber;
    private String surname;

    public Pupil(String dataBaseEntry) {
        this.surname = dataBaseEntry.substring(dataBaseEntry.indexOf(" ")+1);
        this.classNumber = Integer.parseInt(dataBaseEntry.substring(0,dataBaseEntry.indexOf(" ")));
    }

    public Pupil(int classNumber, String surname) {
        this.classNumber = classNumber;
        this.surname = surname;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "classNumber=" + classNumber +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pupil o) {
        return this.getSurname().compareTo(o.getSurname());
    }
}
