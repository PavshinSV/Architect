package Lesson01.InMemoryModel;

import Lesson01.ModelElements.Camera;
import Lesson01.ModelElements.Flash;
import Lesson01.ModelElements.PoligonalModel;
import Lesson01.ModelElements.Scene;

import java.util.ArrayList;

public class ModelStore {
    private ArrayList<PoligonalModel> models = new ArrayList<>();
    private ArrayList<Scene> scenes = new ArrayList<>();
    private ArrayList<Flash> flashes = new ArrayList<>();
    private ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changeObservers = new ArrayList<>();

    public ModelStore(ArrayList<PoligonalModel> models, ArrayList<Scene> scenes, ArrayList<Flash> flashes, ArrayList<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public ArrayList<PoligonalModel> getModels() {
        return models;
    }

    public void addModel(PoligonalModel model) {
        this.models.add(model);
    }

    public ArrayList<Scene> getScenes() {
        return scenes;
    }

    public void addScene(Scene scene) {
        this.scenes.add(scene);
    }

    public ArrayList<Flash> getFlashes() {
        return flashes;
    }

    public void addFlash(Flash flash) {
        this.flashes.add(flash);
    }

    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public void addCamera(Camera camera) {
        this.cameras.add(camera);
    }

    public ArrayList<IModelChangedObserver> getChangeObservers() {
        return changeObservers;
    }

    public void addChangeObservers(IModelChangedObserver changeObservers) {
        this.changeObservers.add(changeObservers);
    }

    public Scene getScena(int index){
        return this.scenes.get(index);
    }
}
