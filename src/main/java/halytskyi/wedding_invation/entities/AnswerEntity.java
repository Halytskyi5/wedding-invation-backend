package halytskyi.wedding_invation.entities;

import jakarta.persistence.*;

@Entity
@Table
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String people;
    private Boolean fromGroom;

    public AnswerEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Boolean getFromGroom() {
        return fromGroom;
    }

    public void setFromGroom(Boolean fromGroom) {
        this.fromGroom = fromGroom;
    }
}
