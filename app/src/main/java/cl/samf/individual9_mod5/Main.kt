package cl.samf.individual9_mod5

fun main(){
    println("Ingresa El Valor")

    val input = readln()!!.toDouble()

    val fahrenheit = ((9.0 / 5.0) * input) + 32

    println("fahrenheit: $fahrenheit")

    val kelvin = input + 273.15

    println("kelvin: $kelvin")

    val fahrenheitAkelvin = 5.0 / 9.0 * (fahrenheit - 32) +273.15

    println("fahrenheitAkelvin: $fahrenheitAkelvin")
}
fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}