package RecursionAndDynamicProgramming;

public class PaintFill {

    public int[][] paintFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        fillPixels(sr, sc, image, image[sr][sc], newColor);

        return image;
    }

    private void fillPixels(int i, int j, int[][] image, int origin, int color) {
        if(i >= image.length || j >=image[0].length || i<0 || j < 0) return;
        if(image[i][j] != origin) return;

        image[i][j] = color;

        fillPixels(i, j+1, image, origin, color);
        fillPixels(i, j-1, image, origin, color);
        fillPixels(i+1, j, image, origin, color);
        fillPixels(i-1, j, image, origin, color);

    }
}
