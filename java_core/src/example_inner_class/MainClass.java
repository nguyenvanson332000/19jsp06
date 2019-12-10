package example_inner_class;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

/*
class OuterClass {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }
}
 */

/*
class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}
 */

// Link: https://www.w3schools.com/java/java_inner_classes.asp
public class MainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
