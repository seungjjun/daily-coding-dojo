import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberTest {
    @Test
    void solution() {
        MinimumNumber minimumNumber = new MinimumNumber();

        assertEquals(29, minimumNumber.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
}

/*
sql과 nosql에 대해서 알아보자.

일단 sql은 관계형 데이터베이스이고 NoSQL은 비관계형 데이터베이스이다.

SQL(Structured Query Language)은 RDBMS(관계형데이터베이스 관리 시스템)을 조작할 때 사용하는 쿼리 언어이다.
RDBMS는 모든 데이터를 열과 행의 테이블 형태로 관리한다. SQL 문을 사용하여 DB에 데이터를 저장, 업데이트, 제거, 검색을 할 수 있다.


NoSQL(Not Only SQL)이란 RDB 형태의 관계형 데이터베이스가 아닌 다른 방식으로 데이터를 관리한다. RDBMS와 다르게 테이블 간의 관계를 정의하지 않는다.
정해진 스키마가 없기 때문에 자유롭게 데이터를 저장할 수 있다는 특징이 있다.

 */