package example

trait Animal {
  def run(): Unit = {}
}

class Cat extends Animal {
  override def run(): Unit = {
    println("I can run at 48km/h")
  }
}

class Cheetah extends Cat {
  override def run(): Unit = {
    println("I run at 93km/h, you can't see me")
  }
}

class Human extends Animal {
  override def run(): Unit = {
    println("20 km/h isn't so bad actually")
  }
}

class OlympicAthlete extends Human {
  override def run(): Unit = {
    println("40 km/h at maximum")
  }
}
