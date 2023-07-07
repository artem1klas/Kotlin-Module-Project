import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    while (Memento.start) {
        val menu: Menu = createMenu(Memento.numberScreen)
        menu.printScreen()
        var n: Int? //иницализация в последущем цикле при достижении валидного значения
        while (true) {
            n = scan.nextLine().toIntOrNull()
            if (menu.validNumber(n)) {
                break
            }
        }
        menu.onClick(n!!) //Проверка на null в функции validNumber класса Menu
    }
}

fun createMenu(i: Int): Menu {
    when (i) {
        0 -> return MainMenu()
        1 -> return ArchivesListMenu()
        2 -> return InArchiveMenu()
        3 -> return NotesListMenu()
        4 -> return InNoteMenu()
        else -> return MainMenu()
    }
}
