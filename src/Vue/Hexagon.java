package Vue;

import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hexagon extends Polygon {

    Creature creature;
    Terrain terrain = new Terrain();
    Tuile tuile;
    Image imageHexagone = null;

    int xi;
    int yi;
    int xdraw;
    int ydraw;
    int elemhexa;

    public Hexagon(int xi, int yi) {
        this.xi = xi;
        this.yi = yi;
        this.addPoint(this.xi, this.yi);
        this.addPoint(this.xi + 30, this.yi - 17);
        this.addPoint(this.xi + 60, this.yi + 1);
        this.addPoint(this.xi + 60, this.yi + 32);
        this.addPoint(this.xi + 30, this.yi + 47);
        this.addPoint(this.xi, this.yi + 31);
        terrain.Maptuile();





    }

    List<Hexagon> listhex = new ArrayList<>();




    public List readconfigMap() {
        List<List<Integer>> lines = new ArrayList<List<Integer>>();

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Medmat\\Desktop\\mapdata.txt"));

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
        return lines;
    }

    public void Setuphex() {
        List<List<Integer>> linesOfMap = readconfigMap();
        int idx_reglage = 0;
        for (List<Integer> line : linesOfMap) {
            idx_reglage++;
            int xi = line.get(1);
            int yi = line.get(2);
            for (int i = 0; i < line.get(0); i++) {
                //System.out.println("i:" + i + " ,xi: " + xi + ", yi: " + yi);
                listhex.add(new Hexagon(xi, yi));


                if (i >= line.get(0) / 2 || (i < line.get(0) - 2 && idx_reglage > 7 && i >= line.get(0) / 2)) xi -= 4;
                xi += 62;
            }
        }
    }

    public void affichage() {
        System.out.println(listhex.size());
        for (Hexagon elem : listhex) {
            System.out.println("--------------"+listhex.indexOf(elem)+"-------------");
            for (int i = 0; i < elem.npoints; i++) {
                System.out.println(elem.xpoints[i] + "  " + elem.ypoints[i]);
            }
            System.out.println("-------------------------------");


        }
    }
    public boolean ilecentre( int indice1){

        int indicehexagon[] = {31,32,33,34,41,42,43,44,45,51,52,53,54,55,56,57,58,63,64,65,67,68,69,74,75,76,77,78,79,80,81,87,88,89,90,91,98,99,100,101};
        for (int i = 0; i < 40; i++) {
            if( indice1 == indicehexagon[i]){


                return true;
            }

        }
        return false;



    }

    public void checkxy(int x, int y) {
        for (Hexagon elem : listhex) {
            if (elem.contains(x, y+17) == true) {
                xdraw = elem.xpoints[0];
                ydraw = elem.ypoints[0];
                elemhexa = listhex.indexOf(elem);
                System.out.println(listhex.indexOf(elem));


            }
        }

    }


    public void drawHexagon(Graphics2D g) {

        int i = 0;
          for(Hexagon elem: listhex){
              if(ilecentre(listhex.indexOf(elem))){
                  g.drawImage(terrain.tabelImag[i],elem.xpoints[0],elem.ypoints[0]-17,58,68,null);
                  i++;
              }
          }



    }
}

