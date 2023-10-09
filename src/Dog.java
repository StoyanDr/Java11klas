public class Dog {
    private String name;
    private String colour;
    private String eyeColour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static String come(){
        return "Coming";
    }
    public static String bark(){
        return "Woof Woof!";
    }

    public Dog(String name, String colour, String eyeColour) {
        this.name = name;
        this.colour = colour;
        this.eyeColour = eyeColour;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", eyeColour=" + eyeColour +
                '}';
    }
}
