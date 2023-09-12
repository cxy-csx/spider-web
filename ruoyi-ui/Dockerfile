# 使用Node.js 16的基础镜像
FROM node:16

# 设置工作目录
WORKDIR /app

# 复制package.json和package-lock.json以提前安装依赖
COPY package*.json ./

# 安装项目依赖
RUN npm install

# 复制项目文件到工作目录
COPY . .

# 构建Vue.js项目
RUN npm run build

# 暴露一个端口（通常是80）
EXPOSE 80

# 运行Vue.js应用
CMD [ "npm", "run", "serve" ]
