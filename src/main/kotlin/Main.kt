fun main() {
    val seconds: Int = 10000
    agoToText(seconds)
}

fun agoToText(seconds: Int) {

    when (seconds) {
        in 0..60 -> println("был(а) только что")
        in 61..60 * 60 -> minutes(seconds)
        in 60 * 60 + 1..24 * 60 * 60 -> hours(seconds)
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> println("был(а) сегодня")
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> println("был(а) вчера")
        else -> println("был(а) давно")
    }
}

fun minutes(seconds: Int) {
    if (seconds >= 11 * 60 && seconds < 12 *60 ){
        println("был(а) 11 минут назад")
    } else {

        val minute:Int = seconds/60
        val minuteStr = minute.toString()

        if(minuteStr[minuteStr.lastIndex].toString() == "1"){
            println("был(а) $minute минуту назад")
        } else {
            println("был(а) $minute минут назад")
        }
    }
}

fun hours(seconds: Int){

    val hour: Int = seconds / 60 / 24

    when (hour){
        1 -> println("был(а) $hour час назад")
        in 2..4 -> println("был(а) $hour часа назад")
        in 5..20 -> println("был(а) $hour часов назад")
        in 2..24 -> println("был(а) $hour часа назад")
    }
}