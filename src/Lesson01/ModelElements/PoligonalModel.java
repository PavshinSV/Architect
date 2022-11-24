package Lesson01.ModelElements;

import java.util.ArrayList;

public class PoligonalModel {
    private ArrayList<Poligon> poligons = new ArrayList<>();
    private ArrayList<Texture> textures = new ArrayList<>();

    public PoligonalModel(Poligon poligon){
        this.poligons.add(poligon);
    }

    public PoligonalModel(ArrayList<Poligon> poligons){
        this.poligons.addAll(0,poligons);
    }

    public ArrayList<Poligon> getPoligons() {
        return poligons;
    }

    public void addPoligon(Poligon poligon) {
        this.poligons.add(poligon);
    }
    public void addPoligons(ArrayList<Poligon> poligons) {
        this.poligons.addAll(poligons);
    }

    public ArrayList<Texture> getTextures() {
        return textures;
    }

    public void addTexture(int sizeX, int sizeY, String path) {
        this.textures.add(new Texture(sizeX,sizeY,path));
    }
}
