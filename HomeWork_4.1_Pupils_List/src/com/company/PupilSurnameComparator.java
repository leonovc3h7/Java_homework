package com.company;

import java.util.Comparator;

public class PupilSurnameComparator implements Comparator<Pupil> {
    public int compare(Pupil firstPupil, Pupil secondPupil){
        return firstPupil.getSurname().compareTo(secondPupil.getSurname());
    }
}

