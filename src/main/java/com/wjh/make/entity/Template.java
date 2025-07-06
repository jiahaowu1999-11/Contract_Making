package com.wjh.make.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 模版类
 * CREATE TABLE public.template_t (
 * 	tpl_id varchar NOT NULL,
 * 	tpl_name varchar NOT NULL,
 * 	tpl_version varchar NOT NULL,
 * 	ftl_id varchar NOT NULL,
 * 	tms timestamp NOT NULL,
 * 	update_time timestamp NOT NULL,
 * 	update_by varchar NOT NULL,
 * 	created_by varchar NOT NULL,
 * 	CONSTRAINT template_t_unique UNIQUE (tpl_id)
 * );
 */
@TableName("template_t")
public class Template {

}
