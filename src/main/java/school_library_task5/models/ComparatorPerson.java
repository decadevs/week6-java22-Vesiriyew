package school_library_task5.models;

import school_library_task5.enums.Role;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        return Comparator.comparingInt(this::mapRoleToOrder)
                .compare(p1, p2);
    }

    private int mapRoleToOrder(Person p) {
        Role role = p.getRole();
        return role == Role.TEACHER ? 0 : role == Role.SENIOR_STUDENT ? 1 : role == Role.JUNIOR_STUDENT ? 2 : 3;
    }

}











