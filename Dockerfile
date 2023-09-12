# 使用 OpenJDK 8 镜像作为基础镜像
FROM openjdk:8-jre
# 设置工作目录
WORKDIR /app

# 复制应用程序 JAR 文件到容器中
COPY ruoyi-admin.jar app.jar

# 暴露应用程序运行的端口（如果需要的话）
EXPOSE 8080

# 启动应用程序
CMD ["java", "-jar", "app.jar"]