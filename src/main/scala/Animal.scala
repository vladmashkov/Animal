case class Creature (weight: Int, lenght: Int, coatLenght: Int)
object Main extends App {
  def CreatureDefinition (creature: Creature): String = creature match {
    case creature if (creature.weight >= 200 && creature.weight <= 250 && creature.lenght >= 1 && creature.lenght <= 3 && creature.coatLenght >= 1 && creature.coatLenght <= 30) => "Лев"
    case creature if (creature.weight >= 0 && creature.weight <= 2 && creature.lenght >= 2 && creature.lenght <= 4 && creature.coatLenght == 0) => "Черная Мамба"
    case creature if (creature.weight >= 5000 && creature.lenght >= 5 && creature.lenght <= 7 && creature.coatLenght >= 0 && creature.coatLenght <= 15) => "Слон"
    case creature if (creature.weight >= 200 && creature.weight <= 550 && creature.lenght >= 2 && creature.lenght <= 4 && creature.coatLenght == 0) => "Нильский крокодил"
    case creature if (creature.weight >= 0 && creature.weight <= 1 && creature.lenght == 0 && creature.coatLenght >= 2 && creature.coatLenght <= 5) => "Сурикат"
    case creature => "Неопознанное существо!!!"
  }
val creature = new Creature(scala.io.StdIn.readLine("Введите вес животного: ").toInt, scala.io.StdIn.readLine("Введите длину тела животного: ").toInt, scala.io.StdIn.readLine("Введите длину шерсти животного: ").toInt)
println(CreatureDefinition(creature))
}