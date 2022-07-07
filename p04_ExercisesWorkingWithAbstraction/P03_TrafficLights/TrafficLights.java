package p04_ExercisesWorkingWithAbstraction.P03_TrafficLights;

public class TrafficLights {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TrafficLights(Color color) {
        this.color = color;
    }

    public void changeColor() {
        switch (color) {
            case RED:
                this.color = Color.GREEN;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
        }

    }
}
