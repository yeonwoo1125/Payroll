package spring.guide.payroll.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String role;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString(){
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
