package model;

public class Cor {

    private int red = 0;
    private int green = 0;
    private int blue = 0;

    public Cor() {
    }
    
    public Cor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public Cor(int rgb) {
        this.red = (rgb >> 16) & 0x0ff;
        this.green = (rgb >> 8) & 0x0ff;
        this.blue = (rgb) & 0x0ff;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    
    public void somaRed(int red) {
        this.red += red;
    }
    
    public void somaGreen(int green) {
        this.green += green;
    }
    
    public void somaBlue(int blue) {
        this.blue += blue;
    }
    
    public int getRGB() {
        return ((255 & 0xFF) << 24)
                | ((this.getRed() & 0xFF) << 16)
                | ((this.getGreen() & 0xFF) << 8)
                | ((this.getBlue() & 0xFF));
    }
}
