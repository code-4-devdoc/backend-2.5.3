-- 데이터베이스 생성 및 설정
-- CREATE SCHEMA IF NOT EXISTS `testdb` DEFAULT CHARACTER SET utf8mb4;

-- root 사용자 생성 및 권한 부여
-- CREATE USER IF NOT EXISTS 'root'@'%' IDENTIFIED BY 'root';
-- GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;

-- 'testdb' 스키마 선택
-- USE testdb;

-- 데이터베이스 생성 및 설정
CREATE SCHEMA IF NOT EXISTS `testdb`;

-- User 테이블 생성

-- Resume 테이블 생성
CREATE TABLE IF NOT EXISTS RResume (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title TEXT
);

-- Skill 테이블 생성
CREATE TABLE IF NOT EXISTS SSkill (
    id INT AUTO_INCREMENT PRIMARY KEY,
    resume_id INT,
    status BOOLEAN DEFAULT FALSE,
    content TEXT DEFAULT NULL,
    FOREIGN KEY (resume_id) REFERENCES RResume(id) ON DELETE CASCADE
);