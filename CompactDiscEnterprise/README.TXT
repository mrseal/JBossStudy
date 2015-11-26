An end-2-end enterprise application.

Below are needed to run this application

1. mysql-connector-java-5.1.18-bin.jar must be deployed first

2. A mySQL database

3. datasource must be configured in JBoss
<datasource jta="false" jndi-name="java:/mySQL" pool-name="MySQL" enabled="true" use-ccm="false">
	<connection-url>jdbc:mysql://localhost:3306/mydb</connection-url>
	<driver-class>com.mysql.jdbc.Driver</driver-class>
	<driver>mysql-connector-java-5.1.18-bin.jar</driver>
	<security>
		<user-name>username</user-name>
		<password>password</password>
	</security>
	<validation>
		<validate-on-match>false</validate-on-match>
		<background-validation>false</background-validation>
	</validation>
	<statement>
		<share-prepared-statements>false</share-prepared-statements>
	</statement>
</datasource>


