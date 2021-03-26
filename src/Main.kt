fun main() {
    val n = 327;
    val result = count(n);
    println(result);
}

private fun count(n : Int) :Int {
    var number = n;
    var sum = 0;
    var multiply = 1;
    while(number > 0) {
        val reminder = number % 10;
        sum += reminder;
        multiply *= reminder
        number /= 10;
    }
    val answer = multiply - sum;
    return answer;
}
