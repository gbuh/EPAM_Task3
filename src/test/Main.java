package test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import comparator.PlaneModelComparator;

import domain.Plane;
import xml.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "./XMLPlane/PlaneCatalogue.xml";
        PlaneXmlValidator validator = new PlaneXmlValidator(fileName);
        if(validator.validate()) {
            PlaneXmlReader reader = new PlaneXmlReader();
            List<Plane> planes = reader.read(fileName);
            for(Plane plane : planes) {
//                Collections.sort(planes, new PlaneModelComparator());
                System.out.println(plane);
                System.out.println();
            }
        } else {
            System.out.println(validator.getError());
        }
    }
}