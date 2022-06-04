# Functional Interface

#### The interface contains only one abstract method but can have multiple default and static methods.


```java
@FunctionalInterface
public interface Addable {

    int add(int a, int b);
    
    default void method1(){
        System.out.println("Default method 1");
    }

    default void method2(){
        System.out.println("Default method 2");
    }

    static void method1(){
        System.out.println("Static method 1");
    }

    static void method2(){
        System.out.println("Static method 2");
    }
}
```

##Pre-defined FunctionalInterfaces

Consumer<Integer> -> void accept(Integer val);

Predicate<Integer> -> boolean test(Integer val);

Supplier<Integer> -> Integer get();