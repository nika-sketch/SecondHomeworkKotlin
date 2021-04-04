import java.util.*
import java.math.*

fun main() {
    val coordinates = Point();
    coordinates.x = 4;
    coordinates.y = 2;
}

class Point {
    var x = 0;
    var y = 0;

    override fun equals(other: Any?): Boolean {
        if(other is Point) {
            if(other.x == x && other.y == y) {
                return true;
            }
        }
        return false;
    }

    override fun toString(): String {
        var firstCoordinate = x.toString();
        var secondCoordinate = y.toString();

        //concatenated
        return firstCoordinate + secondCoordinate;
    }

    fun reverse() {
        y *= -1;
        println(x);
        println(y);
    }
}


