import java.util.Scanner

class MainMenu() : Menu() {
    override var validNumber: Int = 2
    override fun printScreen(): Unit {
        println("--Главное меню--\n0. Выход\n1. Создать архив\n2. Просмотреть архивы")
    }

    override fun onClick(i: Int): Unit {
        when (i) {
            0 -> Memento.start = false
            1 -> {
                println("--Создать архив--\nВведите название архива")
                Memento.myArchive.add(Archiev(Scanner(System.`in`).nextLine()))
            }

            2 -> Memento.numberScreen = 1
        }
    }

}