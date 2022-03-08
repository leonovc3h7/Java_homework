package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Pupil> pupils = new ArrayList();
        pupils.add(new Pupil("11 Ivnov"));
        pupils.add(new Pupil(10, "Petrov"));
        pupils.add(new Pupil("10 Zaicev"));
        pupils.add(new Pupil("9 Sidorov"));
        pupils.add(new Pupil("8 Putin"));
        pupils.add(new Pupil("1 Medvedev"));
        pupils.add(new Pupil("10 Caplin"));
        pupils.add(new Pupil("1 Lavrov"));

        System.out.println("Comparator");
        Comparator<Pupil> comparator = new PupilNumberClassComparator().thenComparing(new PupilSurnameComparator());
        //сортировка List(a) по полю номера, потом по имени
        Collections.sort(pupils, comparator);
        for (Pupil i:pupils) {
            System.out.println(i.toString());
        }
    }
}
