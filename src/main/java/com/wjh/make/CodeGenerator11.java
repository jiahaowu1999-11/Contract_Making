//package com.wjh.make;
//
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//
//import java.sql.Types;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class CodeGenerator11 {
//
//    private static final String jdbcUrl = "jdbc:postgresql://ep-black-lab-a8dde1xh-pooler.eastus2.azure.neon.tech/neondb?sslmode=require&channel_binding=require";
//    private static final String username = "neondb_owner";
//    private static final String password = "npg_nyE6h2cTkDte";
//    private static final String projectPath = "D:\\codes\\Contract_Making\\src\\main\\java\\com\\wjh\\make";
//    private static final String parentPackage = "com.wjh.make";
//    private static final String moduleName = "entity";
//    private static final String mapperPackage = "D:\\codes\\Contract_Making\\src\\main\\resources\\mapper";
//
//    public static void main(String[] args) {
//        System.out.println("请输入表，多张表用,隔开：");
//        Scanner scanner = new Scanner(System.in);
//        String[] tables = scanner.nextLine().split(",");
//        for (String table : tables){
//            FastAutoGenerator.create(jdbcUrl,
//                            username,
//                            password).globalConfig(builder -> {
//                        builder.author("wjh") // 设置作者
//                                .enableSwagger() // 开启 swagger 模式
//                                .outputDir(projectPath); // 指定输出目录
//                    }).dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
//                        int typeCode = metaInfo.getJdbcType().TYPE_CODE;
//                        if (typeCode == Types.SMALLINT) {
//                            // 自定义类型转换
//                            return DbColumnType.INTEGER;
//                        }
//                        return typeRegistry.getColumnType(metaInfo);
//                    })).packageConfig(builder -> builder.parent(parentPackage) // 设置父包名
//                            .moduleName(moduleName) // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperPackage)) // 设置mapperXml生成路径
//                    ).strategyConfig(builder -> builder.addInclude(table) // 设置需要生成的表名
//                            //.addTablePrefix("t_", "c_") // 设置过滤表前缀
//                            .addTableSuffix("_t")
//                    ).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//                    .execute();
//        }
//    }
//}
