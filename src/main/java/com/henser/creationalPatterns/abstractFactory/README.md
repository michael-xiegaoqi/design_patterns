
## 工程说明

* 抽象工厂方法模式 （abstract Factory pattern）
    
## 模式说明

* 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

## 模式的场景

* 举个生活中常见的例子——组装电脑，我们在组装电脑的时候，通常需要选择一系列的配件，比如CPU、硬盘、内存、主板、电源、机箱等。为讨论使用简单点，只考虑选择CPU和主板的问题。
* 事实上，在选择CPU的时候，面临一系列的问题，比如品牌、型号、针脚数目、主频等问题，只有把这些问题都确定下来，才能确定具体的CPU。
* 同样，在选择主板的时候，也有一系列问题，比如品牌、芯片组、集成芯片、总线频率等问题，也只有这些都确定了，才能确定具体的主板。
* 选择不同的CPU和主板，是每个客户在组装电脑的时候，向装机公司提出的要求，也就是我们每个人自己拟定的装机方案。
* 在最终确定这个装机方案之前，还需要整体考虑各个配件之间的兼容性。比如：CPU和主板，如果使用Intel的CPU和AMD的主板是根本无法组装的。因为Intel的CPU针脚数与AMD主板提供的CPU插口不兼容，就是说如果使用Intel的CPU根本就插不到AMD的主板中，所以装机方案是整体性的，里面选择的各个配件之间是有关联的。
* 对于装机工程师而言，他只知道组装一台电脑，需要相应的配件，但是具体使用什么样的配件，还得由客户说了算。也就是说装机工程师只是负责组装，而客户负责选择装配所需要的具体的配件。因此，当装机工程师为不同的客户组装电脑时，只需要根据客户的装机方案，去获取相应的配件，然后组装即可。

## 抽象工厂模式与工厂方法模式的最大区别

* 工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则需要面对多个产品等级结构。

## 产品族和产品等级

* 产品族 ：是指位于不同产品等级结构中，功能相关联的产品组成的家族。比如AMD的主板、芯片组、CPU组成一个家族，Intel的主板、芯片组、CPU组成一个家族。而这两个家族都来自于三个产品等级：主板、芯片组、CPU。一个等级结构是由相同的结构的产品组成
* 产品等级 ：主板、芯片组、CPU
* 不同的等级结构具有平行的结构。因此，如果采用工厂方法模式，就势必要使用三个独立的工厂等级结构来对付这三个产品等级结构。由于这三个产品等级结构的相似性，会导致三个平行的工厂等级结构。随着产品等级结构的数目的增加，工厂方法模式所给出的工厂等级结构的数目也会随之增加
* 可以使用同一个工厂等级结构来对付这些相同或者极为相似的产品等级结构，而且这就是抽象工厂模式的好处。同一个工厂等级结构负责三个不同产品等级结构中的产品对象的创建。
* 一个工厂等级结构可以创建出分属于不同产品等级结构的一个产品族中的所有对象。显然，这时候抽象工厂模式比简单工厂模式、工厂方法模式更有效率。对应于每一个产品族都有一个具体工厂。而每一个具体工厂负责创建属于同一个产品族，但是分属于不同等级结构的产品。

## 模式结构

* 抽象工厂模式是对象的创建模式，它是工厂方法模式的进一步推广。
* 假设一个子系统需要一些产品对象，而这些产品又属于一个以上的产品等级结构。那么为了将消费这些产品对象的责任和创建这些产品对象的责任分割开来，可以引进抽象工厂模式。这样的话，消费产品的一方不需要直接参与产品的创建工作，而只需要向一个公用的工厂接口请求所需要的产品。
* 通过使用抽象工厂模式，可以处理具有相同（或者相似）等级结构中的多个产品族中的产品对象的创建问题。
* 由于主板、CPU 这两产品族的等级结构相同，因此使用同一个工厂族也可以处理这两个产品族的创建问题，这就是抽象工厂模式。
* 每一个工厂角色都有两个工厂方法，分别负责创建分属不同产品等级结构的产品对象。

## 何时适合使用抽象工厂模式

* 一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有形态的工厂模式都是重要的。
* 一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有形态的工厂模式都是重要的。
* 同属于同一个产品族的产品是在一起使用的，这一约束必须在系统的设计中体现出来。（比如：Intel主板必须使用Intel CPU、Intel芯片组）
* 系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于实现。

## 抽象工厂模式的起源

* 抽象工厂模式的起源或者最早的应用，是用于创建分属于不同操作系统的视窗构建。比如：命令按键（Button）与文字框（Text)都是视窗构建，在UNIX操作系统的视窗环境和Windows操作系统的视窗环境中，这两个构建有不同的本地实现，它们的细节有所不同。
* 在每一个操作系统中，都有一个视窗构建组成的构建家族。在这里就是Button和Text组成的产品族。而每一个视窗构件都构成自己的等级结构，由一个抽象角色给出抽象的功能描述，而由具体子类给出不同操作系统下的具体实现。
* 可以发现在上面的产品类图中，有两个产品的等级结构，分别是Button等级结构和Text等级结构。同时有两个产品族，也就是UNIX产品族和Windows产品族。UNIX产品族由UNIX Button和UNIX Text产品构成；而Windows产品族由Windows Button和Windows Text产品构成
* 系统对产品对象的创建需求由一个工程的等级结构满足，其中有两个具体工程角色，即UnixFactory和WindowsFactory。UnixFactory对象负责创建Unix产品族中的产品，而WindowsFactory对象负责创建Windows产品族中的产品。这就是抽象工厂模式的应用
* 一个系统只能够在某一个操作系统的视窗环境下运行，而不能同时在不同的操作系统上运行。所以，系统实际上只能消费属于同一个产品族的产品。
* 现代的应用中，抽象工厂模式的使用范围已经大大扩大了，不再要求系统只能消费某一个产品族了。因此，可以不必理会前面所提到的原始用意。

## 抽象工厂模式的优点

* 分离接口和实现 ：客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁，客户端只是面向产品的接口编程而已。也就是说，客户端从具体的产品实现中解耦。
* 使切换产品族变得容易：因为一个具体的工厂实现代表的是一个产品族，比如上面例子的从Intel系列到AMD系列只需要切换一下具体工厂。

## 抽象工厂模式的缺点

* 不太容易扩展新的产品 ：如果需要给整个产品族添加一个新的产品，那么就需要修改抽象工厂，这样就会导致修改所有的工厂实现类。