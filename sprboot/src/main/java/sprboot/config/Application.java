package sprboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication //��������� ������� ����������, ��� ��� spring boot ����������
//� ������, ��� ��������� ������ ���� �������� ��� spring boot
@EnableAutoConfiguration//�������� ��������������� � ��� ����� ��������� ��� �� ���������
//�������������� ������� ������������
//�� ������� ����� �������� ���� ������������. ���������� ������� ������ ���� ���������� ������������
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);//������ ����������
	}

}
