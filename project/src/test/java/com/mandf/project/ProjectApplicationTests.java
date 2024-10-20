package com.mandf.project;

import org.assertj.core.api.Assertions;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Test
//	void jasypt(){
//		String url = "jdbc:postgresql://localhost:5432/postgres";
//		String username = "postgres";
//		String password = "1234";
//
//		System.out.println(jasyptEncoding(url));
//		System.out.println(jasyptEncoding(username));
//		System.out.println(jasyptEncoding(password));
//	}
//
//	public String jasyptEncoding(String value) {
//
//		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
//		encryptor.setPassword("tnrlaos_test_pi");
//		encryptor.setAlgorithm("PBEWithMD5AndDES"); //Default
//
//		String encryptedText = encryptor.encrypt(postgres);
//		System.out.println("encryptedText = " + encryptedText);
//
//		String decryptedText = encryptor.decrypt(encryptedText);
//		System.out.println("decryptedText = " + decryptedText);
//
//		Assertions.assertThat(decryptedText).isEqualTo(targetText);
//	}
	@Test
	public void test(){
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword("tnrlaos_test_pi"); // 암호화할 때 사용하는 키
		config.setAlgorithm("PBEWithMD5AndDES"); // 암호화 알고리즘
		config.setKeyObtentionIterations("1000"); // 반복할 해싱 회수
		config.setPoolSize("1"); // 인스턴스 pool
		config.setProviderName("SunJCE");
		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator"); // salt 생성 클래스
		config.setStringOutputType("base64"); //인코딩 방식
		encryptor.setConfig(config);

		String encryptedText1 = encryptor.encrypt("postgres");
		System.out.println("encryptedText user = " + encryptedText1);

		String encryptedText2 = encryptor.encrypt("1234");
		System.out.println("encryptedText pass = " + encryptedText2);


//		Assertions.assertThat(decryptedText).isEqualTo("postgres");
	}

}
