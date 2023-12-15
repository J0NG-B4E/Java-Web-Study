package org.zerock.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {

    @Test
    public void testConnection() throws Exception {
        /* JDBC 드라이버 클래스를 메모리 상으로 로딩하는 역할을 한다.
        *  이때 문자열은 패키지명과 클래스명의 대소문자까지 정확히 일치해야 한다.
        *  만일 JDBC 드라이버 파일이 없는 경우에는 이 부분에서 예외가 발생한다.*/
        Class.forName("org.mariadb.jdbc.Driver");

        /* java.sql 패키지의 Connection 인터페이스 타입의 변수.
        *  Connection은 데이터베이스와 네트워크 연결을 의미한다. */
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "webuser"
        );

        Assertions.assertNotNull(connection);

        /* 데이터베이스 연결을 종료한다. */
        connection.close();
    }

    @Test
    public void testHikariCP() throws Exception {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
