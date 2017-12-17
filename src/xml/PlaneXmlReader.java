package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import domain.*;

public class PlaneXmlReader {
    public List<Plane> read(String fileName) throws FileNotFoundException {
        XMLStreamReader reader = null;
        try {
            List<Plane> planes = new ArrayList<Plane>();
            Plane plane = null;
            Price price = null;
            Chars chars = null;
            Ammunition ammunition = null;
            Parameters parameters = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while(reader.hasNext()) {
                int types = reader.next();
                switch(types) {
                case XMLStreamConstants.START_ELEMENT: {
                    String tagName = reader.getLocalName();
                    if ("plane".equals(tagName)) {
                        plane = new Plane();
                        plane.setIdentity(reader.getAttributeValue(null, "id"));
                    } else if ("model".equals(tagName)) {
                        plane.setModel(reader.getElementText());
                    } else if ("origin".equals(tagName)) {
                        plane.setOrigin(reader.getElementText());
                    } else if ("price".equals(tagName)) {
                        price = new Price();
                        price.setCurrency(reader.getAttributeValue(null, "currency"));
                        price.setValue(Integer.parseInt(reader.getElementText()));
                        plane.setPrice(price);
                    } else if ("type".equals(tagName)) {
                        chars = new Chars();
                        chars.setType(reader.getElementText());
                        plane.setChars(chars);
                    } else if ("places".equals(tagName)) {
                        chars.setPlases(Byte.parseByte(reader.getElementText()));
                        plane.setChars(chars);
                    } else if ("ammunition".equals(tagName)) {
                        ammunition = new Ammunition();
                        ammunition.setRockets(Byte.parseByte(reader.getAttributeValue(null, "rockets")));
                        ammunition.setValue(Boolean.parseBoolean(reader.getElementText()));
                        chars.setAmmunition(ammunition);
                        plane.setChars(chars);
                    } else if ("radar".equals(tagName)) {
                        chars.setRadar(Boolean.parseBoolean(reader.getElementText()));
                        plane.setChars(chars);
                    } else if ("parameters".equals(tagName)) {
                        parameters = new Parameters();
                        parameters.setMeasure(reader.getAttributeValue(null, "measure"));
                    } else if ("length".equals(tagName)) {
                        parameters.setLength(Float.parseFloat(reader.getElementText()));
                    } else if ("width".equals(tagName)) {
                        parameters.setWidth(Float.parseFloat(reader.getElementText()));
                    } else if ("height".equals(tagName)) {
                        parameters.setHeight(Float.parseFloat(reader.getElementText()));
                        plane.setParameters(parameters);
                    }
                    break;
                }
                case XMLStreamConstants.END_ELEMENT: {
                    String tagName = reader.getLocalName();
                    if ("plane".equals(tagName)) {
                        planes.add(plane);
                    }
                    break;
                }
                }
            }
            return planes;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch(Exception e) {}
        }
    }
}
