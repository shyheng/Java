package Map.HashMap;

import java.util.Objects;

public class Pres {
    private int on;
    private String name;

    public Pres() {
    }

    public Pres(int on, String name) {
        this.on = on;
        this.name = name;
    }

    public int getOn() {
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    重写
//    商品名字。号码相同就同一个商品

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pres pres = (Pres) o;
        return on == pres.on &&
                Objects.equals(name, pres.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(on, name);
    }
}
