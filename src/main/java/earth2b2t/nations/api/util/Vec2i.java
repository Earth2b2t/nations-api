package earth2b2t.nations.api.util;

import java.util.Objects;

/**
 * A class represents 2 dimension vector.
 * This can be used for representing X-Z coordinates, chunk X-Z coordinates, or any general purposes.
 */
final public class Vec2i {
    public static final Vec2i ZERO = new Vec2i(0, 0);

    private final int x;
    private final int z;

    public Vec2i(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public Vec2i add(int x, int z) {
        return new Vec2i(this.x + x, this.z + z);
    }

    public Vec2i subtract(int x, int z) {
        return new Vec2i(this.x - x, this.z - z);
    }

    public Vec2i multiply(int x, int z) {
        return new Vec2i(this.x * x, this.z * z);
    }

    public Vec2i divide(int x, int z) {
        return new Vec2i(this.x / x, this.z / z);
    }

    public int distSq(int x, int z) {
        return (this.x - x) * (this.x - x) + (this.z - z) * (this.z - z);
    }

    public double dist(int x, int z) {
        return Math.sqrt(distSq(x, z));
    }

    public Vec2i add(Vec2i i) {
        return new Vec2i(x + i.x, z + i.z);
    }

    public Vec2i subtract(Vec2i i) {
        return new Vec2i(x - i.x, z - i.z);
    }

    public Vec2i multiply(Vec2i i) {
        return new Vec2i(x * i.x, z * i.z);
    }

    public Vec2i divide(Vec2i i) {
        return new Vec2i(x / i.x, z / i.z);
    }

    public int distSq(Vec2i i) {
        return (x - i.x) * (x - i.x) + (z - i.z) * (z - i.z);
    }

    public double dist(Vec2i i) {
        return Math.sqrt(distSq(i));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec2i vec2i = (Vec2i) o;
        return x == vec2i.x && z == vec2i.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, z);
    }

    @Override
    public String toString() {
        return "Vec2i{" +
                "x=" + x +
                ", z=" + z +
                '}';
    }
}
