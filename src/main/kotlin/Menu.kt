abstract class Menu() {
    // ValidNumber используется в фунции validNumber.
    // Переопределяется в классах наследниках в соответствии с количеством пунктов меню,
    // в т.ч. на основании текущего количества архивов и заметок
    open var validNumber: Int = 0

    //Выводит пункты меню, на основании макета, текущего количества архивов и заметок.
    abstract fun printScreen(): Unit

    //проводит проверку на null и на соответсвие количеству пунктов меню.
    //в классах наследниках не переопределяется
    fun validNumber(i: Int?): Boolean {
        if (i == null) {
            println("Вы ввели нецифровое значение, следует ввести цифру")
            return false
        } else if (i < 0 || i > validNumber) {
            println("Такой цифры нет в пунктах меню, введите корректную цифру")
            return false
        } else {
            return true
        }
    }

    //выполняет действие: переданная цифра соответсвует пунктам меню
    abstract fun onClick(i: Int): Unit
}
