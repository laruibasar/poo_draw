package pt.isel.poo.li21n.g1.draw.app.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Circle extends Figure {

    public char letter = 'C';
    private int radius;

    public Circle(int x, int y){
        super(x,y);
    }

    public Circle(){

    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in){

    }

    public void save(PrintWriter out){
        super.save(out);
        out.print(" |" + radius + "|");
    }

    public void setEnd(int x, int y){

    }

    public int getRadius(){
        return this.radius;
    }

}
