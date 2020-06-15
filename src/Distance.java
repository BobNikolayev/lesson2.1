public class Distance extends Obstacles {
    int distance;
    String type;


    public Distance(int distance,String type) {
        this.distance = distance;
        this.type = type;
    }

    public int getDistance() {
        return distance;
    }

    public String getType() {
        return type;
    }
}
