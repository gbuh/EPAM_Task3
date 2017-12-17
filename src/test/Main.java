package test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import comparator.PlaneModelComparator;

import domain.Plane;
import xml.*;

/**
 * This program reads text from the XML-file, validate for an XSD-schema,
 * initializes the collection of objects with information from the XML-file
 * and sorts the objects of the plane according to the model
 * 
 * @version 1.2 17 Dec 2017
 * @author  Igor Lipko
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "./XMLPlane/PlaneCatalogue.xml";
        PlaneXmlValidator validator = new PlaneXmlValidator(fileName);
        if(validator.validate()) {
            PlaneXmlReader reader = new PlaneXmlReader();
            List<Plane> planes = reader.read(fileName);
            Collections.sort(planes, new PlaneModelComparator());
            for(Plane plane : planes) {
                System.out.println(plane);
                System.out.println();
            }
        } else {
            System.out.println(validator.getError());
        }
    }
}