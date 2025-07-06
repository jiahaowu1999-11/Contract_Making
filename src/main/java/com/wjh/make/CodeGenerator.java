package com.wjh.make;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {

    public static void main(String[] args) {
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java") // 设置输出目录
                .setAuthor("Your Name") // 设置作者
                .setOpen(false) // 设置生成后是否自动打开目录
                .setFileOverride(true) // 设置文件存在时是否覆盖
                .setServiceName("%sService") // 设置Service接口名后缀
                .setIdType(IdType.AUTO) // 设置主键生成策略
                .setSwagger2(true); // 设置是否生成Swagger注解

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.POSTGRE_SQL) // 设置数据库类型
                .setUrl("jdbc:postgresql://ep-black-lab-a8dde1xh-pooler.eastus2.azure.neon.tech/neondb?sslmode=require&channel_binding=require") // 数据库连接URL
                .setUsername("neondb_owner") // 数据库用户名
                .setPassword("npg_nyE6h2cTkDte") // 数据库密码
                .setDriverName("org.postgresql.Driver"); // 数据库驱动类名

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("newtable", "template_t") // 指定需要生成代码的表名
                .setNaming(NamingStrategy.underline_to_camel) // 设置表名转类名策略
                .setColumnNaming(NamingStrategy.underline_to_camel) // 设置列名转属性名策略
                .setEntityLombokModel(true) // 设置实体类使用Lombok模型
                .setRestControllerStyle(true) // 设置Controller使用REST风格
                .setTablePrefix(new String[]{"tbl_"}); // 设置表名前缀

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.wjh.make") // 设置父包名
                .setMapper("mapper") // 设置Mapper接口所在的子包名
                .setEntity("entity") // 设置实体类所在的子包名
                .setController("controller") // 设置Controller所在的子包名
                .setService("service") // 设置Service所在的子包名
                .setXml("mapper"); // 设置Mapper XML文件所在的子包名

        // 模板配置
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null) // 不生成XML文件
                .setController("templates/controller.java.vm") // 设置Controller模板路径
                .setEntity("templates/entity.java.vm") // 设置实体类模板路径
                .setMapper("templates/mapper.java.vm"); // 设置Mapper接口模板路径

        // 整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .setTemplate(templateConfig);

        // 执行生成
        autoGenerator.execute();
    }
}