package com.emploi.app;

import java.util.Comparator;
import com.emploi.app.entities.Seance;

public class SeanceComparator implements Comparator<Seance> {
    @Override
    public int compare(Seance o1, Seance o2) {
        return o1.getHeureDebut().compareTo(o2.getHeureDebut());
    }
}