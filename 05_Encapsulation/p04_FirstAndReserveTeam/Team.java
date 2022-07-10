package p05_Encapsulation.p04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();

    }

    public void addPlayer(Person person) {
        int age = person.getAge();
        if (age < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
    //The class should also have private method for setName and public methods for:
    //•	getName(): String
    //•	addPlayer(Person person): void
    //•	getFirstTeam(): List<Person> (Collections.unmodifiableList)
    //•	getReserveTeam(): List<Person> (Collections.unmodifiableList)

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return String.format("First team have %d players%nReserve team have %d players",
                firstTeam.size(), reserveTeam.size());
    }
}

