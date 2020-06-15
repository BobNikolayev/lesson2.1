public class Wall extends Obstacles {

    int wall;
    String type;

    public Wall(int wall, String type) {
        this.wall = wall;
        this.type = type;
    }

    public int getWall() {
        return wall;
    }

    public String getType() {
        return type;
    }
}
