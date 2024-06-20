public class GameMaster {

    public static String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public static String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public static String describe(TravelMethod travelMethod) {
        return travelMethod.name().equalsIgnoreCase("horseback") ? "You're traveling to your destination on horseback." : "You're traveling to your destination by walking.";
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character and Destination
}
