package com.company;

import java.util.Comparator;

public class PupilNumberClassComparator implements Comparator<Pupil> {
    public int compare(Pupil firstPupil, Pupil secondPupil){
        return firstPupil.getClassNumber() - secondPupil.getClassNumber();
    }
}
