package MainFunction.Scanner;

import java.io.Serializable;

public class Village implements Serializable {
    public String name;
    public String pradhan;
    public Long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPradhan() {
        return pradhan;
    }

    public void setPradhan(String pradhan) {
        this.pradhan = pradhan;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double area;

    @Override
    public String toString() {
        return "Village{" +
                "name='" + name + '\'' +
                ", pradhan='" + pradhan + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
