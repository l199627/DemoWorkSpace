package com.csii.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static MybatisUtil mu=new MybatisUtil();
	private SqlSessionFactory sf;
	private MybatisUtil() {
		InputStream is=MybatisUtil.class.getClassLoader().getResourceAsStream("mybatis.xml");
		sf=new SqlSessionFactoryBuilder().build(is);
	}
	public static MybatisUtil init() {
		return mu;
	}
	public SqlSession getSession() {
		return sf.openSession();
	}
}

