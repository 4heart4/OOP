import java.util.ArrayList;
import java.util.List;


class MyList<T extends Number> {
    private List<T> list = new ArrayList<>();

    void add (T argument) {
        list.add(argument);
    }

    private List<T> getList () {
        return list;
    }

    T largest () {
        T value = getList().get(0);
        for (int i = 1; i < getList().size(); i++) {
            if (getList().get(i).doubleValue() > value.doubleValue()) {
                value = getList().get(i);
            }
        }
        return value;
    }

    T smallest () {
        T value = getList().get(0);
        for (int i = 1; i < getList().size(); i++) {
            if (getList().get(i).doubleValue() < value.doubleValue()) {
                value = getList().get(i);
            }
        }
        return value;
    }
}
