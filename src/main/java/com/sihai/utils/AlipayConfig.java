package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2016101100659789";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDLv4XB9qvbnWz3Ci2Fn96QF+X+FW8qe5kG/izJ6d1oBsk2/tmIMUlhOMcEc+Wg1re6RADyHZJ7/EqQLASsJf4dv/fR1w3/l1Td+FWem60Di4Rp8I7v0T0WtIAfSjp7YNnz4AMUy8vinVI/LWc+mAv22QVpMHidKRgML04tbEicyECKTOt46602wWhLHJ511vm5/34KLx0ttNqOepHY2Yijp4WO44Hq6Ogfa+4hgDNHyKYq29u1P6GqI80WXmwfwWfv6a1K8Tn+JlUvJntziEEOTdk+q40oiCIWpQMW2b6kTI0qW4s+hpUBY8xjgBOz+ijPBp/r4OAaXAAYmyeJk9+/AgMBAAECggEAfeOHVLIBu78ILZeHSvHdhTCO9a/usNQPWCfCKruqBnVy690JMUIqsbxwE0s8zWT9vkP4RaCJ+ruGoo/gDzGmUmFjUK9MweiSElg3JrnPa8pPdVmiJ4Ej+pxqMWseuU69PBbkMHw/LHTB9bErApzVf57V3gmJ7KkQZ67u4dfvAZcLI7YGDyX9SOs3Aj9kYvQMVyaO/CmUvhW/g+lSnr8Wcec5GbRoIVIZcB+UZT1jiNRlWNIJU6osufshHpNWdPrNx0g0pYgix/7fm5wdQhDMjUfh00ByA/EwHiaSLGjTnBoBALYYhFLT9miULmKRwOJzLvaj1d5sIDahcGJhmBKP4QKBgQDp1s4aUaqdxK5yxJ8eC4P+9FutRc7xBQCqH8hrt3BK0XijgE8IGhXrSLhSt8v5xuw4ROOtwohzH9sFNOZWXsCDU/qfNsYox/EIAYYUnLCNrzlMQe0IhTrj890bucpK/nXK/jyECKn/7Zl/mxNx8pNhYLlxwNBOgQJbsNY5gPUk0QKBgQDfDq1+j4LiEpapPxyF8ek6cMEELhVm39BBY+/OCcfwT/gnG2+WaYa4N6gqyuHO6WWnvnXZT1sskRM7bMkvNf+N43sbxilVP8gykMcLCQBpNOJLvHqCgt/ezzR26A6/9+oij4KPwiPeSRaY7r56BLFCT36/KXNyNLRFfExWFf8fjwKBgQCLu1ppi8eCg1cjKa9TitoTbf2iawagK7cb8eYXyAQIEWgfe7q+Qqg6crgCZeYzmdTqQvAykv5qnOyKDfReRDyRvYsTvO1ozSGRASgYBRHTeJOqp/J2lvZ75OuJd9oUOj41UPrkgzDiyB5jjE1wV94N4HiwKuHPJ3Q7Sk6ZCiBzIQKBgDNDllAd/4ChsQqYvJ90J5wMye+B/90y1xQQOc7qpI7wciHaxlyVSCcSc43SLu906K4SsdcNy/CELx1bNSmqiV88xtBtTJaRIBuu9m/s07FaPCAX4zgXiAgXKwGg97La8W6b+O+9OK0fsxfW1uQILA0HZCPfDO9UeZH2rTyjtYy1AoGAQwT0RNM4KWbJfa6VlTqsgZQp2jnhS1y74HJLmPzsPlF5CsUSODwC6vlqMY6/CwahjaERDj0wwPHpntCDGFsdADj9b+MrPjj/vX+HiIwnujL65s1PimBhuiW7XDbWoidKtGQSVSsgbnxhAnsXXtkesb2PJ+gCAnhCHp3/9TULH3s=";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAreljmPnv9+meAV0bSmnemTARoRjkZs6EIyquoY0sS5rRcvAkIDYq5dfD4z8M+9DGAyfHUqoAuumzUjN8juB6Ulh8NMk8i/8gVmZq9HctXSUXbC0kmBJwBn56/YubpTeU0Hc9VkxROZ94htzzebmVRtF7IKgsLSKhIjxYVoh42lmQDG65jz5yzg8PtaiUMuOoE3yb6LudSrFvUCo6a2kT+aJMmvsg8JbHcX8EMEjjYJbOaDTYmQR2j/ZUd2u1JQX1ATkh+awzrGrJrhs5SwKeouKMvferVoaNwNSrpw5A4bay888vDMnoQEiUaKYazWErLZVyV6pJlrhSueppznJz6wIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
