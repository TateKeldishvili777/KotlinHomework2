import java.lang.Math.sqrt

fun main() {
    val x = Integer.valueOf(readLine())
    val y = Integer.valueOf(readLine())
    val func = Point(x,y)
    println(func.toString(x,y))
    println(func.equals(x,y))
    println(func.Symetric(x,y))
    println(func.distance(x,y))

}
class Point(val x: Int, val y: Int) {
    fun toString(x: Int, y: Int): String {
        return "Point(${x};${y})"
    }
    fun equals(x: Int, y: Int) {
        println("sheiyvanet meore wertilis koordinatebi: ")
        val x2 = Integer.valueOf(readLine())
        val y2 = Integer.valueOf(readLine())
        if(this.x == x2 &&  this.y == y2){
            println("Tolia")
        }
        else{
            println("araa toli")
        }
    }

    fun Symetric(x: Int, y: Int): String {
        return "simetriuli wertili satavis mimart Point(${-x};${-y})"
    }

    fun distance(x: Int, y: Int) {
        println("sheiyvanet wertilis koordinatebi romlamdec gsurt mandzili: ")
        val x3 = Integer.valueOf(readLine())
        val y3 = Integer.valueOf(readLine())
        val distance = sqrt(((x3 - this.x)*(x3 - this.x) + (y3 - this.y)*(y3 - this.y)).toDouble())
        println("mat shoris mandzilia ${distance}")
    }
}