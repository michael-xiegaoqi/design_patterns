
## 工程说明

* 桥接模式（bridge pattern）

## 模式说明

* 将抽象部分与它的实现部分分离，使它们都可以独立地变化。 
* 意图：将抽象与实现解耦。
* 桥接模式主要应对的是由于实际的需要，某个类具有两个或者两个以上的维度变化（违反了SRP原则），如果只是用继承将无法实现这种需要，或者使得设计变得相当臃肿。

## 这个模式的角色

* Abstraction：定义抽象接口，拥有一个Implementor类型的对象引用 
* RefinedAbstraction：扩展Abstraction中的接口定义 
* Implementor：是具体实现的接口，Implementor和RefinedAbstraction接口并不一定完全一致，实际上这两个接口可以完全不一样Implementor提供具体操作方法，而Abstraction提供更高层次的调用 
* ConcreteImplementor：实现Implementor接口，给出具体实现

## 效果及实现要点

* 桥接模式使用对象见的组合关系解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。
* 所谓抽象和实现沿着各自维度的变化，即“子类化”它们，得到各个子类之后，便可以任意它们，从而获得不同路上的不同其次。
* 桥接模式有时候类似于多继承方案，但是多继承方案往往违背了SRP原则，复用性较差。桥接模式是比继承方案更好的解决方法。
* 桥接模式的应用一般在“两个非常强的变化维度”，有时候即使有两个变化的维度，但是某个方向的变化维度并不剧烈——换而言之两个变化不会导致纵横交错的结果，并不一定要使用桥接模式。

## 使用场景
* 如果你不希望在抽象和实现部分采用固定的绑定关系，可以采用桥接模式，来把抽象和实现部分分开，然后在程序运行期间来动态的设置抽象部分需要用到的具体的实现，还可以动态切换具体的实现。
* 如果出现抽象部分和实现部分都应该可以扩展的情况，可以采用桥接模式，让抽象部分和实现部分可以独立的变化，从而可以灵活的进行单独扩展，而不是搅在一起，扩展一边会影响到另一边。
* 如果希望实现部分的修改，不会对客户产生影响，可以采用桥接模式，客户是面向抽象的接口在运行，实现部分的修改，可以独立于抽象部分，也就不会对客户产生影响了，也可以说对客户是透明的。
* 如果采用继承的实现方案，会导致产生很多子类，对于这种情况，可以考虑采用桥接模式，分析功能变化的原因，看看是否能分离成不同的纬度，然后通过桥接模式来分离它们，从而减少子类的数目。

## Jdk中的桥接模式

* JDBC连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不动，原因就是JDBC提供了统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了


