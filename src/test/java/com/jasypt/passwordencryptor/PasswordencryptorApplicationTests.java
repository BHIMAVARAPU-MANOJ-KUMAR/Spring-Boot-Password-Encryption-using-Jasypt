package com.jasypt.passwordencryptor;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;

class PasswordencryptorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testEncryptionKey() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("manojtech"); // encryptor's private key
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        
        String plaintext = "root";
        System.out.println("Encrypted key : " + encryptor.encrypt(plaintext));
        
        String passText = "MAnoj9010@@";
        System.out.println("Encrypted key : " + encryptor.encrypt(passText));
	}
}
