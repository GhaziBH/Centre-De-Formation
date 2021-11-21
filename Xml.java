package centreform;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
 
public class Xml {
    public static void Ajouter(String Ref ,String Nom , String DateD,String DateS  , String Ens , String NbH) throws JDOMException, IOException {
 
        Document document = null;
        Element root = null;
 
        File xmlFile = new File("Centre.xml");
        if(xmlFile.exists()) {
            //charger le document xml s'il existe
          
            FileInputStream fis = new FileInputStream(xmlFile);
            //créer un sax builder pour parcourir le fichier xml
            SAXBuilder sb = new SAXBuilder();
            document = sb.build(fis);
           //prendre l'element root
            root = document.getRootElement();
            fis.close();
        } else {
            //créer le fichier s'il n'existe pas
            document = new Document();
            root = new Element("Formations");
        }
 
        
        Element child = new Element("Formation");
        child.setAttribute(new Attribute("ref", Ref));
        child.addContent(new Element("nom").setText(Nom));
        child.addContent(new Element("date_deb").setText(DateD));
        child.addContent(new Element("date_fin").setText(DateS));
        child.addContent(new Element("Ens").setText(Ens));
         child.addContent(new Element("nb_heurs").setText(NbH));
        root.addContent(child);
        document.setContent(root);
        try {
            FileWriter writer = new FileWriter("Centre.xml");
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(Format.getPrettyFormat());
            outputter.output(document, writer);
            outputter.output(document, System.out);
            writer.close(); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     public static void Modifier(String Ref ,String Nom , String DateD,String DateS  , String Ens , String NbH , String  SelectedRef) throws FileNotFoundException, IOException, JDOMException{
        String fileName = "Centre.xml";
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(fileName);
        Document jdomDoc = (Document) builder.build(xmlFile);

        // liste des elements
        Element rootElement = jdomDoc.getRootElement();
        List < Element > listUserElement = rootElement.getChildren("Formation");

        // boucler tous les elements
        for (Element userElement: listUserElement) {

            //Comparer l'element selectionneé par l'element dans le xml 
            String ref = userElement.getAttributeValue("ref");
            if (SelectedRef.equals(ref) ){
                userElement.getAttribute("ref").setValue(Ref);
                userElement.getChild("nom").setText(Nom);
                userElement.getChild("date_deb").setText(DateD);
                userElement.getChild("date_fin").setText(DateS);
                userElement.getChild("Ens").setText(Ens);
                userElement.getChild("nb_heurs").setText(NbH);
              
            }
            
        }

       //stockage de resultat dans le fichier xml
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        xmlOutputter.output(jdomDoc, new FileOutputStream("Centre.xml"));
    }
     public static void Supprimer(String  SelectedRef) throws FileNotFoundException, IOException, JDOMException{
      String fileName = "Centre.xml";
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(fileName);
        Document jdomDoc = (Document) builder.build(xmlFile);

        //lister les elements
        Element rootElement = jdomDoc.getRootElement();
        List < Element > listUserElement = rootElement.getChildren("Formation");

        //boucler tous les elemnts
        for (Element userElement: listUserElement) {

           
            String ref = userElement.getAttributeValue("ref");
            if (SelectedRef.equals(ref) ){
                    
                     userElement.removeAttribute("ref");
                     userElement.removeChild("nom");
                     userElement.removeChild("date_deb");
                     userElement.removeChild("date_fin");
                     userElement.removeChild("Ens");
                     userElement.removeChild("nb_heurs");
                     
            }
          
        }

    
       //stockage de resultat dans le fichier xml
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        xmlOutputter.output(jdomDoc, new FileOutputStream("Centre.xml"));
    }
    }
