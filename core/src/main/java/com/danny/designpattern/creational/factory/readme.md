#工厂模式由来

在简单工厂模式中,只提供了一个工厂类,该工厂类处于对产品类进行实例化的中心位置,它知道每一个产品对象的创建细节,并决定何时实例化哪一个产品类。简单工厂模式最大的缺点是当有新产品要加入到系统中时,必须修改工厂类,加入必要的处理逻辑,这违背了 “开闭原则”。在简单工厂模式中,所有的产品都是由同一个工厂创建,工厂类职责较重,业务逻辑较为复杂, 具体产品与工厂类之间的耦合度高,严重影响了系统的灵活性和扩展性,而工厂方法模式则可以很好地解决这 一问题。

现在对简单工厂进行修改，不再用一个工厂去生产各种产品，而是将具体产品的生产交给具体的工厂子类来实现，我们先定义一个抽象工厂，再定义具体的工厂类，分别生产具体的产品。
这种抽象化的结果使这种结构可以在不修改具体工厂类的情况下引进新的产品,如果出现新的产品类型,只需要为这种新类型的产品创建一个具体的工厂类就可以获得该新产品的实例,这一特点无疑使得工厂方法模式具有超越简单工厂模式的优越性,更加符合“开闭原则”。

#模式定义
工厂方法模式(Factory Method Pattern)又称为工厂
模式,也叫虚拟构造器(Virtual Constructor)模式或 者多态工厂(Polymorphic Factory)模式,它属于类创 建型模式。
在工厂方法模式中,工厂父类负责定义创建 产品对象的公共接口,而工厂子类则负责生成具体的产 品对象,这样做的目的是将产品类的实例化操作延迟到 工厂子类中完成,即通过工厂子类来确定究竟应该实例 化哪一个具体产品类。


#模式分析
工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了面向对象的多态性,工厂方法模式保持了简单工厂模式的优点,而且克服了它的缺点。在工厂方法模式中,核心的工厂类不再负责所有产品的创建,而是将具体创建工作交给子类去做。这个核心类仅仅负责给出具体工厂必须实现的接口,而不负责哪一个产品类被实例化这种细节,这使得工厂方法模式可以允许系统在不修改工厂角色的情况下引进新产品。

当系统扩展需要添加新的产品对象时,仅仅需要添加一个具体产品对象以及一个具体工厂对象,原有工厂对象不需要进行任何修改,也不需要修改客户端,很好地符合了“开闭原则”。而简单工厂模式在添加新产品对象后不得不修改工厂方法,扩展性不好。工厂方法模式退化后可以演变成简单工厂模式。


#模式优缺点

工厂方法模式的优点
  
• 在工厂方法模式中,工厂方法用来创建客户所需要的产品,同时还向客户隐藏了哪种具体产品类将被实例化这一细节,用户只需要关心所需产品对应的工厂,无须关心创建细节,甚至无须知道具体产品类的类名。

• 基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。它能够使工厂可以自主确定创建何种产品对象,而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式之所以又被称为多态工厂模式,是因为所有的具体工厂类都具有同一抽象父类。

• 使用工厂方法模式的另一个优点是在系统中加入新产品时,无 须修改抽象工厂和抽象产品提供的接口,无须修改客户端,也 无须修改其他的具体工厂和具体产品,而只要添加一个具体工 厂和具体产品就可以了。这样,系统的可扩展性也就变得非常 好,完全符合“开闭原则”。

工厂方法模式的缺点

• 在添加新产品时,需要编写新的具体产品类,而且还要提供与之对应的具体工厂类,系统中类的个数将成对增加,在一定程度上增加了系统的复杂度,有更多的类需要编译和运行,会给系统带来一些额外的开销。

• 由于考虑到系统的可扩展性,需要引入抽象层,在客户端代码中均使用抽象层进行定义,增加了系统的抽象性和理解难度,且在实现时可能需要用到DOM、反射等技术,增加了系统的实现难度

#模式适用环境
 
 在以下情况下可以使用工厂方法模式:
 
• 一个类不知道它所需要的对象的类:在工厂方法模式中,客户端不需要知道具体产品类的类名,只需要知道所对应的工厂即可,具体的产品对象由具体工厂类创建;客户端需要知道创建具体产品的工厂类。

• 一个类通过其子类来指定创建哪个对象:在工厂方法模式中,对于抽象工厂类只需要提供一个创建产品的接口,而由其子类来确定具体要创建的对象,利用面向对象的多态性和里氏代换原则,在程序运行时,子类对象将覆盖父类对象,从而使得系统更容易扩展。

• 将创建对象的任务委托给多个工厂子类中的某一个,客户端在使用时可以无须关心是哪一个工厂子类创建产品子类,需要时再动态指定,可将具体工厂类的类名存储在配置文件或数据库中。

#模式应用
(1) java.util.Collection接口的迭代器iterator()方法
 
(2) Java消息服务JMS(Java Messaging Service) 
```
//使用上下文和JNDI得到连接工厂的引用,ctx是上下文Context类型 的对象
QueueConnectionFactory qConnFact=(QueueConnectionFactory)ctx.lookup("cfJndi"); //使用连接工厂创建一个连接
QueueConnection qConn=qConnFact.createQueueConnection();
//使用连接创建一个会话
QueueSession qSess=qConn.createQueueSession(false,javax.jms.QueueSessi on. AUTO_ACKNOWLEDGE); //使用上下文和JNDI得到消息队列的引用
Queue q=(Queue)ctx.lookup("myQueue"); //使用连接创建一个需要发送的消息类型的实例
QueueSender qSend=qSess.createSender(q); System.out.println("开始发送消息......");
```
(3)JDBC中的工厂方法
```
Connection
conn=DriverManager.getConnection("jdbc:microsoft:sql server://localhost:1433; DatabaseName=DB;user=sa;password=");
Statement statement=conn.createStatement();
ResultSet rs=statement.executeQuery("select * from UserInfo");
```

#模式扩展
用多个工厂方法:在抽象工厂角色中可以定义多个工厂方法,从而使具体工厂角色实现这些不同的工厂方法,这些方法可以包含不同的业务逻辑,以满足对不同的产品对象的需求。

产品对象的重复使用:工厂对象将已经创建过的产品保存到一个集合(如数组、List等)中,然后根据客户对产品的请求,对集合进行查询。如果有满足要求的产品对象,就直接将该产品返回客户端;如果集合中没有这样的产品对象,那么就创建一个新的满足要求的产品对象,然后将这个对象在增加到集合中,再返回给客户端。

多态性的丧失和模式的退化:如果工厂仅仅返回一个具体产品对象,便违背了工厂方法的用意,发生退化,此时就不再是工厂方法模式了。一般来说,工厂对象应当有一个抽象的父类型,如果工厂等级结构中只有一个具体工厂类的话,抽象工厂就可以省略,也将发生了退化。当只有一个具体工厂,在具体工厂中可以创建所有的产品对象,并且工厂方法设计为静态方法时,工厂方法模式就退化成简单工厂模式。
  
  
总结

工厂方法模式又称为工厂模式,它属于类创建型模式。在工厂方法模式中,工厂父类负责定义创建产品对象的公共接口,而工厂子类则负责生成具体的产品对象,这样做的目的是将产品类的实例化操作延迟到工厂子类中完成,即通过工厂子类来确定究竟应该实例化哪一个具体产品类。

工厂方法模式包含四个角色:抽象产品是定义产品的接口,是工厂方法模式所创建对象的超类型,即产品对象的共同父类或接口;具体产品实现了抽象产品接口,某种类 型的具体产品由专门的具体工厂创建,它们之间往往一一对应;抽象工厂中声明了工厂方法,用于返回一个产品,它是工厂方法模式的核心,任何在模式中创建对象的工厂类都必须实现该接口;具体工厂是抽象工厂类的子类,实现了抽象工厂中定义的工厂方法,并可由客户调用,返回一个具体产品类的实例
  
工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了面向 对象的多态性,工厂方法模式保持了简单工厂模式的优点,而且克服了它的缺点。在工厂方法模式中,核心的工厂类不再负责所有产品的创建,而是将具体创建工作交给子类去做。这个核心类仅仅负责给出具体工厂必须实现的接口,而不负责产品类被实例化这种细节,这使得工厂方法模式可以允许系统在不修改工厂角色的情况下引进新产品。

工厂方法模式的主要优点是增加新的产品类时无须修改现有系统,并封装了产品对象的创建细节,系统具有良好的灵活性和可扩展性;其缺点在于增加新产品的同时需要增加新的工厂,导致系统类的个数成对增加,在一定程度上增加了系统的复杂性。

工厂方法模式适用情况包括:一个类不知道它所需要的对象的类;一个类通过其子类来指定创建哪个对象;将创建对象的任务委托给多个工厂子类中的某一个,客户端在使用时可以无须关心是哪一个工厂子类创建产品子类,需要时再动态指定