package comparator;

import java.util.Comparator;

import domain.Plane;

public class PlaneModelComparator implements Comparator<Plane> {
    public int compare(Plane plane1, Plane plane2) {
        String planeModel1 = plane1.getModel();
        String planeModel2 = plane2.getModel();
        return planeModel1.compareToIgnoreCase(planeModel2);
    }
}
