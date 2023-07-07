class InNoteMenu() : Menu() {
    override var validNumber = 0
    val selectedArchive = Memento.myArchive[Memento.indexArchive]
    val selectedNote = selectedArchive.archiev[Memento.indexNote]
    override fun printScreen(): Unit {
        println("--Вы находитесь в заметке \"${selectedNote.name}\" архива \"${selectedArchive.name}\"\nТекст заметки: ${selectedNote.text}\n0. Назад")
    }

    override fun onClick(i: Int): Unit {
        when (i) {
            0 -> Memento.numberScreen = 3
        }
    }
}