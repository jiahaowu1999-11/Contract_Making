package com.wjh.make.freemarker;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

public class FreemarkerConfig {
    private static Configuration cfg;
    
    public static Configuration getConfig() throws IOException {
        if (cfg == null) {
            // 创建配置实例并指定版本
            cfg = new Configuration(Configuration.VERSION_2_3_32);
            
            // 设置模板目录
            cfg.setDirectoryForTemplateLoading(new File("./ftl"));
            
            // 设置编码
            cfg.setDefaultEncoding("UTF-8");
            
            // 设置异常处理器
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            
            // 不缓存模板
            cfg.setCacheStorage(new freemarker.cache.NullCacheStorage());
        }
        return cfg;
    }
}