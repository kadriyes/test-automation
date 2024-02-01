package org.example;
import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Personel teamLead;
    private List<Personel> personelList;
    private List<String> assignmentList;

    public Departman(Personel teamLead) {
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void setTeamLead(Personel teamLead) {
        this.teamLead = teamLead;
    }

    public void addPersonel(Personel personel) {
        personelList.add(personel);
    }

    public void removePersonel(Personel personel) {
        personelList.remove(personel);
    }

    public void changePersonel(Personel oldPersonel, Personel newPersonel) {
        int index = personelList.indexOf(oldPersonel);
        if (index != -1) {
            personelList.set(index, newPersonel);
        }
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    public void markAssignmentCompleted(String assignment) {
        assignmentList.remove(assignment);
        System.out.println("Görev tamamlandı: " + assignment);
    }
}
