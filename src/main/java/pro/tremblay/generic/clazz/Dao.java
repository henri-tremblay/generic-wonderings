package pro.tremblay.generic.clazz;

public interface Dao {
    <T extends BaseClass> Class<T> getType();
}
