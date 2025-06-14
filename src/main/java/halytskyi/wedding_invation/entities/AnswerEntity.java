package halytskyi.wedding_invation.entities;

import jakarta.persistence.*;

@Entity
@Table
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String family;

    private Boolean fromGroom;

    public AnswerEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getFromGroom() {
        return fromGroom;
    }

    public void setFromGroom(Boolean fromGroom) {
        this.fromGroom = fromGroom;
    }
}
