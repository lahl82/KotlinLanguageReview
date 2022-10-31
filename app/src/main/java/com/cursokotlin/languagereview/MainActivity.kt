package com.cursokotlin.languagereview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var name = "cinco"
    var edad:Int = 27
    var distancia:Long = 55221133
    var monto:Float = 55.5f
    var promedio:Double = 55.5555555555

    var letra:Char = 'A'
    var cadena:String = "Hola Mundo"
    var acumulado:Int = 0
    var bandera:Boolean = true
    val mes:Int = 5
    val constante:String = "Luis"

    println("Hello, world!!!")

    val saludo:String = "Hola"
    acumulado += sumar(100, 50)
    acumulado += sumar(100)
    acumulado += sumar()
    acumulado += sumar(num1=100)
    acumulado += sumar(num2=50)
    acumulado += sumar(num1=100, num2=50)

    println("El acumulado es: $acumulado")

    println("El mes actual es ${queMesEs(mes)}")

    println("El Trimestre actual es el ${queTrimestreEs(mes)}")

    println("El Semestre actual es el ${queSemestreEs(mes)}")

    println("El Tipo de la variable mes es ${queTipoEs(mes)}")

    var numeroMes:String = queNumeroMesEs("Otro")

    println("El Numero de mes es ${numeroMes}")

    println("El mes es ${getNombreMes(mes-1)}")

    println("El mes en la lista es ${listaMeses(mes-1)}")

    println("El mes en la lista Mutable es ${mutableListaMeses(mes-1)}")

}


fun sumar(num1:Int = 1, num2:Int = 2):Int
{
    val saludo:String = "Hola"
    println("$saludo, el resultado es:")
    var suma:Int = num1 + num2
    println(suma)

    return suma
}

fun queMesEs(mes:Int):String{
    return when(mes){
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Incorrecto"
    }
}
fun queTrimestreEs(mes:Int):String{
    return when(mes){
        1,2,3 -> "Primer"
        4,5,6 -> "Segundo"
        7,8,9 -> "Tercer"
        10,11,12 -> "Cuarto"

        else -> "Incorrecto"
    }
}

fun queSemestreEs(mes:Int):String{
    return when(mes){
        in 1..6 -> "Primer"
        in 7..12 -> "Segundo"
        !in 1..12 -> "errado"
        else -> "Incorrecto"
    }
}

fun queTipoEs(tipo:Any):String{
    return when(tipo){
        is String -> "Cadena"
        is Int -> "Entero"
        else -> "Desconocido"
    }
}

fun queNumeroMesEs(mes:String):String{
    return when(mes){
        "Enero" -> "1"
        "Febrero" -> "2"
        "Marzo" -> "3"
        "Abril" -> "4"
        "Mayo" -> "5"
        "Junio" -> "6"
        "Julio" -> "7"
        "Agosto" -> "8"
        "Septiembre" -> "9"
        "Octubre" -> "10"
        "Noviembre" -> "11"
        "Diciembre" -> "12"
        else -> "Desconocido"
    }
}

fun getNombreMes(mes:Int):String{
    val meses = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")

    meses.forEach{
        println(it)
    }

    meses[0] = "January"

    meses.forEach{ i ->
        println(i)
    }

    println("meses en array: $meses")

    return meses[mes]
}

fun listaMeses(mes:Int):String{
    val meses:List<String> = listOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")

    println(meses.size)

    println(meses[2])

    //meses[0] = "January"

    println(meses.first())

    println("Meses en lista: $meses")

    return meses[mes]
}

fun mutableListaMeses(mes:Int):String{
    val meses:MutableList<String> = mutableListOf("Enero", "marzo", "Abril", "Mayo", "Junio")
    val mesesVacio:MutableList<String> = mutableListOf()

    println(meses)
    meses.add(1, "febrero")
    meses.add("junio")
    meses[0] = "January"
    meses[meses.size-1] = "last"

    println(meses)

    var filtrado = meses.filter{ it[0].lowercaseChar() == 'm' }

    println(filtrado)

    meses.forEach{ mesesVacio.add("$it:") }

    println(mesesVacio)

    return meses[mes]
}
