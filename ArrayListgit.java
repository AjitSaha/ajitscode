class Arrayobject {

    Object obj[] = new Object[10];
    int count = 0;

    public void add(int ele) {
        if (count == obj.length) {
            increase();
        }
        obj[count++] = ele;
    }

    public void increase() {
        Object obj1[] = new Object[obj.length + 5];
        for (int i = 0; i < obj.length; i++) {
            obj1[i] = obj[i];
        }
        obj = obj1;
    }

    public void display() {
        if (count == 0) {
            System.out.println("empty list");
            return;
        }
        for (int i = 0; i < count(); i++) {
            System.out.println(obj[i]);
        }
    }

    public int count() {
        return count;
    }

    public Object get_element(int index) {
        if (count == 0) {

            return "empty list";
        }

        if (index < 0 || index >= count()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return obj[index];
    }

    public void sel_element(Object ele, int index) {
        if (count == 0) {

            System.out.println("empty list");
            return;
        }
        if (index < 0 || index >= count()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        obj[index] = ele;
    }

    public Object remove(int index) {
        Object e = obj[index];
        if (count == 0) {
            return "empty list";
        }
        if (index < 0 || index >= count()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = index; i < count(); i++) {
            obj[index] = obj[index + 1];
        }
        obj[count()] = null;
        count--;
        return e;

    }

}

public class ArrayListgit {
    public static void main(String[] args) {
        Arrayobject a = new Arrayobject();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.display();
        System.out.println(a.count());
        System.out.println(a.get_element(3));
        a.sel_element(80, 3);
        a.display();
        System.out.println(a.remove(3));
        System.out.println(a.count());
        a.display();

    }
}
