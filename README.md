# java-common 通用的类库
本项目是一个Java基础类库，基于openjdk-8，无第三方jar包依赖，旨在规范项目代码，使开发人员能写出结构清晰，代码规范、逻辑清晰的项目。  

# 项目结构
🗀result  
|—— 🗀constant  &emsp;常量  
|   |—— 🗀dictionary  &emsp;字典，用作编码翻译。比如一个表字段is_deleted，值分别为0/1。0表示no，1表示yes  
|   |   |—— DictionaryInterface.java  &emsp;所有字典都要实现这个接口，不要定义一个大而全的字典类  
|   |   |—— YesNoDictionaryEnum.java  
|   |—— PageConstant.java  
|—— 🗀exception  &emsp;异常，提供了一个业务异常类BizException  
|   |—— BizException.java  &emsp;所有对外接口的异常处理都应该抛出此异常，然后由全局异常拦截处理返回结果  
|—— 🗀result  &emsp;result，用于结果返回  
|   |—— BaseResult.java  &emsp;返回结果基类，其它Result类继承此类。  
|   |—— CodeMessageInterface.java  &emsp;定义应用层响应状态码接口  
|   |—— CollectionResult.java  &emsp;集合类返回结果  
|   |—— GlobalCodeMessageEnum.java  &emsp;公共的全局的应用层响应状态码枚举，实现了CodeMessageInterface接口  
|   |—— ObjectResult.java  &emsp;单个对象返回结果  
|   |—— Page.java  
|   |—— PageResult.java  &emsp;分页返回结果  
|—— 🗀util  &emsp;工具类  
    |—— DictionaryUtil.java  
    |—— ResultUtil.java  &emsp;返回结果工具类，主要方法isSuccess()、isNotSuccess()  
