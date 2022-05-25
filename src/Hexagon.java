import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hexagon extends Polygon {
    int xi;
    int yi;
    public Hexagon(int xi, int yi) {
        this.xi = xi;
        this.yi = yi;
        this.addPoint(this.xi, this.yi);
        this.addPoint(this.xi+30, this.yi-17);
        this.addPoint(this.xi+60, this.yi+1);
        this.addPoint(this.xi+60, this.yi+32);
        this.addPoint(this.xi+30, this.yi+47);
        this.addPoint(this.xi, this.yi+31);




    }




    /*public  void hexagoneMap ()
    {


        int [] xP = {xi,xi+30,xi+60,xi+60,xi+30,xi};
        int [] yP = {yi,yi-17,yi+1,yi+32,yi+47,yi+31};
      for(int i =0; i<6;i++){
          hexagone.addPoint(xP[i],yP[i]);


      }
*/

    public List readconfigMap() {
        List<List<Integer>> lines = new ArrayList<List<Integer>>();

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\dabli\\OneDrive\\Bureau\\mapdata.txt"));

            while (scanner.hasNextLine()) {
                // List line = new List();
                List<Integer> line = new ArrayList<Integer>();
                String data[] = scanner.nextLine().split(",");
                line.add(Integer.parseInt(data[0]));
                line.add(Integer.parseInt(data[1]));
                line.add(Integer.parseInt(data[2]));
                lines.add(line);


            }
            lines.forEach(System.out::println);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return  lines;
    }




    /* public void drawHexagon(Graphics2D g, int xi, int yi){
         int[] xP = {xi, xi + 30, xi + 60, xi + 60, xi + 30, xi};
         int[] yP = {yi, yi - 17, yi + 1, yi + 32, yi + 47, yi + 31};
         g.drawPolygon(xP, yP, xP.length);

     }*/
    public void  painthexagon( Graphics2D g2 ) {
        List<List<Integer>> linesOfMap = readconfigMap();
        int idx_reglage = 0;
        for(List<Integer> line : linesOfMap){
            idx_reglage++;
            int xi=line.get(1);
            int yi=line.get(2);
            for(int i=0; i<line.get(0); i++ ){
                System.out.println("i:" +i+" ,xi: "+xi+", yi: "+yi);

                g2.drawPolygon(new Hexagon(xi, yi));


                if(i >= line.get(0)/2 || (i<line.get(0)-2 && idx_reglage>7 && i >= line.get(0)/2)) xi-=4;
                xi+=62;
            }
        }




    }
}