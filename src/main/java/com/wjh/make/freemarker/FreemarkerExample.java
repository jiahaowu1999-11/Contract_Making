package com.wjh.make.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreemarkerExample {
    public static void main(String[] args) {
        try {
            // 获取配置实例
            Configuration cfg = FreemarkerConfig.getConfig();
            
            // 加载模板
            Template template = cfg.getTemplate("hello.ftl");
            
            // 准备数据模型
            Map<String, Object> dataModel = new HashMap<>();
            dataModel.put("user", "张三");
            
            // 添加图书列表
            List<Map<String, String>> books = new ArrayList<>();
            Map<String, String> book1 = new HashMap<>();
            book1.put("name", "Java 编程思想1111111111111111111111111111111323232");
            book1.put("author", "Bruce Eckel");
            books.add(book1);
            
            Map<String, String> book2 = new HashMap<>();
            book2.put("name", "Effective Java");
            book2.put("author", "Joshua Bloch");
            books.add(book2);
            
            dataModel.put("books", books);
            
            // 渲染模板
            Writer out = new OutputStreamWriter(System.out);
            template.process(dataModel, out);
            out.flush();
            
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}