package model;

public class RandomRng {
    public int randomInARange(int min, int max) {
        return  (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
