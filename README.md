### 上传tar包服务(任务)最新的工程模板

精卫3上传tar包类型的服务(任务)，依赖externalApi的方式的工程模板，默认提供了几种常见自定义实现。
用户可以选择符合自己需求的模板，修改对应app的groupId/artifactId为自己业务的id即可(注意需要同步修改src/main/assembly/assembly.xml下的app名字)，
其他多余的app示例代码可以删除。

- common公用的代码
- app1 单条回调实现
- app2 基于HSF服务
- app3 batch回调实现
- debug 基本本地模式调试的方法

## 掌中宝数据

### 商品表 wdk_merchant_store_sku_rt  <- wdk_merchant_store_sku



### 订单表 wdk_loc_biz_order_recent   <- wdk_loc_biz_order


### 销售数据表 wdk_item_trd_pay_ri <- ?
