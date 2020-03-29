package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Buffer {
    public double x,y,z,w;

    int a,b;

    public Buffer(double x, double y, double z, double w, int a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.a = a;
        this.b = b;
    }

    public Buffer() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", w=" + w +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
