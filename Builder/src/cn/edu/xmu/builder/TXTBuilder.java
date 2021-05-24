package cn.edu.xmu.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 17:45
 * modifiedBy Miyuki 17:45
 **/

public class TXTBuilder extends Builder {
    private String filename;
    private PrintWriter writer;
    public void makeTitle(String title) {
        filename = title + ".txt";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("         " + title + "         ");
    }
    public void makeString(String str) {
        writer.println("content:");
        writer.println(str);
    }
    public void makeItems(String[] items) {
        // writer.println("<ul>");
        writer.println("List Bigins:");
        for (int i = 0; i < items.length; i++) {
            writer.println("Item["+i+"]" + items[i]);
        }
        writer.println("List ends:");
        // writer.println("</ul>");
    }
    public Object getResult() {
        //writer.println("</body></html>");
        writer.close();
        return filename;
    }
}

