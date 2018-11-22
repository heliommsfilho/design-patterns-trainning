import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.format.DateTimeFormatter;

/**
 * Creates a XML from a Log
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class SaveToXML extends SaveToFile {

    @Override
    public void writeToDisk(Log log, String logPath) {

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document xml = docBuilder.newDocument();

            /* Creating XML structure */
            Element rootElement = xml.createElement("log");
            xml.appendChild(rootElement);

            Element whenHappened = xml.createElement("whenHappened");
            whenHappened.appendChild(xml.createTextNode(log.getWhenHappened().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
            rootElement.appendChild(whenHappened);

            Element whatHappened = xml.createElement("whatHappened");
            whatHappened.appendChild(xml.createTextNode(log.getWhatHappened()));
            rootElement.appendChild(whatHappened);

            Element loggedUser = xml.createElement("loggedUser");
            loggedUser.appendChild(xml.createTextNode(log.getLoggedUser()));
            rootElement.appendChild(loggedUser);

            Element ip = xml.createElement("ip");
            ip.appendChild(xml.createTextNode(log.getIp()));
            rootElement.appendChild(ip);

            /* Preparing save */
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(xml);
            StreamResult result = new StreamResult(new File(logPath));
            transformer.transform(domSource, result);

            System.out.println("XML saved successfully!");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
