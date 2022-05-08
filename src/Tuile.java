

public class Tuile {
    private Terrain terrain;
    private Creature creature;

    public Tuile(){}

    public Tuile(Terrain terrain, Creature creature) {
        this.terrain = terrain;
        this.creature = creature;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
