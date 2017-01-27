List of all my classes :
  Item class
  Weapon class
  Potion class
  Player class
  Position class
  Monster class
  Room class
  Map class
  Level class


    Since Weapon and Potion classes have several common properties. I create
  Item class which will be extended from Weapon and Potion class.

    Most of the object in a game should have their positions. Therefore,
  all classes extend from Position as well. Or, I will make Position class to
  be an abstract one since the position will be different for different objects.

    In my design, Map class is more general than Level class. Therefore, Level
  class will extend from Map class to make it more specific.

    Map class hold the actual map of what are the available slots (Room) that
  the player can actually walk to.

    To make it simple to the max, I design each room to have only one monster or
  item.

    I will use one boolean value to identify if the player can access the next
    level or not.
