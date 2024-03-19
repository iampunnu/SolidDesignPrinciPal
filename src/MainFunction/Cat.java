package MainFunction;

import java.util.Objects;

public class Cat {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals( cat.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rol);
    }

    public int rol;
    public String name;
}
