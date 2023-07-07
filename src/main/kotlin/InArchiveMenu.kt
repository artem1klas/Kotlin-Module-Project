import java.util.Scanner

class InArchiveMenu() : Menu() {
    override var validNumber: Int = 2
    val scan = Scanner(System.`in`)
    val selectArchive = Memento.myArchive[Memento.indexArchive]
    override fun printScreen(): Unit {
        println("--Вы находитесь в архиве \"${selectArchive.name}\"--\n0. Назад\n1. Создать заметку\n2. Просмотреть заметки")
    }

    override fun onClick(i: Int): Unit {
        when (i) {
            0 -> Memento.numberScreen = 1
            1 -> {
                println("--Создать заметку--\nВведите название заметки и на следующей строке текст заметки")
                selectArchive.archiev.add(Note(scan.nextLine(), scan.nextLine()))
            }

            2 -> {
                Memento.numberScreen = 3
            }
        }
    }
}