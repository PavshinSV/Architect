package Lesson01.ModelElements;

import Lesson01.ModelElements.Objects.Type;

import java.util.ArrayList;
import java.util.Random;

public class Scene {
    private static int count;
    private int id;
    private ArrayList<PoligonalModel> models;
    private ArrayList<Flash> flashes;
    private ArrayList<Camera> cameras;


    public Scene(PoligonalModel model, Flash flash, Camera camera) {
        this.id = ++count;
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.models.add(model);
        this.flashes.add(flash);
        this.cameras.add(camera);
    }

    public Scene(PoligonalModel model, Camera camera) {
        this.id = ++count;
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.models.add(model);
        this.cameras.add(camera);
    }

    public int getId() {
        return id;
    }

    public ArrayList<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(ArrayList<PoligonalModel> models) {
        this.models.addAll(0,models);
    }

    public void addModel(PoligonalModel model) {
        this.models.add(model);
    }

    public void removeModel(int index) {
        this.models.remove(index);
    }

    public ArrayList<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(ArrayList<Flash> flashes) {
        this.flashes.addAll(flashes);
    }

    public void addFlash(Flash flash) {
        this.flashes.add(flash);
    }

    public void removeFlash(int index) {
        this.flashes.remove(index);
    }

    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(ArrayList<Camera> cameras) {
        this.cameras.addAll(cameras);
    }

    public void addCameras(Camera camera) {
        this.cameras.add(camera);
    }

    public void removeCameras(int index) {
        this.cameras.remove(index);
    }

    public Type method1(Type type){
        //Some logic at here
        return type;
    }

    public Type method2(Type type1, Type type2){
        //Some logic at here
        int x = new Random().nextInt(10);
        if (x>5){
            return type1;
        }
        return type2;
    }
}
