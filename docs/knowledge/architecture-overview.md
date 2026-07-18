# Architecture Overview

## 系统定位

支持公共图库、私有空间和团队协作的智能图片资产平台。

## 主链路

```text
上传/抓取图片 → 校验与存储 → 元数据处理 → 搜索/分类 → 空间权限 → 团队协作
```

## 模块边界

- yu-picture-backend/ 经典分层后端
- yu-picture-backend-ddd/ DDD 后端
- yu-picture-frontend/ 前端

## 技术栈

Spring Boot、MyBatis-Plus、Redis、对象存储、Vue 3、TypeScript。

## 运行时依赖与失败模型

经典分层与 DDD 双实现不可交叉引用；对象存储删除要考虑数据库一致性；空间权限和批量查询需避免越权与 N+1。外部依赖不可用时，系统应返回明确失败或采用文档化的保守降级；不得产生看似成功但不可审计的结果。

## 变更检查表

- 公共模型或接口是否影响多个模块？
- 配置键、扫描路径、Mapper namespace 或 SPI 文件是否同步？
- 新增外部调用是否有超时、限流和错误语义？
- 日志是否避开凭据与个人数据？
- README、CONTEXT 和 ADR 是否仍与实现一致？
