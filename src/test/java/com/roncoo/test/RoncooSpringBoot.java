package com.roncoo.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 龙果教程-Spring Boot全集
 * 
 * @author wujing
 */
public class RoncooSpringBoot {
	private static Logger logger = Logger.getLogger(RoncooSpringBoot.class);

	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		logger.info("Start generator ...");
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true; // 是否覆盖原来的文件
		File configFile = new File("E:/springboot-learning-example/roncoo-mybatis-generator/src/test/resources/roncoo-spring-boot.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		logger.info("Finish generator");
	}
}
