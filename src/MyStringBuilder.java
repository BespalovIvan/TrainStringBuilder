import java.util.Objects;


public final class MyStringBuilder {
    String value;
    int count;

    public MyStringBuilder(Object obj) {
        this.value = obj.toString();
        this.count = value.length();

    }

    public int compareTo(MyStringBuilder another) {
        return this.getValue().compareTo(another.getValue());
    }

    public MyStringBuilder append(Object obj) {
        count += obj.toString().length();
        this.setValue(this.getValue() + obj.toString());
        return this;
    }


    public int length() {
        return this.count;
    }

    static void checkOffset(int offset, int length) {
        if (offset < 0 || offset > length) {
            throw new StringIndexOutOfBoundsException("offset " + offset +
                    ", length " + length);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStringBuilder that = (MyStringBuilder) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
