public abstract class Image{
    protected String magic;
    protected int width;
    protected int height;
    protected int depth;

    // Modifiers: setMagic(string m), setWidth(int w), etc.


    // abstract methods to override in PGM.java
    public abstract void rotate_right_90(); // rotate 90 degrees CW
    public abstract void flip_vertically(); // flip image vertically
    public abstract void flip_horizontally(); // flip image horizontally
}