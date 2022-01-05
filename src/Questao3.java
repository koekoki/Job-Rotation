import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Questao3 {
    public static void main(String[] args) {
        double menorValor = 0;
        double maiorValor = 0;
        double soma = 0;
        int count = 0;
        ArrayList<Month> arrayMonth = new ArrayList<>();
        try {
            File file = new File("dados.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("row");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    Integer dia = Integer.parseInt(eElement.getElementsByTagName("dia").item(0).getTextContent());
                    Double valor = Double.parseDouble(eElement.getElementsByTagName("valor").item(0).getTextContent());
                    Month month = new Month(dia, valor);
                    arrayMonth.add(month);
                }
            }
            for (int i = 0; i < arrayMonth.size() - 1; i++) {
                if (menorValor > arrayMonth.get(i).valor) {
                    menorValor = arrayMonth.get(i).valor;
                }
                if (maiorValor < arrayMonth.get(i).valor) {
                    maiorValor = arrayMonth.get(i).valor;
                }
                soma = arrayMonth.get(i).valor + soma;
            }
            double mediaMensal = soma / arrayMonth.size();

            for (Month m: arrayMonth) {
                if (m.valor > mediaMensal) {
                    count = 1 + count;
                }
            }
            System.out.println("Maior faturamento: R$"+maiorValor);
            System.out.println("Menor faturamento: R$"+menorValor);
            System.out.println("Dias em que o valor de faturamento foi maior que a média mensal: "+count);
        }
        catch(IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
        }
    }
}
