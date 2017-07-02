### 什么是装饰者模式
装饰者模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。这就是面向对象设计中常提到的优先使用组合而不是继承。

### UML图
![装饰者模式](http://img.blog.csdn.net/20170702182255407?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDY1NzA5NA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

图中抽象类Component是被装饰者基类，ConcreteComponent是将要动态地加上新行为的对象，它扩展了Component。Decorator是装饰者共同实现的接口或者是抽象类。ConcreteDecoratorA和ConcreteDecoratorB都是实现或扩展了Decorator的装饰者，它们都有一个Component的私有实例变量，实现了抽象类的方法，并且可以加上新的方法从而实现扩展功能。

### 代码实现
Component
```
/**
 * Created by yrs on 2017/7/2.
 */
public abstract class Component {
    public abstract void say();
}
```

ConcreteComponent
```
/**
 * Created by yrs on 2017/7/2.
 */
public class ConcreteComponent extends Component {
    @Override
    public void say() {
        System.out.println("this is ConcreteComponent.");
    }
}
```

Decorator
```
/**
 * Created by yrs on 2017/7/2.
 */
public abstract class Decorator extends Component {

}
```

ConcreteDecoratorA
```
/**
 * Created by yrs on 2017/7/2.
 */
public class ConcreteDecoratorA extends Decorator {

    private Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        preSay();
        component.say();
        sufSay();
    }

    public void preSay() {
        System.out.println("Welcome everyone!");
    }

    public void sufSay() {
        System.out.println("Thank you!");
    }
}
```

ConcreteDecoratorB
```
/**
 * Created by yrs on 2017/7/2.
 */
public class ConcreteDecoratorB extends Decorator {

    private Component component;

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        component.say();
        sayHelp();
    }

    public void sayHelp() {
        System.out.println("please help me!");
    }

}
```

Test
```
/**
 * Created by yrs on 2017/7/2.
 */
public class Test {
    public static void main(String [] args) {

        //用ConcreteDecoratorA类装饰ConcreteComponent对象
        component = new ConcreteDecoratorA(component); 
        
        //用ConcreteDecoratorB类装饰ConcreteComponent对象
        component = new ConcreteDecoratorB(component);

        component.say();
    }
}
```

**装饰者模式的重点是装饰者有一个被装饰者的实例变量**

### Java IO中的装饰者模式
![Java IO中的装饰者模式](http://img.blog.csdn.net/20170702184006827?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDY1NzA5NA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)