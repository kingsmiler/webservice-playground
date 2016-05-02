弃坑说明
===========
在本示例中,对返回的列表作xml输出转换处理时,报以下异常:
javax.ws.rs.InternalServerErrorException: HTTP 500 Internal Server Error

但是在控制台什么信息都没有输出,根本不知道怎么回事!后来将相同的代码放到resteasy中去跑,它详细的说明的异常的原因:
1\需要有无参构造函数;
2\XmlRootElement修饰类名即可,不需要再在属性上添加XmlElement等等.

===========
虽然本示例最终调通,虽然只是练习测试,但是还是不再使用Jersey,将彻底倒向性能更好的resteasy.