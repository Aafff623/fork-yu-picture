# Yu Picture · Context

## 一句话定位

支持公共图库、私有空间和团队协作的智能图片资产平台。

## 产品主链路

上传/抓取图片 → 校验与存储 → 元数据处理 → 搜索/分类 → 空间权限 → 团队协作。

## 代码边界

yu-picture-backend/ 经典分层后端；yu-picture-backend-ddd/ DDD 后端；yu-picture-frontend/ 前端。

## 技术与运行环境

Spring Boot、MyBatis-Plus、Redis、对象存储、Vue 3、TypeScript。

## 当前事实

- 当前二开维护者为 `threetwoa`。
- `origin` 指向增强仓，`upstream` 指向原始项目。
- 最近二开提交 `71dd466` 完成身份迁移、营销清理、核心注释和 README 重构。
- 上游里程碑：f5cbb68：会员兑换与中文化；0862eb0、489beba：引入 DDD 后端。

## 关键风险

经典分层与 DDD 双实现不可交叉引用；对象存储删除要考虑数据库一致性；空间权限和批量查询需避免越权与 N+1。

## 推荐阅读顺序

1. README：产品定位与启动入口。
2. 本文件与 `docs/agents/domain.md`：边界和术语。
3. 入口模块与主链路服务。
4. 配置、持久化、测试和部署文件。
5. `docs/adr/` 与 `docs/output/handoff/`：决策和已交付变更。
