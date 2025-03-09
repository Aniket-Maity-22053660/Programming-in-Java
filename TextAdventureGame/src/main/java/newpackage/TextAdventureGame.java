import java.util.Scanner;

// Represents a room in the game
class Room {
    String name;
    String description;
    Room north;
    Room south;
    Room east;
    Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }
}

// Represents the player
class Player {
    String name;
    int health;

    public Player(String name) {
        this.name = name;
        this.health = 100; // Initial health
    }
}

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create rooms
        Room startRoom = new Room("Start Room", "You are in a dark room. There's a faint light coming from the north.");
        Room treasureRoom = new Room("Treasure Room", "You found the treasure room! There are piles of gold coins everywhere.");
        Room enemyRoom = new Room("Enemy Room", "You've encountered a fierce enemy!");

        // Connect rooms
        startRoom.setNorth(treasureRoom);
        treasureRoom.setSouth(startRoom);
        treasureRoom.setEast(enemyRoom);
        enemyRoom.setWest(treasureRoom);

        // Create player
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Start the game
        System.out.println("Welcome to the Text Adventure Game, " + player.name + "!");
        System.out.println("Your goal is to find the treasure and defeat the enemy.");

        // Current room
        Room currentRoom = startRoom;

        // Game loop
        while (true) {
            System.out.println("\n---\n" + currentRoom.name);
            System.out.println(currentRoom.description);

            // Prompt user for next action
            System.out.print("Enter your next move (north/south/east/west): ");
            String move = scanner.nextLine().toLowerCase();

            // Move to the next room
            switch (move) {
                case "north":
                    if (currentRoom.getNorth() != null) {
                        currentRoom = currentRoom.getNorth();
                    } else {
                        System.out.println("You cannot go north from here.");
                    }
                    break;
                case "south":
                    if (currentRoom.getSouth() != null) {
                        currentRoom = currentRoom.getSouth();
                    } else {
                        System.out.println("You cannot go south from here.");
                    }
                    break;
                case "east":
                    if (currentRoom.getEast() != null) {
                        currentRoom = currentRoom.getEast();
                    } else {
                        System.out.println("You cannot go east from here.");
                    }
                    break;
                case "west":
                    if (currentRoom.getWest() != null) {
                        currentRoom = currentRoom.getWest();
                    } else {
                        System.out.println("You cannot go west from here.");
                    }
                    break;
                default:
                    System.out.println("Invalid move!");
            }

            // Check if player reached the treasure room
            if (currentRoom == treasureRoom) {
                System.out.println("Congratulations, you found the treasure!");
                System.out.println("You win!");
                break;
            }
        }

        scanner.close();
    }
}

