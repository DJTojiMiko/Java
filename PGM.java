import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class PGM extends Image{
    int[][] pixels;
    public PGM(){
        width = 0;
        height = 0;
        magic = "";
        depth = 0;
    }
    public PGM(String fileName){
        Scanner sc = null;
        try{
            File f = new File(fileName);
            sc = new Scanner(f);
        }catch(FileNotFoundException e){
            System.exit(0);
        }

        magic = sc.nextLine();
        width = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();
        pixels = new int[height][width];

        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                pixels[i][j] = sc.nextInt();    
            }
        }
    }
    
    public void setMagic(String m) {
        magic = m;
    }
    
    public void setWidth(int w) {
        width = w;
    }
    
    public void setHeight(int h) {
        height = h;
    }

    public void setDepth(int d) {
        depth = d;
    }

    public String getMagic(){
        return magic;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getDepth() {
        return depth;
    }
    public int[][] getPixels() {
        return pixels;
    }
    @Override
    public void rotate_right_90(){    
        int[][]temp=new int[width][height];
        for(int j=0;j<width;j++){
            for(int i=height-1;i>=0;i--){
                temp[j][height-1-i] = pixels[i][j];
            }
        }
        this.pixels=temp;
        int w = width;
        width = height;
        height = w;
    }
    @Override
    public void flip_vertically(){
        int[][]temp = new int[height][width];
        for (int i=height-1; i>=0;i--){
            for (int j=0; j<width;j++){
                temp[height-1-i][j] = pixels[i][j];
            }
        }
        this.pixels = temp;
    }
    @Override
    public void flip_horizontally(){
        int[][]temp = new int[height][width];
        for (int i=0; i<height;i++){
            for (int j=width-1; j>=0;j--){
                temp[i][width-1-j] = pixels[i][j];
            }
        }
        this.pixels = temp;
    }    
}