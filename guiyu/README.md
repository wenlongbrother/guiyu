##Redis命名
### 1、用户token
"userToken:" + token

注意：
    分号为英文分号

示例：
```java
        // 生成uuid
        UUID uuid = UUID.randomUUID();
        // 生成token
        String token = uuid.toString().replace("-", "");
        // 将token保存到redis
        redisTemplate.opsForValue().set("userToken:" + token, userInfo);
        