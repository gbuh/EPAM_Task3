package comparator;

import java.util.Comparator;

import domain.Plane;

public class PlaneModelComparator implements Comparator<Plane> {
    public int compare(Plane plane1, Plane plane2) {
        String planeModel1 = plane1.getModel().toUpperCase();
        String planeModel2 = plane2.getModel().toUpperCase();
        return planeModel1.compareTo(planeModel2);
    }
}
