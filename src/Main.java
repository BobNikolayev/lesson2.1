public class Main {
    public static void main(String[] args) {

        Competitors competitors[] = new Competitors[3];
        competitors[0] = new Cat("Barsik",150,2);
        competitors[1] = new Robot(600,3,"R2D2");
        competitors[2] = new Human(400, 1, "Zahar");
        //competitors[3] = new Robot(12000,500000, "Ultron");

        Obstacles obstacles[] = new Obstacles[3];
        obstacles[0] = new Distance(300,"distance");
        obstacles[1] = new Wall(1, "wall");
        obstacles[2] = new Distance(600, "distance");
        obstacles[3] = new Distance(1000, "distance");

        for (int j = 0; j < competitors.length; j++) {

            for (int i = 0; i < obstacles.length; i++) {
                if (obstacles[i].getType() == "distance") {
                    competitors[j].run(obstacles[i].getDistance());
                } else if (obstacles[i].getType() == "wall") {
                    competitors[j].jump(obstacles[i].getWall());
                }
            }
        }
        //competitors[0].jump(obstacles[0].getWall());
    }


}
