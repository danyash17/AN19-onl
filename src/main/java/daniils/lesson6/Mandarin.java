package daniils.lesson6;

import java.util.Objects;

public class Mandarin {

    int seedsNum;
    int piecesNum;
    String skinColor;

    public Mandarin(int seedsNum, int piecesNum, String skinColor) {
        this.seedsNum = seedsNum;
        this.piecesNum = piecesNum;
        this.skinColor = skinColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mandarin mandarin = (Mandarin) o;
        return seedsNum == mandarin.seedsNum && piecesNum == mandarin.piecesNum && Objects.equals(skinColor, mandarin.skinColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seedsNum, piecesNum, skinColor);
    }

    @Override
    public String toString() {
        return "Mandarin{" +
                "seedsNum=" + seedsNum +
                ", piecesNum=" + piecesNum +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }
}
