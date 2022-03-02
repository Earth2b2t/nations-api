package earth2b2t.nations.api.util;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

import java.util.Objects;

public class Vec3i {
    public static final Vec3i ZERO = new Vec3i(0, 0, 0);

    private final int x;
    private final int y;
    private final int z;

    public Vec3i(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3i(Block block) {
        this(block.getX(), block.getY(), block.getZ());
    }

    public Vec3i(BlockState blockState) {
        this(blockState.getX(), blockState.getY(), blockState.getZ());
    }

    public Vec3i(Location location) {
        this.x = location.getBlockX();
        this.y = location.getBlockY();
        this.z = location.getBlockZ();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Vec3i add(int x, int y, int z) {
        return new Vec3i(this.x + x, this.y + y, this.z + z);
    }

    public Vec3i subtract(int x, int y, int z) {
        return new Vec3i(this.x - x, this.y - y, this.z - z);
    }

    public Vec3i multiply(int x, int y, int z) {
        return new Vec3i(this.x * x, this.y * y, this.z * z);
    }

    public Vec3i divide(int x, int y, int z) {
        return new Vec3i(this.x / x, this.y / y, this.z / z);
    }

    public int distSq(int x, int y, int z) {
        return (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) + (this.z - z) * (this.z - z);
    }

    public double dist(int x, int y, int z) {
        return Math.sqrt(distSq(x, y, z));
    }

    public Vec3i add(Vec3i i) {
        return new Vec3i(x + i.x, y + i.y, z + i.z);
    }

    public Vec3i subtract(Vec3i i) {
        return new Vec3i(x - i.x, y - i.y, z - i.z);
    }

    public Vec3i multiply(Vec3i i) {
        return new Vec3i(x * i.x, y * i.y, z * i.z);
    }

    public Vec3i divide(Vec3i i) {
        return new Vec3i(x / i.x, y / i.y, z / i.z);
    }

    public int distSq(Vec3i i) {
        return (x - i.x) * (x - i.x) + (y - i.y) * (y - i.y) + (z - i.z) * (z - i.z);
    }

    public double dist(Vec3i i) {
        return Math.sqrt(distSq(i));
    }

    public Location toLocation(World world) {
        return new Location(world, x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec3i vec3i = (Vec3i) o;
        return x == vec3i.x && y == vec3i.y && z == vec3i.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Vec3i{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
