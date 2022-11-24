package Lesson01.ModelElements;

import Lesson01.ModelElements.Objects.Point3D;

import java.util.ArrayList;

public class Poligon {
    private ArrayList<Point3D> points;

    public Poligon(Point3D point){
        this.points.add(point);
    }

    public Poligon(ArrayList<Point3D> points){
        this.points.addAll(0,points);
    }

    public ArrayList<Point3D> getPoints() {
        return points;
    }

    public void addPoint(Point3D point) {
        this.points.add(point);
    }
}
