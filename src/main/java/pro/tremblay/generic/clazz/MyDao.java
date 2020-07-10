package pro.tremblay.generic.clazz;

public class MyDao implements Dao {
    @Override
    public Class<MyClass> getType() { // unchecked
        return MyClass.class;
    }
}
